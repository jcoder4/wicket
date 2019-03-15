package ru.signalcom.wicketstart;

import org.apache.wicket.Component;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.link.Link;
import sun.awt.ComponentFactory;

public class HomePage extends WebPage {

    private final String homePageTitleKey = "homePageTitle";
    private final String homePageTitleValue = "Home page";

    private final String homePageNameKey = "homePageName";
    private final String homePageNameValue = "Home page";

    private final String sessionTemporaryKey = "sessionTemporary";
    private final String sessionTemporaryValue = "Temporary is ";
    
    private final String pageStatelessKey = "pageStateless";
    private final String pageStatelessValue = "Page stateless is ";
    
    private final String pageVersionedKey = "pageVersioned";
    private final String pageVersionedValue = "Page versioned is ";

    public HomePage() {
        add(new Label(homePageTitleKey, homePageTitleValue));
        add(new Label(homePageNameKey, homePageNameValue));
        add(new Label(sessionTemporaryKey, sessionTemporaryValue + getSession().isTemporary()));
        add(new Label(pageStatelessKey, pageStatelessValue + this.isPageStateless()));
        add(new Label(pageVersionedKey, pageVersionedValue + this.isVersioned()));

        add(new Link<Void>("loginpage") {
            @Override
            public void onClick() {
                SimpleLoginPage loginPage = new SimpleLoginPage();
                setResponsePage(loginPage);
            }
        });
        
         
    }

}
