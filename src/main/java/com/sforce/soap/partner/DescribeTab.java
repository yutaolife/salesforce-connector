package com.sforce.soap.partner;

/**
 * Generated class, please do not edit.
 */
public class DescribeTab implements com.sforce.ws.bind.XMLizable {

  /**
   * Constructor
   */
  public DescribeTab() {
  }
    
  
  /**
   * element  : custom of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo custom__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","custom","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean custom__is_set = false;

  private boolean custom;

  public boolean getCustom() {
    return custom;
  }

  

  public boolean isCustom() {
    return custom;
  }

  

  public void setCustom(boolean custom) {
    this.custom = custom;
    custom__is_set = true;
  }
  
  /**
   * element  : iconUrl of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo iconUrl__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","iconUrl","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean iconUrl__is_set = false;

  private String iconUrl;

  public String getIconUrl() {
    return iconUrl;
  }

  

  public void setIconUrl(String iconUrl) {
    this.iconUrl = iconUrl;
    iconUrl__is_set = true;
  }
  
  /**
   * element  : label of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo label__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","label","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean label__is_set = false;

  private String label;

  public String getLabel() {
    return label;
  }

  

  public void setLabel(String label) {
    this.label = label;
    label__is_set = true;
  }
  
  /**
   * element  : miniIconUrl of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo miniIconUrl__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","miniIconUrl","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean miniIconUrl__is_set = false;

  private String miniIconUrl;

  public String getMiniIconUrl() {
    return miniIconUrl;
  }

  

  public void setMiniIconUrl(String miniIconUrl) {
    this.miniIconUrl = miniIconUrl;
    miniIconUrl__is_set = true;
  }
  
  /**
   * element  : sobjectName of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo sobjectName__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","sobjectName","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean sobjectName__is_set = false;

  private String sobjectName;

  public String getSobjectName() {
    return sobjectName;
  }

  

  public void setSobjectName(String sobjectName) {
    this.sobjectName = sobjectName;
    sobjectName__is_set = true;
  }
  
  /**
   * element  : url of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo url__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","url","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean url__is_set = false;

  private String url;

  public String getUrl() {
    return url;
  }

  

  public void setUrl(String url) {
    this.url = url;
    url__is_set = true;
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
   
    __typeMapper.writeBoolean(__out, custom__typeInfo, custom, custom__is_set);
    __typeMapper.writeString(__out, iconUrl__typeInfo, iconUrl, iconUrl__is_set);
    __typeMapper.writeString(__out, label__typeInfo, label, label__is_set);
    __typeMapper.writeString(__out, miniIconUrl__typeInfo, miniIconUrl, miniIconUrl__is_set);
    __typeMapper.writeString(__out, sobjectName__typeInfo, sobjectName, sobjectName__is_set);
    __typeMapper.writeString(__out, url__typeInfo, url, url__is_set);
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
    if (__typeMapper.verifyElement(__in, custom__typeInfo)) {
      setCustom((boolean)__typeMapper.readBoolean(__in, custom__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, iconUrl__typeInfo)) {
      setIconUrl((String)__typeMapper.readString(__in, iconUrl__typeInfo, String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, label__typeInfo)) {
      setLabel((String)__typeMapper.readString(__in, label__typeInfo, String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, miniIconUrl__typeInfo)) {
      setMiniIconUrl((String)__typeMapper.readString(__in, miniIconUrl__typeInfo, String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, sobjectName__typeInfo)) {
      setSobjectName((String)__typeMapper.readString(__in, sobjectName__typeInfo, String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, url__typeInfo)) {
      setUrl((String)__typeMapper.readString(__in, url__typeInfo, String.class));
    }
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("[DescribeTab ");
    
    sb.append(" custom=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(custom)+"'\n");
    sb.append(" iconUrl=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(iconUrl)+"'\n");
    sb.append(" label=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(label)+"'\n");
    sb.append(" miniIconUrl=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(miniIconUrl)+"'\n");
    sb.append(" sobjectName=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(sobjectName)+"'\n");
    sb.append(" url=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(url)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}