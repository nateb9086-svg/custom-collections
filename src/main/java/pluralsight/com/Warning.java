package pluralsight.com;

public class Warning extends LogLevel{
    @Override
    public String getLabel(){
        return "Warning";
    }

    @Override
    public int getSeverity(){
        return  3;
    }
}
