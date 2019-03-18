package ru.signalcom.wicketstart;

public class SimpleLoginPage extends JugTemplate {

    public SimpleLoginPage() {
        super();
    }

    @Override
    protected void onInitialize() {
        super.onInitialize();
        replace(new LoginPanel(contentComponentKey));
        getFooterPanel().setVisible(false);
    }

}
