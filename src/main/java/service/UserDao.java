package service;


import model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//http://docs.spring.io/spring-data/jpa/docs/1.4.3.RELEASE/reference/html/jpa.repositories.html


public class UserDao {
    //pamietamy userów w jakiejś strukturze....
    Map<Integer, User> users = new HashMap<>();
    Integer nextId = 1;


    public User insertNewUser(User userBezId) {
        userBezId.setIduser(nextId);
        nextId++;
        users.put(userBezId.getIduser(), userBezId);
        return userBezId; ///ten juz ma ustawione ID
    }

    public void updateUser(User newData) {
        if (newData.getIduser()==null);
        users.put(newData.getIduser(), newData);
    }

    public User findById(Integer id) {
        return users.get(id);
    }

    public List<User> findAllUsers() {
        //wykopać userów i wstawić do listy
        List<User> wynik = new ArrayList<User>();
        for(Integer id : users.keySet()) {
            wynik.add(users.get(id));
        }
        ///

        return wynik;
    }
}
