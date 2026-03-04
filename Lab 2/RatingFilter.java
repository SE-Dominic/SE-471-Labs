import java.util.ArrayList;
public class RatingFilter implements FilterIF {
    @Override
    public ArrayList<Product> meetCriteria(ArrayList<Product> list) {
        final double filteredRating = 6;
        ArrayList<Product> filteredList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getCustomerRating() >= filteredRating) {
                filteredList.add(list.get(i));
            }
        }
        return filteredList;
    }
}
