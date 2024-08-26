import java.util.*;

public class practice{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("How old are you: ");
        int age = scanner.nextInt();

        System.out.print("Enter you phone number: ");
        long number = scanner.nextLong();

        System.out.println("\nYour name is " + name);
        System.out.println("Your " + age + " years old");
        System.out.println("Your phone number is: " + number);



    }
}