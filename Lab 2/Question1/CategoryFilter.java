import java.util.ArrayList;

public class CategoryFilter implements FilterIF {
    @Override
    public ArrayList<Product> meetCriteria(ArrayList<Product> list) {
        //global, luxury, general
        final String filterdCategoryName = "electronics";
        filterdCategoryName.toLowerCase();
        ArrayList<Product> filteredList = new ArrayList<>();
        
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getCategory() == filterdCategoryName) {
                filteredList.add(list.get(i));
            } else {
                continue;
            }
        }
        return filteredList;
    }
}
