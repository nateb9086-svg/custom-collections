package pluralsight.com;

public class App {
    public static void main(String[] args) {

        Logger<Error> errorLogger = new Logger<Error>();

        Logger<Debug> debugLogger = new Logger<Debug>();

        //This errorLogger isn't working because the method is suspecting a different instance
        errorLogger.log("NullPointerException in OrderService", new Error());

        //debugLogger.log();

    }
}
