package pluralsight.com;

import java.util.List;

public class Logger<T extends LogLevel>{
    public void log(String message, T level){
        System.out.printf("[%s] (severity: %d) %s\n", level.getLabel(), level.getSeverity(), message);
    }

    public void logMultiple(List<String> messages, T level) {
        for (String s : messages) {
            System.out.printf("[%s] (severity: %d) %s\n", level.getLabel(), level.getSeverity(), s);
        }
    }

}
