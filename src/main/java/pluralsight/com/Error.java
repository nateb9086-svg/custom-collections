package pluralsight.com;

public class Error extends LogLevel{
    @Override
    public String getLabel(){
        return "Error";
    }

    @Override
    public int getSeverity(){
        return  4;
    }
}
