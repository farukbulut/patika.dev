package bulut.com.week3.bookorder.service;

import bulut.com.week3.bookorder.model.User;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class UserService {

    private static Set<User> users = new HashSet<>();
    public void create(String name, String email, String password){
        User user = new User(name, email, password);
        users.add(user);
    }

    public void list(){
        for (User user: users){
            System.out.println("Ad : " + user.getEmail() + " Email : " + user.getEmail());
        }
    }

    public User findUserByEmail(String email){
        for (User user: users){
            if (user.getEmail().equals(email)){
                return user;
            }
        }

        return null;
    }
}
