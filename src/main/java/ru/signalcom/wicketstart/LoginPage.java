package ru.signalcom.wicketstart;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;

public class LoginPage extends WebPage {

    private final String loginPageTitleKey = "loginPageTitle";
    private final String loginPageTitleValue = "Login page";

    private final String loginPageNameKey = "loginPageName";
    private final String loginPageNameValue = "Login page";

    private final String sessionTemporaryKey = "sessionTemporary";
    private final String sessionTemporaryValue = "Temporary is ";

    private final String pageStatelessKey = "pageStateless";
    private final String pageStatelessValue = "Page stateless is ";

    private final String pageVersionedKey = "pageVersioned";
    private final String pageVersionedValue = "Page versioned is ";

    public LoginPage() {
        add(new Label(loginPageTitleKey, loginPageTitleValue));
        add(new Label(loginPageNameKey, loginPageNameValue));
//        add(new Label(sessionTemporaryKey, sessionTemporaryValue + getSession().isTemporary()));
//        add(new Label(pageStatelessKey, pageStatelessValue + this.isPageStateless()));
//        add(new Label(pageVersionedKey, pageVersionedValue + this.isVersioned()));
    }

}
