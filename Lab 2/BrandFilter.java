import java.util.ArrayList;

public class BrandFilter implements FilterIF {
    @Override
    public ArrayList<Product> meetCriteria(ArrayList<Product> list) {
        //global, luxury, general
        final String filterdBrandName = "luxury";
        filterdBrandName.toLowerCase();
        ArrayList<Product> filteredList = new ArrayList<>();
        
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getBrand() == filterdBrandName) {
                filteredList.add(list.get(i));
            } else {
                continue;
            }
        }
        return filteredList;
    }
}
