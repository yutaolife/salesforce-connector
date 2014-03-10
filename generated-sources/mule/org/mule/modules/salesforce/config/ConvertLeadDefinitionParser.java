
package org.mule.modules.salesforce.config;

import javax.annotation.Generated;
import org.mule.config.MuleManifest;
import org.mule.modules.salesforce.processors.ConvertLeadMessageProcessor;
import org.mule.security.oauth.config.AbstractDevkitBasedDefinitionParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.parsing.BeanDefinitionParsingException;
import org.springframework.beans.factory.parsing.Location;
import org.springframework.beans.factory.parsing.Problem;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Element;

@Generated(value = "Mule DevKit Version 3.5.0-M4", date = "2014-03-10T01:07:10-05:00", comments = "Build M4.1875.17b58a3")
public class ConvertLeadDefinitionParser
    extends AbstractDevkitBasedDefinitionParser
{

    private static Logger logger = LoggerFactory.getLogger(ConvertLeadDefinitionParser.class);

    private BeanDefinitionBuilder getBeanDefinitionBuilder(ParserContext parserContext) {
        try {
            return BeanDefinitionBuilder.rootBeanDefinition(ConvertLeadMessageProcessor.class.getName());
        } catch (NoClassDefFoundError noClassDefFoundError) {
            String muleVersion = "";
            try {
                muleVersion = MuleManifest.getProductVersion();
            } catch (Exception _x) {
                logger.error("Problem while reading mule version");
            }
            logger.error(("Cannot launch the mule app, the @Processor [convert-lead] within the connector [sfdc] is not supported in mule "+ muleVersion));
            throw new BeanDefinitionParsingException(new Problem(("Cannot launch the mule app, the @Processor [convert-lead] within the connector [sfdc] is not supported in mule "+ muleVersion), new Location(parserContext.getReaderContext().getResource()), null, noClassDefFoundError));
        }
    }

    public BeanDefinition parse(Element element, ParserContext parserContext) {
        BeanDefinitionBuilder builder = getBeanDefinitionBuilder(parserContext);
        builder.addConstructorArgValue("convertLead");
        builder.setScope(BeanDefinition.SCOPE_PROTOTYPE);
        parseConfigRef(element, builder);
        parseProperty(builder, element, "leadId", "leadId");
        parseProperty(builder, element, "contactId", "contactId");
        parseProperty(builder, element, "accountId", "accountId");
        parseProperty(builder, element, "overWriteLeadSource", "overWriteLeadSource");
        parseProperty(builder, element, "doNotCreateOpportunity", "doNotCreateOpportunity");
        parseProperty(builder, element, "opportunityName", "opportunityName");
        parseProperty(builder, element, "convertedStatus", "convertedStatus");
        parseProperty(builder, element, "sendEmailToOwner", "sendEmailToOwner");
        parseProperty(builder, element, "username", "username");
        parseProperty(builder, element, "password", "password");
        parseProperty(builder, element, "securityToken", "securityToken");
        parseProperty(builder, element, "url", "url");
        parseProperty(builder, element, "proxyHost", "proxyHost");
        parseProperty(builder, element, "proxyPort", "proxyPort");
        parseProperty(builder, element, "proxyUsername", "proxyUsername");
        parseProperty(builder, element, "proxyPassword", "proxyPassword");
        parseProperty(builder, element, "sessionId", "sessionId");
        parseProperty(builder, element, "serviceEndpoint", "serviceEndpoint");
        parseProperty(builder, element, "accessTokenId");
        BeanDefinition definition = builder.getBeanDefinition();
        setNoRecurseOnDefinition(definition);
        attachProcessorDefinition(parserContext, definition);
        return definition;
    }

}