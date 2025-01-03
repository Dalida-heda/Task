package user_registration;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        Scanner scanner = new Scanner(System.in);

    
        System.out.println("Register a new user:");
        System.out.println("Username: ");
        String username = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();
        userService.registerUser (username, email, password);


        System.out.println("\nLogin:");
        System.out.print("Email: ");
        String loginEmail = scanner.nextLine();
        System.out.print("Password: ");
        String loginPassword = scanner.nextLine();
        userService.loginUser (loginEmail, loginPassword);

        scanner.close();
    }
}
