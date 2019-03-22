package ru.signalcom.wicketstart;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.model.Model;
import org.apache.wicket.request.mapper.parameter.PageParameters;

public class LoginPage extends WebPage {
    
    private Label loginStatus;

    public LoginPage(PageParameters pageParameters) {
        super(pageParameters);
        loginStatus = new Label("loginStatus", Model.of(""));
        
        add(loginStatus);
        add(new Label("message", "Please sign"));        
        add(new Form("loginForm") {
            @Override
            protected void onSubmit() {
                loginStatus.setDefaultModelObject("Congratulations!");
            }
            
        });
    }

}
