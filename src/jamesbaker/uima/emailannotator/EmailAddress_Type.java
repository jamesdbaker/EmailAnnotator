
/* First created by JCasGen Tue Oct 30 21:32:16 GMT 2012 */
package jamesbaker.uima.emailannotator;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Tue Oct 30 21:32:16 GMT 2012
 * @generated */
public class EmailAddress_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (EmailAddress_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = EmailAddress_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new EmailAddress(addr, EmailAddress_Type.this);
  			   EmailAddress_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new EmailAddress(addr, EmailAddress_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = EmailAddress.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("jamesbaker.uima.emailannotator.EmailAddress");
 
  /** @generated */
  final Feature casFeat_domain;
  /** @generated */
  final int     casFeatCode_domain;
  /** @generated */ 
  public String getDomain(int addr) {
        if (featOkTst && casFeat_domain == null)
      jcas.throwFeatMissing("domain", "jamesbaker.uima.emailannotator.EmailAddress");
    return ll_cas.ll_getStringValue(addr, casFeatCode_domain);
  }
  /** @generated */    
  public void setDomain(int addr, String v) {
        if (featOkTst && casFeat_domain == null)
      jcas.throwFeatMissing("domain", "jamesbaker.uima.emailannotator.EmailAddress");
    ll_cas.ll_setStringValue(addr, casFeatCode_domain, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public EmailAddress_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_domain = jcas.getRequiredFeatureDE(casType, "domain", "uima.cas.String", featOkTst);
    casFeatCode_domain  = (null == casFeat_domain) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_domain).getCode();

  }
}



    