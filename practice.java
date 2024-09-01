import java.util.*;


public class practice{
    public static void main(String[] args) {
        // for inputs
        Scanner scanner = new Scanner(System.in);
        // ask to input the user name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        // ask to input the user age
        System.out.print("How old are you: ");
        int age = scanner.nextInt();
        // ask to input the user phone number
        System.out.print("Enter you phone number: ");
        long number = scanner.nextLong();
        // displays all inputs
        System.out.println("\nYour name is " + name);
        System.out.println("Your " + age + " years old");
        System.out.println("Your phone number is: " + number);
        
        System.out.println("");
        System.out.println("Additional Info");


    }
}