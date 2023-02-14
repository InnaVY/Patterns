public class DriverManageFactory {
    public static DriverManager getManager(DriverType type){
        DriverManager driverManager = null;
        switch(type){
            case CHROME -> driverManager = new ChromeDriverManager();
            case FIREFOX -> driverManager = new FirefoxDriverManager();
        }
       return driverManager;
    }
}
