package pluralsight.com;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        Logger<Error> errorLogger = new Logger<>();
        Logger<Warning> warningLogger = new Logger<>();
        Logger<Debug> debugLogger = new Logger<>();


        //This errorLogger isn't working because the method is suspecting a different instance
        errorLogger.log("NullPointerException in OrderService", new Error());

        debugLogger.log("Entering method: calculateTotal()", new Debug());

        List<String> messages = new ArrayList<>();

        messages.add("CPU spike detected");
        messages.add("Memory usage above 90%");
        messages.add("Disk usage above 80%");

        warningLogger.logMultiple(messages, new Warning());

    }
}
