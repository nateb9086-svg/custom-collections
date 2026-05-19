package pluralsight.com;

public class Info extends LogLevel{
    @Override
    public String getLabel(){
        return "Info";
    }

    @Override
    public int getSeverity(){
        return  2;
    }
}
