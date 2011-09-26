package com.sforce.soap.partner;

/**
 * Generated class, please do not edit.
 */
public class CallOptions_element extends com.sforce.ws.bind.SoapHeaderObject implements com.sforce.ws.bind.XMLizable {

  /**
   * Constructor
   */
  public CallOptions_element() {
  }
    
  
  /**
   * element  : client of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo client__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","client","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean client__is_set = false;

  private String client;

  public String getClient() {
    return client;
  }

  

  public void setClient(String client) {
    this.client = client;
    client__is_set = true;
  }
  
  /**
   * element  : defaultNamespace of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo defaultNamespace__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","defaultNamespace","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean defaultNamespace__is_set = false;

  private String defaultNamespace;

  public String getDefaultNamespace() {
    return defaultNamespace;
  }

  

  public void setDefaultNamespace(String defaultNamespace) {
    this.defaultNamespace = defaultNamespace;
    defaultNamespace__is_set = true;
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
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeString(__out, client__typeInfo, client, client__is_set);
    __typeMapper.writeString(__out, defaultNamespace__typeInfo, defaultNamespace, defaultNamespace__is_set);
  }


  public void load(com.sforce.ws.parser.XmlInputStream __in,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
    __typeMapper.consumeStartTag(__in);
    loadFields(__in, __typeMapper);
    __typeMapper.consumeEndTag(__in);
  }

  protected void loadFields(com.sforce.ws.parser.XmlInputStream __in,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
   super.loadFields(__in, __typeMapper);
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, client__typeInfo)) {
      setClient((String)__typeMapper.readString(__in, client__typeInfo, String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, defaultNamespace__typeInfo)) {
      setDefaultNamespace((String)__typeMapper.readString(__in, defaultNamespace__typeInfo, String.class));
    }
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("[CallOptions_element ");
    sb.append(super.toString());
    sb.append(" client=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(client)+"'\n");
    sb.append(" defaultNamespace=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(defaultNamespace)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}