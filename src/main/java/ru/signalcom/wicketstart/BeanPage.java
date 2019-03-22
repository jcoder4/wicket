package ru.signalcom.wicketstart;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.model.PropertyModel;

public class BeanPage extends WebPage {

    private Person person;
    
    public BeanPage() {
        person = new Person("Jane");
        
        Label labelName = new Label("personName", new PropertyModel(person, "name"));
        add(labelName);
        
        add(new Link<Void>("rename") {
            @Override
            public void onClick() {
                person.setName("New Jane");
            }
        });
    }
    
}
