
import java.util.*;

/**
 *
 */
public abstract class AbstractLogger {

    /**
     * Default constructor
     */
    public AbstractLogger() {
    }

    /**
     *
     */
    public static int INFO = 1;

    /**
     *
     */
    public static int DEBUG = 2;

    /**
     *
     */
    public static int ERROR = 3;

    /**
     *
     */
    protected int level;

    /**
     *
     */
    public AbstractLogger nextLogger;

    /**
     * @param nextLogger
     * @return
     */
    public void setNextLogger(AbstractLogger nextLogger) {
        // TODO implement here
        this.nextLogger = nextLogger;
    }

    /**
     * @param level
     * @param message
     * @return
     */
    public void logMessage(int level, String message) {
        if(this.level <= level){
         write(message);
      }
      if(nextLogger !=null){
         nextLogger.logMessage(level, message);
      }
    }

    /**
     * @param message
     * @return
     */
    protected abstract void write(String message);

}
