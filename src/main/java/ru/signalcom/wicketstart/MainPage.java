package ru.signalcom.wicketstart;

import org.apache.wicket.markup.ComponentTag;
import org.apache.wicket.markup.MarkupStream;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.link.Link;

public class MainPage extends WebPage {

    private final String homePageTitleKey = "homePageTitle";
    private final String homePageTitleValue = "Home page";

    private final String homePageNameKey = "homePageName";
    private final String homePageNameValue = "Home page";

    private final String sessionTemporaryKey = "sessionTemporary";
    private final String sessionTemporaryValue = "Temporary is ";

    private final String pageStatelessKey = "pageStateless";
    private final String pageStatelessValue = "Page stateless is ";

    private final String pageVersionedKey = "pageVersioned";
    private final String pageVersionedValue = "Page versioned is ";

    private final Label firstLabel;
    private final Label secondLabel;

    private final Label helloWorld;

    public MainPage() {
        helloWorld = new Label("helloWorld", "Hello Java World!!!") {
            @Override
            public void onComponentTagBody(MarkupStream markupStream, ComponentTag openTag) {
                if (!isEnabled()) {
                    replaceComponentTagBody(markupStream, openTag, "Component is disabled");
                } else {
                    super.onComponentTagBody(markupStream, openTag);
                }
            }
        };

        add(helloWorld);

//        add(new Label("helloWorld", "Hello Java World!!!") {
//            @Override
//            public void onComponentTagBody(MarkupStream markupStream, ComponentTag openTag) {
//                if (!isEnabled()) {
//                    replaceComponentTagBody(markupStream, openTag, "Component is disabled");
//                } else {
//                    super.onComponentTagBody(markupStream, openTag);
//                }
//            }
//        });
        add(new Link<Void>("labelDisable") {
            @Override
            public void onClick() {
                helloWorld.setEnabled(false);
            }

        });

        add(new Label(homePageTitleKey, homePageTitleValue));
        add(new Label(homePageNameKey, homePageNameValue));
        add(new Label(sessionTemporaryKey, sessionTemporaryValue + getSession().isTemporary()));
        add(new Label(pageStatelessKey, pageStatelessValue + this.isPageStateless()));
        add(new Label(pageVersionedKey, pageVersionedValue + this.isVersioned()));

        firstLabel = new Label("label", "First label");
        secondLabel = new Label("label", "Second label");

        add(new Link<Void>("loginpage") {
            @Override
            public void onClick() {
                SimpleLoginPage loginPage = new SimpleLoginPage();
                setResponsePage(loginPage);
            }
        });

        add(firstLabel);

        add(new Link<Void>("reload") {
            @Override
            public void onClick() {
            }
        });

    }

    @Override
    protected void onBeforeRender() {
        if (contains(firstLabel, true)) {
            replace(secondLabel);
        } else {
            replace(firstLabel);
        }
        super.onBeforeRender();
    }

}
