package ru.signalcom.wicketstart;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.request.mapper.parameter.PageParameters;

public class HomePage extends WebPage{

    public HomePage(PageParameters pageParameters) {
        super(pageParameters);
        
        add(new Link<Void>("loginPage") {
            @Override
            public void onClick() {               
                setResponsePage(LoginPage.class);
            }
        });
        
        add(new Link<Void>("loginPage2") {
            @Override
            public void onClick() {               
                setResponsePage(LoginPage2.class);
            }
        });
        
        add(new Link<Void>("testPage") {
            @Override
            public void onClick() {               
                setResponsePage(TestPage.class);
            }
        });
    }
    
}
