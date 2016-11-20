
import java.util.*;

/**
 *
 */
public class ConsoleLogger extends AbstractLogger {

    /**
     * Default constructor
     */
    public ConsoleLogger(int level) {
        this.level =level;
    }


    /**
     * @param message
     * @return
     */
    protected void write(String message){
        System.out.println("Standard Console::Logger: " + message);
    }

}
