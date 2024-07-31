public class SearchTest {
    public static void main(String[] args) {
        Product[] products = {
            new Product("P001", "Laptop", "Electronics"),
            new Product("P002", "Smartphone", "Electronics"),
            new Product("P003", "Tablet", "Electronics"),
            new Product("P004", "Headphones", "Accessories"),
            new Product("P005", "Charger", "Accessories")
        };

        // Linear Search Test
        Product result = LinearSearch.linearSearch(products, "P003");
        if (result != null) {
            System.out.println("Linear Search: " + result);
        } else {
            System.out.println("Product not found using Linear Search.");
        }

        // Binary Search Test
        result = BinarySearch.binarySearch(products, "P003");
        if (result != null) {
            System.out.println("Binary Search: " + result);
        } else {
            System.out.println("Product not found using Binary Search.");
        }
    }
}
