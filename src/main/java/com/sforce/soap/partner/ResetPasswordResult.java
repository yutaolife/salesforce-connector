package com.sforce.soap.partner;

/**
 * Generated class, please do not edit.
 */
public class ResetPasswordResult implements com.sforce.ws.bind.XMLizable {

  /**
   * Constructor
   */
  public ResetPasswordResult() {
  }
    
  
  /**
   * element  : password of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo password__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","password","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean password__is_set = false;

  private String password;

  public String getPassword() {
    return password;
  }

  

  public void setPassword(String password) {
    this.password = password;
    password__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   
    __typeMapper.writeString(__out, password__typeInfo, password, password__is_set);
  }


  public void load(com.sforce.ws.parser.XmlInputStream __in,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
    __typeMapper.consumeStartTag(__in);
    loadFields(__in, __typeMapper);
    __typeMapper.consumeEndTag(__in);
  }

  protected void loadFields(com.sforce.ws.parser.XmlInputStream __in,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
   
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, password__typeInfo)) {
      setPassword((String)__typeMapper.readString(__in, password__typeInfo, String.class));
    }
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("[ResetPasswordResult ");
    
    sb.append(" password=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(password)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}