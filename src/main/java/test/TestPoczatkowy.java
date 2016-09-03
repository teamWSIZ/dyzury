package test;

import model.Break;
import model.User;

/**
 * Created on 03.09.16, at 10:29
 */
public class TestPoczatkowy {
    public static void main(String[] args) {
        System.out.println("hi");

        User kowalski = new User();
        kowalski.setNazwa("Kowalski");
        kowalski.setIduser(1);

        Break pierwsza = new Break();
        pierwsza.setNazwa("Pierwsza przerwa");
        pierwsza.setIdbreak(1);

        System.out.println(kowalski);
        System.out.println(pierwsza);
    }
}
