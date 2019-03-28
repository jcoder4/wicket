package ru.signalcom.wicketstart;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;
import org.apache.wicket.model.PropertyModel;

public class TestPage extends WebPage {

    public TestPage() {
        String name = "Jane";
        String defaultName = "Unknown";
        
        IModel<String> nameModel = Model.of(name).filter(p -> p.equals("John")).orElse(defaultName);
        add(new Label("nameModel", nameModel));
        
        add(new Label("timeStamp", () -> java.time.LocalTime.now()));
        
        Person person = new Person();
        person.setName("Vadim");
        Label labelPropertyModel = new Label("labelPropertyModel", new PropertyModel(person, "name"));
        add(labelPropertyModel);
    }
    
}
