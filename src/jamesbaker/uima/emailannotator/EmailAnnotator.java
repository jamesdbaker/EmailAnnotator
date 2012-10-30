package jamesbaker.uima.emailannotator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.jcas.JCas;

public class EmailAnnotator extends JCasAnnotator_ImplBase {
	private Pattern emailRegex = Pattern.compile("[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@([A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,}))", Pattern.CASE_INSENSITIVE);
	
	@Override
	public void process(JCas aJCas) throws AnalysisEngineProcessException {
		String docText = aJCas.getDocumentText();
		
		Matcher matcher = emailRegex.matcher(docText);
		while(matcher.find()){
			EmailAddress eml = new EmailAddress(aJCas);
			
			eml.setBegin(matcher.start());
			eml.setEnd(matcher.end());
			
			eml.setDomain(matcher.group(2));
			
			eml.addToIndexes();
		}
	}

}
