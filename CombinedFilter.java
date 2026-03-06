import java.util.ArrayList;
public class CombinedFilter implements FilterIF {
    public ArrayList<Product> meetCriteria(ArrayList<Product> list) {
        FilterIF priceFilter = new PriceFilter();
        FilterIF ratingFilter = new RatingFilter();

        ArrayList<Product> firstFilteredList = priceFilter.meetCriteria(list);
        ArrayList<Product> secondFilteredList = ratingFilter.meetCriteria(firstFilteredList);
        
        return secondFilteredList;
    }
}
