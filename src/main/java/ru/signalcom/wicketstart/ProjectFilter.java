package ru.signalcom.wicketstart;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import org.apache.wicket.protocol.http.WicketFilter;

@WebFilter(
        value = "/*",
        initParams = {
            @WebInitParam(
                    name = "applicationClassName",
                    value = "ru.signalcom.wicketstart.WicketApplication"),
            @WebInitParam(name = "filterMappingUrlPattern", value = "/*")})
public class ProjectFilter extends WicketFilter {
}
