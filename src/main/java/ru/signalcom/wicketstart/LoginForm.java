package ru.signalcom.wicketstart;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.PasswordTextField;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.CompoundPropertyModel;

public class LoginForm extends Form {

    private String username;
    private String password;
    private String loginStatus;

    public LoginForm(String id) {
        super(id);
        setDefaultModel(new CompoundPropertyModel<>(this));

        add(new TextField("username"));
        add(new PasswordTextField("password"));
        add(new Label("loginStatus"));
    }

    @Override
    public final void onSubmit() {
        if (username.equals("test") && password.equals("test")) {
            loginStatus = "Congratulations!";
        } else {
            loginStatus = "Wrong username or password !";
        }
    }

}
