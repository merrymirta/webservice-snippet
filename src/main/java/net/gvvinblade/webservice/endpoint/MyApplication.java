package net.gvvinblade.webservice.endpoint;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.Collections;
import java.util.Set;

/**
 * Created by gvvin on 05.09.2015.
 *
 */
@ApplicationPath("/rest")
public class MyApplication extends Application {
    @Override
    public Set<Class<?>> getClasses() {
        return Collections.singleton(RestServiceEndpoint.class);
    }
}
