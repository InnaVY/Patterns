package logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestLogger {
    public static final Logger LOGGER = LoggerFactory.getLogger(TestLogger.class);

    public static void logAction(String message){
        LOGGER.info("LOG: {}", message);
    }
}
