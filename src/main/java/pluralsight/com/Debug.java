package pluralsight.com;

public class Debug extends LogLevel{
    @Override
    public String getLabel(){
        return "Debug";
    }

    @Override
    public int getSeverity(){
        return  1;
    }
}
