package ru.signalcom.wicketstart;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.request.mapper.parameter.PageParameters;

public class LoginPage extends WebPage {

    public LoginPage(PageParameters pageParameters) {
        super(pageParameters);
        add(new LoginForm("loginForm"));
    }

}
