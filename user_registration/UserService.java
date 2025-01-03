package user_registration;
import java.util.ArrayList;
import java.util.List;

public class UserService {
    private List<User> users = new ArrayList<>();

    // register a new user
    public void registerUser (String username, String email, String password) {
        User newUser  = new User(username, email, password);
        users.add(newUser );
        System.out.println("User  registered successfully!");
    }

    // find a user by email
    public User findUserByEmail(String email) {
        for (User  user : users) {
            if (user.getEmail().equals(email)) {
                return user;
            }
        }
        return null; // User not found
    }

    // log in a user
    public boolean loginUser (String email, String password) {
        User user = findUserByEmail(email);
        if (user != null && user.getPassword().equals(password)) {
            System.out.println("Login successful!");
            return true;
        } else {
            System.out.println("Invalid email or password.");
            return false;
        }
    }
}