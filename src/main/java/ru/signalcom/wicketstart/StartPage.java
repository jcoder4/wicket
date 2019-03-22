package ru.signalcom.wicketstart;

import org.apache.wicket.Page;
import org.apache.wicket.PageReference;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.model.Model;
import org.apache.wicket.model.PropertyModel;

public class StartPage extends WebPage {

    public static final Long serialVersionUID = 1L;

    private final Label labelFirst;
    private final Label labelSecond;

    public StartPage() {
//        Person person = new Person("Jane");
//        
//        Label label = new Label("personName", new Model(person.getName()));
//        add(label);
        
//        add(new Label("personName", new PropertyModel(person, "name")));

//        add(new Link<Void>("rename") {
//            @Override
//            public void onClick() {
//                person.setName("New Jane");
//            }
//        });

//        setVersioned(false);
        labelFirst = new Label("label", "Label first");
        labelSecond = new Label("label", "Label second");

        add(labelFirst);

        add(new Link<Void>("reload") {
            @Override
            public void onClick() {
                if (getPage().contains(labelFirst, true)) {
                    getPage().replace(labelSecond);
                } else {
                    getPage().replace(labelFirst);
                }
            }
        });

        add(new Link<Void>("getPage") {
            @Override
            public void onClick() {
                PageReference pageReference = new PageReference(2);
                Page page = pageReference.getPage();

            }
        });
    }

}
