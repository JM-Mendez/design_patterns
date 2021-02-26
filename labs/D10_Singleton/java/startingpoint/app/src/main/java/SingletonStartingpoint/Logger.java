package SingletonStartingpoint;

import java.lang.*;

public class Logger {

    public Logger() {
        try {
            // Simulate long init phase.
            Thread.sleep(4000);
        } catch (Exception e) { }
    }
    
    public void warn(String message) {
        System.out.println("[Warn] " + message);
    }

    public void info(String message) {
        System.out.println("[Info] " + message);
    }

    public void error(String message) {
        System.out.println("[Error] " + message);
    }

}
