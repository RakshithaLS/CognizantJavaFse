import java.util.Arrays;
import java.util.Comparator;

public class BinarySearch {
    public static Product binarySearch(Product[] products, String productId) {
        Arrays.sort(products, Comparator.comparing(Product::getProductId));  // Ensure the array is sorted
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;
            int comparison = products[middle].getProductId().compareTo(productId);

            if (comparison == 0) {
                return products[middle];
            }
            if (comparison < 0) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return null;
    }
}
