
import java.util.Scanner;

public class searching {
    int search(int a[], int key) {
        for (int i = 0; i < a.length; i++) {
            if (key == a[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter key to search: ");
            int key = sc.nextInt();

            searching obj = new searching();
            int i = obj.search(a, key);

            if (i != -1) {
                System.out.println("Element found at: " + i);
            } else {
                System.out.println("Element not found");
            }
        }
    }
}
