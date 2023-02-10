package property;

import org.aeonbits.owner.ConfigFactory;
import property.interfaces.Selenoid;

import java.nio.file.Paths;

public class PropertyHolder {
   static {
        configureUserPath();
    }
   public static final Selenoid selenoidProperties = ConfigFactory.create(Selenoid.class);
    private static void configureUserPath(){
       System.setProperty("module_path", Paths.get(".").toAbsolutePath().getParent().getParent().toString());
    }
}
