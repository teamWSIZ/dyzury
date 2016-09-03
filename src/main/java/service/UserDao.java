package service;


import model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserDao {
    //pamietamy userów w jakiejś strukturze....
    Map<Integer, User> users = new HashMap<>();
    Integer nextId = 1;

    
    User insertNewUser(User userBezId) {
        userBezId.setIduser(nextId);
        nextId++;
        users.put(userBezId.getIduser(), userBezId);
        return userBezId; ///ten juz ma ustawione ID
    }

    List<User> findAllUsers() {
        //wykopać userów i wstawić do listy
        List<User> wynik = new ArrayList<User>();
        ///

        return wynik;
    }
}
