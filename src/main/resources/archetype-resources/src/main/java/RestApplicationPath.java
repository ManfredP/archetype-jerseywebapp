package $package;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/webapi")
public class RestApplicationPath extends Application {
    @Override
    public Set<Class<?>> getClasses(){
        final Set<Class<?>> classes = new HashSet<>();
        classes.add(MyResource.class);
        return classes;
    }
}
