package ru.signalcom.wicketstart;

import org.apache.wicket.Component;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;

public class JugTemplate extends WebPage {
    
    public final String contentComponentKey = "contentComponent";
    private final String contentComponentValue = "Put your content here";
    
    private final Component headerPanel;
    private final Component footerPanel;

    public JugTemplate() {
        add(headerPanel = new HeaderPanel("headerPanel"));
        add(footerPanel = new FooterPanel("footerPanel"));
        add(new Label(contentComponentKey, contentComponentValue));
    }

    public Component getHeaderPanel() {
        return headerPanel;
    }

    public Component getFooterPanel() {
        return footerPanel;
    }
    
}
