package com.sforce.soap.partner;

/**
 * Generated class, please do not edit.
 */
public class DescribeSObjectResult implements com.sforce.ws.bind.XMLizable {

  /**
   * Constructor
   */
  public DescribeSObjectResult() {
  }
    
  
  /**
   * element  : activateable of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo activateable__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","activateable","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean activateable__is_set = false;

  private boolean activateable;

  public boolean getActivateable() {
    return activateable;
  }

  

  public boolean isActivateable() {
    return activateable;
  }

  

  public void setActivateable(boolean activateable) {
    this.activateable = activateable;
    activateable__is_set = true;
  }
  
  /**
   * element  : childRelationships of type {urn:partner.soap.sforce.com}ChildRelationship
   * java type: com.sforce.soap.partner.ChildRelationship[]
   */
  private static final com.sforce.ws.bind.TypeInfo childRelationships__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","childRelationships","urn:partner.soap.sforce.com","ChildRelationship",0,-1,true);

  private boolean childRelationships__is_set = false;

  private ChildRelationship[] childRelationships = new ChildRelationship[0];

  public ChildRelationship[] getChildRelationships() {
    return childRelationships;
  }

  

  public void setChildRelationships(ChildRelationship[] childRelationships) {
    this.childRelationships = childRelationships;
    childRelationships__is_set = true;
  }
  
  /**
   * element  : createable of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo createable__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","createable","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean createable__is_set = false;

  private boolean createable;

  public boolean getCreateable() {
    return createable;
  }

  

  public boolean isCreateable() {
    return createable;
  }

  

  public void setCreateable(boolean createable) {
    this.createable = createable;
    createable__is_set = true;
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
   * element  : customSetting of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo customSetting__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","customSetting","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean customSetting__is_set = false;

  private boolean customSetting;

  public boolean getCustomSetting() {
    return customSetting;
  }

  

  public boolean isCustomSetting() {
    return customSetting;
  }

  

  public void setCustomSetting(boolean customSetting) {
    this.customSetting = customSetting;
    customSetting__is_set = true;
  }
  
  /**
   * element  : deletable of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo deletable__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","deletable","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean deletable__is_set = false;

  private boolean deletable;

  public boolean getDeletable() {
    return deletable;
  }

  

  public boolean isDeletable() {
    return deletable;
  }

  

  public void setDeletable(boolean deletable) {
    this.deletable = deletable;
    deletable__is_set = true;
  }
  
  /**
   * element  : deprecatedAndHidden of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo deprecatedAndHidden__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","deprecatedAndHidden","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean deprecatedAndHidden__is_set = false;

  private boolean deprecatedAndHidden;

  public boolean getDeprecatedAndHidden() {
    return deprecatedAndHidden;
  }

  

  public boolean isDeprecatedAndHidden() {
    return deprecatedAndHidden;
  }

  

  public void setDeprecatedAndHidden(boolean deprecatedAndHidden) {
    this.deprecatedAndHidden = deprecatedAndHidden;
    deprecatedAndHidden__is_set = true;
  }
  
  /**
   * element  : feedEnabled of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo feedEnabled__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","feedEnabled","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean feedEnabled__is_set = false;

  private boolean feedEnabled;

  public boolean getFeedEnabled() {
    return feedEnabled;
  }

  

  public boolean isFeedEnabled() {
    return feedEnabled;
  }

  

  public void setFeedEnabled(boolean feedEnabled) {
    this.feedEnabled = feedEnabled;
    feedEnabled__is_set = true;
  }
  
  /**
   * element  : fields of type {urn:partner.soap.sforce.com}Field
   * java type: com.sforce.soap.partner.Field[]
   */
  private static final com.sforce.ws.bind.TypeInfo fields__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","fields","urn:partner.soap.sforce.com","Field",0,-1,true);

  private boolean fields__is_set = false;

  private com.sforce.soap.partner.Field[] fields = new com.sforce.soap.partner.Field[0];

  public com.sforce.soap.partner.Field[] getFields() {
    return fields;
  }

  

  public void setFields(com.sforce.soap.partner.Field[] fields) {
    this.fields = fields;
    fields__is_set = true;
  }
  
  /**
   * element  : keyPrefix of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo keyPrefix__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","keyPrefix","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean keyPrefix__is_set = false;

  private String keyPrefix;

  public String getKeyPrefix() {
    return keyPrefix;
  }

  

  public void setKeyPrefix(String keyPrefix) {
    this.keyPrefix = keyPrefix;
    keyPrefix__is_set = true;
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
   * element  : labelPlural of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo labelPlural__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","labelPlural","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean labelPlural__is_set = false;

  private String labelPlural;

  public String getLabelPlural() {
    return labelPlural;
  }

  

  public void setLabelPlural(String labelPlural) {
    this.labelPlural = labelPlural;
    labelPlural__is_set = true;
  }
  
  /**
   * element  : layoutable of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo layoutable__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","layoutable","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean layoutable__is_set = false;

  private boolean layoutable;

  public boolean getLayoutable() {
    return layoutable;
  }

  

  public boolean isLayoutable() {
    return layoutable;
  }

  

  public void setLayoutable(boolean layoutable) {
    this.layoutable = layoutable;
    layoutable__is_set = true;
  }
  
  /**
   * element  : mergeable of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo mergeable__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","mergeable","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean mergeable__is_set = false;

  private boolean mergeable;

  public boolean getMergeable() {
    return mergeable;
  }

  

  public boolean isMergeable() {
    return mergeable;
  }

  

  public void setMergeable(boolean mergeable) {
    this.mergeable = mergeable;
    mergeable__is_set = true;
  }
  
  /**
   * element  : name of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo name__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","name","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean name__is_set = false;

  private String name;

  public String getName() {
    return name;
  }

  

  public void setName(String name) {
    this.name = name;
    name__is_set = true;
  }
  
  /**
   * element  : queryable of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo queryable__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","queryable","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean queryable__is_set = false;

  private boolean queryable;

  public boolean getQueryable() {
    return queryable;
  }

  

  public boolean isQueryable() {
    return queryable;
  }

  

  public void setQueryable(boolean queryable) {
    this.queryable = queryable;
    queryable__is_set = true;
  }
  
  /**
   * element  : recordTypeInfos of type {urn:partner.soap.sforce.com}RecordTypeInfo
   * java type: com.sforce.soap.partner.RecordTypeInfo[]
   */
  private static final com.sforce.ws.bind.TypeInfo recordTypeInfos__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","recordTypeInfos","urn:partner.soap.sforce.com","RecordTypeInfo",0,-1,true);

  private boolean recordTypeInfos__is_set = false;

  private com.sforce.soap.partner.RecordTypeInfo[] recordTypeInfos = new com.sforce.soap.partner.RecordTypeInfo[0];

  public com.sforce.soap.partner.RecordTypeInfo[] getRecordTypeInfos() {
    return recordTypeInfos;
  }

  

  public void setRecordTypeInfos(com.sforce.soap.partner.RecordTypeInfo[] recordTypeInfos) {
    this.recordTypeInfos = recordTypeInfos;
    recordTypeInfos__is_set = true;
  }
  
  /**
   * element  : replicateable of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo replicateable__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","replicateable","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean replicateable__is_set = false;

  private boolean replicateable;

  public boolean getReplicateable() {
    return replicateable;
  }

  

  public boolean isReplicateable() {
    return replicateable;
  }

  

  public void setReplicateable(boolean replicateable) {
    this.replicateable = replicateable;
    replicateable__is_set = true;
  }
  
  /**
   * element  : retrieveable of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo retrieveable__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","retrieveable","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean retrieveable__is_set = false;

  private boolean retrieveable;

  public boolean getRetrieveable() {
    return retrieveable;
  }

  

  public boolean isRetrieveable() {
    return retrieveable;
  }

  

  public void setRetrieveable(boolean retrieveable) {
    this.retrieveable = retrieveable;
    retrieveable__is_set = true;
  }
  
  /**
   * element  : searchable of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo searchable__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","searchable","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean searchable__is_set = false;

  private boolean searchable;

  public boolean getSearchable() {
    return searchable;
  }

  

  public boolean isSearchable() {
    return searchable;
  }

  

  public void setSearchable(boolean searchable) {
    this.searchable = searchable;
    searchable__is_set = true;
  }
  
  /**
   * element  : triggerable of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo triggerable__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","triggerable","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean triggerable__is_set = false;

  private boolean triggerable;

  public boolean getTriggerable() {
    return triggerable;
  }

  

  public boolean isTriggerable() {
    return triggerable;
  }

  

  public void setTriggerable(boolean triggerable) {
    this.triggerable = triggerable;
    triggerable__is_set = true;
  }
  
  /**
   * element  : undeletable of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo undeletable__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","undeletable","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean undeletable__is_set = false;

  private boolean undeletable;

  public boolean getUndeletable() {
    return undeletable;
  }

  

  public boolean isUndeletable() {
    return undeletable;
  }

  

  public void setUndeletable(boolean undeletable) {
    this.undeletable = undeletable;
    undeletable__is_set = true;
  }
  
  /**
   * element  : updateable of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo updateable__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","updateable","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean updateable__is_set = false;

  private boolean updateable;

  public boolean getUpdateable() {
    return updateable;
  }

  

  public boolean isUpdateable() {
    return updateable;
  }

  

  public void setUpdateable(boolean updateable) {
    this.updateable = updateable;
    updateable__is_set = true;
  }
  
  /**
   * element  : urlDetail of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo urlDetail__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","urlDetail","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean urlDetail__is_set = false;

  private String urlDetail;

  public String getUrlDetail() {
    return urlDetail;
  }

  

  public void setUrlDetail(String urlDetail) {
    this.urlDetail = urlDetail;
    urlDetail__is_set = true;
  }
  
  /**
   * element  : urlEdit of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo urlEdit__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","urlEdit","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean urlEdit__is_set = false;

  private String urlEdit;

  public String getUrlEdit() {
    return urlEdit;
  }

  

  public void setUrlEdit(String urlEdit) {
    this.urlEdit = urlEdit;
    urlEdit__is_set = true;
  }
  
  /**
   * element  : urlNew of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo urlNew__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","urlNew","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean urlNew__is_set = false;

  private String urlNew;

  public String getUrlNew() {
    return urlNew;
  }

  

  public void setUrlNew(String urlNew) {
    this.urlNew = urlNew;
    urlNew__is_set = true;
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
   
    __typeMapper.writeBoolean(__out, activateable__typeInfo, activateable, activateable__is_set);
    __typeMapper.writeObject(__out, childRelationships__typeInfo, childRelationships, childRelationships__is_set);
    __typeMapper.writeBoolean(__out, createable__typeInfo, createable, createable__is_set);
    __typeMapper.writeBoolean(__out, custom__typeInfo, custom, custom__is_set);
    __typeMapper.writeBoolean(__out, customSetting__typeInfo, customSetting, customSetting__is_set);
    __typeMapper.writeBoolean(__out, deletable__typeInfo, deletable, deletable__is_set);
    __typeMapper.writeBoolean(__out, deprecatedAndHidden__typeInfo, deprecatedAndHidden, deprecatedAndHidden__is_set);
    __typeMapper.writeBoolean(__out, feedEnabled__typeInfo, feedEnabled, feedEnabled__is_set);
    __typeMapper.writeObject(__out, fields__typeInfo, fields, fields__is_set);
    __typeMapper.writeString(__out, keyPrefix__typeInfo, keyPrefix, keyPrefix__is_set);
    __typeMapper.writeString(__out, label__typeInfo, label, label__is_set);
    __typeMapper.writeString(__out, labelPlural__typeInfo, labelPlural, labelPlural__is_set);
    __typeMapper.writeBoolean(__out, layoutable__typeInfo, layoutable, layoutable__is_set);
    __typeMapper.writeBoolean(__out, mergeable__typeInfo, mergeable, mergeable__is_set);
    __typeMapper.writeString(__out, name__typeInfo, name, name__is_set);
    __typeMapper.writeBoolean(__out, queryable__typeInfo, queryable, queryable__is_set);
    __typeMapper.writeObject(__out, recordTypeInfos__typeInfo, recordTypeInfos, recordTypeInfos__is_set);
    __typeMapper.writeBoolean(__out, replicateable__typeInfo, replicateable, replicateable__is_set);
    __typeMapper.writeBoolean(__out, retrieveable__typeInfo, retrieveable, retrieveable__is_set);
    __typeMapper.writeBoolean(__out, searchable__typeInfo, searchable, searchable__is_set);
    __typeMapper.writeBoolean(__out, triggerable__typeInfo, triggerable, triggerable__is_set);
    __typeMapper.writeBoolean(__out, undeletable__typeInfo, undeletable, undeletable__is_set);
    __typeMapper.writeBoolean(__out, updateable__typeInfo, updateable, updateable__is_set);
    __typeMapper.writeString(__out, urlDetail__typeInfo, urlDetail, urlDetail__is_set);
    __typeMapper.writeString(__out, urlEdit__typeInfo, urlEdit, urlEdit__is_set);
    __typeMapper.writeString(__out, urlNew__typeInfo, urlNew, urlNew__is_set);
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
    if (__typeMapper.verifyElement(__in, activateable__typeInfo)) {
      setActivateable((boolean)__typeMapper.readBoolean(__in, activateable__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, childRelationships__typeInfo)) {
      setChildRelationships((ChildRelationship[])__typeMapper.readObject(__in, childRelationships__typeInfo, ChildRelationship[].class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, createable__typeInfo)) {
      setCreateable((boolean)__typeMapper.readBoolean(__in, createable__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, custom__typeInfo)) {
      setCustom((boolean)__typeMapper.readBoolean(__in, custom__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, customSetting__typeInfo)) {
      setCustomSetting((boolean)__typeMapper.readBoolean(__in, customSetting__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, deletable__typeInfo)) {
      setDeletable((boolean)__typeMapper.readBoolean(__in, deletable__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, deprecatedAndHidden__typeInfo)) {
      setDeprecatedAndHidden((boolean)__typeMapper.readBoolean(__in, deprecatedAndHidden__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, feedEnabled__typeInfo)) {
      setFeedEnabled((boolean)__typeMapper.readBoolean(__in, feedEnabled__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, fields__typeInfo)) {
      setFields((com.sforce.soap.partner.Field[])__typeMapper.readObject(__in, fields__typeInfo, com.sforce.soap.partner.Field[].class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, keyPrefix__typeInfo)) {
      setKeyPrefix((String)__typeMapper.readString(__in, keyPrefix__typeInfo, String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, label__typeInfo)) {
      setLabel((String)__typeMapper.readString(__in, label__typeInfo, String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, labelPlural__typeInfo)) {
      setLabelPlural((String)__typeMapper.readString(__in, labelPlural__typeInfo, String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, layoutable__typeInfo)) {
      setLayoutable((boolean)__typeMapper.readBoolean(__in, layoutable__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, mergeable__typeInfo)) {
      setMergeable((boolean)__typeMapper.readBoolean(__in, mergeable__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, name__typeInfo)) {
      setName((String)__typeMapper.readString(__in, name__typeInfo, String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, queryable__typeInfo)) {
      setQueryable((boolean)__typeMapper.readBoolean(__in, queryable__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, recordTypeInfos__typeInfo)) {
      setRecordTypeInfos((com.sforce.soap.partner.RecordTypeInfo[])__typeMapper.readObject(__in, recordTypeInfos__typeInfo, com.sforce.soap.partner.RecordTypeInfo[].class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, replicateable__typeInfo)) {
      setReplicateable((boolean)__typeMapper.readBoolean(__in, replicateable__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, retrieveable__typeInfo)) {
      setRetrieveable((boolean)__typeMapper.readBoolean(__in, retrieveable__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, searchable__typeInfo)) {
      setSearchable((boolean)__typeMapper.readBoolean(__in, searchable__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, triggerable__typeInfo)) {
      setTriggerable((boolean)__typeMapper.readBoolean(__in, triggerable__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, undeletable__typeInfo)) {
      setUndeletable((boolean)__typeMapper.readBoolean(__in, undeletable__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, updateable__typeInfo)) {
      setUpdateable((boolean)__typeMapper.readBoolean(__in, updateable__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, urlDetail__typeInfo)) {
      setUrlDetail((String)__typeMapper.readString(__in, urlDetail__typeInfo, String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, urlEdit__typeInfo)) {
      setUrlEdit((String)__typeMapper.readString(__in, urlEdit__typeInfo, String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, urlNew__typeInfo)) {
      setUrlNew((String)__typeMapper.readString(__in, urlNew__typeInfo, String.class));
    }
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("[DescribeSObjectResult ");
    
    sb.append(" activateable=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(activateable)+"'\n");
    sb.append(" childRelationships=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(childRelationships)+"'\n");
    sb.append(" createable=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(createable)+"'\n");
    sb.append(" custom=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(custom)+"'\n");
    sb.append(" customSetting=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(customSetting)+"'\n");
    sb.append(" deletable=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(deletable)+"'\n");
    sb.append(" deprecatedAndHidden=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(deprecatedAndHidden)+"'\n");
    sb.append(" feedEnabled=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(feedEnabled)+"'\n");
    sb.append(" fields=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(fields)+"'\n");
    sb.append(" keyPrefix=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(keyPrefix)+"'\n");
    sb.append(" label=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(label)+"'\n");
    sb.append(" labelPlural=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(labelPlural)+"'\n");
    sb.append(" layoutable=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(layoutable)+"'\n");
    sb.append(" mergeable=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(mergeable)+"'\n");
    sb.append(" name=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(name)+"'\n");
    sb.append(" queryable=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(queryable)+"'\n");
    sb.append(" recordTypeInfos=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(recordTypeInfos)+"'\n");
    sb.append(" replicateable=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(replicateable)+"'\n");
    sb.append(" retrieveable=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(retrieveable)+"'\n");
    sb.append(" searchable=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(searchable)+"'\n");
    sb.append(" triggerable=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(triggerable)+"'\n");
    sb.append(" undeletable=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(undeletable)+"'\n");
    sb.append(" updateable=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(updateable)+"'\n");
    sb.append(" urlDetail=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(urlDetail)+"'\n");
    sb.append(" urlEdit=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(urlEdit)+"'\n");
    sb.append(" urlNew=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(urlNew)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}