package ru.signalcom.wicketstart;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.link.Link;

public class HomePage extends WebPage{

    public HomePage() {
        super();
        add(new Link<Void>("loginPage") {
            @Override
            public void onClick() {               
                setResponsePage(LoginPage.class);
            }
        });
    }
    
}
