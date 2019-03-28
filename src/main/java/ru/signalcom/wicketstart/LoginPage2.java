package ru.signalcom.wicketstart;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.PasswordTextField;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.request.mapper.parameter.PageParameters;

public class LoginPage2 extends WebPage {

    private String username;
    private String password;
    private String loginStatus;

    public LoginPage2(PageParameters pageParameters) {
        super(pageParameters);

        setDefaultModel(new CompoundPropertyModel<>(this));

        Form<Void> form = new Form<Void>("form") {
            @Override
            protected void onSubmit() {
                if (username.equals("test") && password.equals("test")) {
                    loginStatus = "Congratulations!";
                } else {
                    loginStatus = "Wrong username or password !";
                }
            }
        };
        add(form);
        form.add(new Label("loginStatus"));
        form.add(new TextField("username"));
        form.add(new PasswordTextField("password"));
    }

}
