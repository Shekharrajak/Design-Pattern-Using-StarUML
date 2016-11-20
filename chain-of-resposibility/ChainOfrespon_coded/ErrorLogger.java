
import java.util.*;

/**
 *
 */
public class ErrorLogger extends AbstractLogger {

    /**
     * Default constructor
     */
    public ErrorLogger(int level) {
        this.level = level;
    }

    /**
     * @param message
     * @return
     */
    protected void write(String message){
        System.out.println("Error Console::Logger: " + message);
    }

}
