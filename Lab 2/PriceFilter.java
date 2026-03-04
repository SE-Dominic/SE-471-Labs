import java.util.ArrayList;
public class PriceFilter implements FilterIF{
    @Override 
    public ArrayList<Product> meetCriteria(ArrayList<Product> list) {
        ArrayList<Product> filteredList = new ArrayList<>();
        final double filterValue = 15.00;
        
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getPrice() <= filterValue) {
                filteredList.add(list.get(i));
            }
        }
        return filteredList;
    }
}