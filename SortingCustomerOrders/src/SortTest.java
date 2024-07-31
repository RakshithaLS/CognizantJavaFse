import java.util.Arrays;

public class SortTest {
    public static void main(String[] args) {
        Order[] orders = {
            new Order("O001", "Alice", 150.0),
            new Order("O002", "Bob", 300.0),
            new Order("O003", "Charlie", 200.0),
            new Order("O004", "David", 250.0),
            new Order("O005", "Eve", 100.0)
        };

        // Bubble Sort Test
        System.out.println("Before Bubble Sort: " + Arrays.toString(orders));
        BubbleSort.bubbleSort(orders);
        System.out.println("After Bubble Sort: " + Arrays.toString(orders));

        // Reset the orders array
        orders = new Order[] {
            new Order("O001", "Alice", 150.0),
            new Order("O002", "Bob", 300.0),
            new Order("O003", "Charlie", 200.0),
            new Order("O004", "David", 250.0),
            new Order("O005", "Eve", 100.0)
        };

        // Quick Sort Test
        System.out.println("Before Quick Sort: " + Arrays.toString(orders));
        QuickSort.quickSort(orders, 0, orders.length - 1);
        System.out.println("After Quick Sort: " + Arrays.toString(orders));
    }
}
