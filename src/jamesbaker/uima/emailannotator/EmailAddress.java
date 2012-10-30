

/* First created by JCasGen Tue Oct 30 21:32:16 GMT 2012 */
package jamesbaker.uima.emailannotator;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Tue Oct 30 21:32:16 GMT 2012
 * XML source: /Users/james/Documents/Workspaces/UIMA/EmailAnnotator/desc/EmailAnnotatorDescriptor.xml
 * @generated */
public class EmailAddress extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(EmailAddress.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected EmailAddress() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public EmailAddress(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public EmailAddress(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public EmailAddress(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: domain

  /** getter for domain - gets 
   * @generated */
  public String getDomain() {
    if (EmailAddress_Type.featOkTst && ((EmailAddress_Type)jcasType).casFeat_domain == null)
      jcasType.jcas.throwFeatMissing("domain", "jamesbaker.uima.emailannotator.EmailAddress");
    return jcasType.ll_cas.ll_getStringValue(addr, ((EmailAddress_Type)jcasType).casFeatCode_domain);}
    
  /** setter for domain - sets  
   * @generated */
  public void setDomain(String v) {
    if (EmailAddress_Type.featOkTst && ((EmailAddress_Type)jcasType).casFeat_domain == null)
      jcasType.jcas.throwFeatMissing("domain", "jamesbaker.uima.emailannotator.EmailAddress");
    jcasType.ll_cas.ll_setStringValue(addr, ((EmailAddress_Type)jcasType).casFeatCode_domain, v);}    
  }

    