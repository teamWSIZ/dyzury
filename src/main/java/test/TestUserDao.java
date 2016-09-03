package test;

import model.User;
import service.UserDao;

/**
 * Created on 03.09.16, at 11:15
 */
public class TestUserDao {
    public static void createUsers(UserDao repoUserow) {
        User k = new User();
        k.setNazwa("Kowalski");
        repoUserow.insertNewUser(k);

        User n = new User();
        n.setNazwa("Nowak");
        repoUserow.insertNewUser(n);

        User l = new User();
        l.setNazwa("Lech");
        repoUserow.insertNewUser(l);
        System.out.println("----------");
    }

    public static void main(String[] args) {
        UserDao repoUserow = new UserDao();
        createUsers(repoUserow);

        //wykorzystanie "findAllUsers"
        for(User u : repoUserow.findAllUsers()) {
            System.out.println(u);
        }
        System.out.println("------------");
        System.out.println(repoUserow.findById(2));
    }
}
