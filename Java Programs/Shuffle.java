import java.util.*;
class Shuffle {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        Random random = new Random();
        for (int i = a.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
        for (int element : a) {
            System.out.print(element + " ");
        }
    }
}
