import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Please enter the number of copies:");
        int numberOfCopies1 = sc.nextInt();
        sc.nextLine();
        System.out.println("Please enter the name of the book:");
        String bookName = sc.nextLine();
        
        System.out.println("Please enter the number of copies:");
        int numberOfCopies = sc.nextInt();
        
        // Do something with bookName and numberOfCopies
        
        sc.close(); // Close the Scanner to prevent resource leaks
    }
}
