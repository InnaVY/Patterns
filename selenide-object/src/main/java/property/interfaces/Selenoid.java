package property.interfaces;

import org.aeonbits.owner.Config;

@Config.Sources("file:${module_path}/selenide-object/src/main/resources/instances/selenoid.properties")
public interface Selenoid extends Config {
    @Key("url")
    String getUrl();

    @Key("chrome.version")
    String getChromeVersion();

    @Key("forefox.version")
    String getFirefoxVersion();
}
