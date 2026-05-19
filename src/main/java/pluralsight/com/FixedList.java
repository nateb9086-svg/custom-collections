package pluralsight.com;
import java.util.ArrayList;

public class FixedList<T> {
    private int maxSize;
    private ArrayList<T> items;

    public FixedList(int maxSize) {
        this.maxSize = maxSize;
        this.items = new ArrayList<>();
    }

    public ArrayList<T> getItems() {
        return items;
    }

    public void add(T item ){
        if(maxSize > items.size()){
            items.add(item);
        } else  {
            System.out.println("List is too big!");
        }
    }
}
