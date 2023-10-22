import java.util.*;
class Panagram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string:");
        char[] a = scan.nextLine().toLowerCase().toCharArray();
        int count = 0;
        for (int i = 97; i <= 122; i++) { 
            char currentChar = (char) i; 
            boolean found = false;
            for (char j : a) {
                if (i == j) {
                    found = true;
                    break;
                }
            }
            if (found) {
                count++;
            }
        }
        if (count == 26) {
            System.out.println("Pangram");
        } else {
            System.out.println("Not a Pangram");
        }
    }
}
