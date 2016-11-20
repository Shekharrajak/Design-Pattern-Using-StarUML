
import java.util.*;

/**
 *
 */
public class FileLogger extends AbstractLogger {

    /**
     * Default constructor
     */
    public FileLogger(int level) {
        this.level = level;
    }

    /**
     * @param message
     * @return
     */
    protected void write(String message){
        System.out.println("File::Logger: " + message);
    }

}
