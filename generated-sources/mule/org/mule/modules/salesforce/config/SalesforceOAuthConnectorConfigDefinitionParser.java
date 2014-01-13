
package org.mule.modules.salesforce.config;

import javax.annotation.Generated;
import org.mule.modules.salesforce.oauth.SalesforceOAuthConnectorOAuthManager;
import org.mule.security.oauth.config.AbstractDevkitBasedDefinitionParser;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.RuntimeBeanReference;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.ParserContext;
import org.springframework.util.xml.DomUtils;
import org.w3c.dom.Element;

@Generated(value = "Mule DevKit Version 3.5.0-cascade", date = "2014-01-13T03:30:10-06:00", comments = "Build UNNAMED.1791.ad9d188")
public class SalesforceOAuthConnectorConfigDefinitionParser
    extends AbstractDevkitBasedDefinitionParser
{


    public BeanDefinition parse(Element element, ParserContext parserContext) {
        parseConfigName(element);
        BeanDefinitionBuilder builder = BeanDefinitionBuilder.rootBeanDefinition(SalesforceOAuthConnectorOAuthManager.class.getName());
        builder.setScope(BeanDefinition.SCOPE_SINGLETON);
        setInitMethodIfNeeded(builder, SalesforceOAuthConnectorOAuthManager.class);
        setDestroyMethodIfNeeded(builder, SalesforceOAuthConnectorOAuthManager.class);
        parseProperty(builder, element, "consumerKey", "consumerKey");
        parseProperty(builder, element, "consumerSecret", "consumerSecret");
        if (hasAttribute(element, "timeObjectStore-ref")) {
            if (element.getAttribute("timeObjectStore-ref").startsWith("#")) {
                builder.addPropertyValue("timeObjectStore", element.getAttribute("timeObjectStore-ref"));
            } else {
                builder.addPropertyValue("timeObjectStore", new RuntimeBeanReference(element.getAttribute("timeObjectStore-ref")));
            }
        }
        parseProperty(builder, element, "clientId", "clientId");
        parseProperty(builder, element, "assignmentRuleId", "assignmentRuleId");
        parseProperty(builder, element, "useDefaultRule", "useDefaultRule");
        parseProperty(builder, element, "batchSobjectMaxDepth", "batchSobjectMaxDepth");
        parseProperty(builder, element, "allowFieldTruncationSupport", "allowFieldTruncationSupport");
        parseProperty(builder, element, "name", "name");
        parseProperty(builder, element, "authorizationUrl");
        parseProperty(builder, element, "accessTokenUrl");
        parseProperty(builder, element, "onNoToken");
        Element httpCallbackConfigElement = DomUtils.getChildElementByTagName(element, "oauth-callback-config");
        if (httpCallbackConfigElement!= null) {
            parseProperty(builder, httpCallbackConfigElement, "domain");
            parseProperty(builder, httpCallbackConfigElement, "localPort");
            parseProperty(builder, httpCallbackConfigElement, "remotePort");
            parseProperty(builder, httpCallbackConfigElement, "async");
            parseProperty(builder, httpCallbackConfigElement, "path");
            parseProperty(builder, httpCallbackConfigElement, "defaultAccessTokenId");
            if (hasAttribute(httpCallbackConfigElement, "connector-ref")) {
                builder.addPropertyValue("connector", new RuntimeBeanReference(httpCallbackConfigElement.getAttribute("connector-ref")));
            }
        }
        Element oauthStoreConfigElement = DomUtils.getChildElementByTagName(element, "oauth-store-config");
        if (oauthStoreConfigElement!= null) {
            parsePropertyRef(builder, oauthStoreConfigElement, "objectStore-ref", "accessTokenObjectStore");
        }
        BeanDefinition definition = builder.getBeanDefinition();
        setNoRecurseOnDefinition(definition);
        return definition;
    }

}
