package ru.signalcom.wicketstart;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.PropertyModel;

public class HomePage extends WebPage {
    
    private final String messageForm1 = "1st messgae";
    private final String messageForm2 = "2nd message";

    public HomePage() {
        PropertyModel<String> messageModel1 = new PropertyModel<>(this, "messageForm1");
        PropertyModel<String> messageModel2 = new PropertyModel<>(this, "messageForm2");
        
        add(new Label("messageGreeting", "Wicket form testing"));
        add(new Label("messageForm1", messageModel1));
        add(new Label("messageForm2", messageModel2));
        add(new Label("messageForm3", messageModel1));
        
        Form<?> form = new Form("form");
        form.add(new TextField("messageInput", messageModel1));
        add(form);
    }
    
}
