package pack1;
import java.util.Scanner;

public class SCO {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Order[] orders = {
                new Order(1, "A", 120),
                new Order(2, "B", 600),
                new Order(3, "C", 1000),
                new Order(4, "D", 90),
                new Order(5, "E", 170),
                new Order(6, "F", 150)
        };

        Order[] ordersForBubbleSort = orders.clone(); // Cloning the array for Bubble Sort
        Order[] ordersForQuickSort = orders.clone(); // Cloning the array for Quick Sort

        Sorting bsort = new BubbleSort();
        bsort.sort(ordersForBubbleSort);

        System.out.println("Orders sorted using Bubble Sort:");
        for (Order order : ordersForBubbleSort) {
            System.out.println(order);
        }

        Sorting qsort = new QuickSort();
        qsort.sort(ordersForQuickSort);

        System.out.println("\nOrders sorted using Quick Sort:");
        for (Order order : ordersForQuickSort) {
            System.out.println(order);
        }
    }

}
