package ru.signalcom.wicketstart;

public class SimpleLoginPage extends JugTemplate {
        public SimpleLoginPage(){
                super();
                replace(new LoginPanel(contentComponentKey));
        }
}
