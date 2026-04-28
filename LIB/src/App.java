

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Library lib = new Library();
        lib.addBook("DSA");
        lib.addBook("Java");

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nEnter choice: ");
            System.out.println("1. Add Book");
            System.out.println("2. Borrow Book");
            System.out.println("3. Return Book");
            System.out.println("4. Remove Book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter book to add: ");
                    String b1 = sc.nextLine();
                    lib.addBook(b1);
                    System.out.println("Book added");
                    break;

                case 2:
                    System.out.print("Enter book title: ");
                    String b2 = sc.nextLine();
                    lib.borrowBook(b2);
                 
                    break;

                case 3:
                    System.out.print("Enter book title: ");
                    String b3 = sc.nextLine();
                    
                    
                    lib.returnBook(b3);

                    break;

                case 4:
                    System.out.print("Enter book to remove: ");
                    String b4 = sc.nextLine();
                    lib.removeBook(b4);
                    System.out.println("Book removed");
                    break;

                case 5:
                    System.out.println("Exit..");
                    
                    return;

                default:
                    System.out.println("Invalid");
                    break;
            }
        }
    }
}
