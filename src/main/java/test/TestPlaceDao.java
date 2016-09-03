package test;

import model.Place;
import model.User;
import service.PlaceDao;
import service.UserDao;

import static test.TestUserDao.createUsers;


public class TestPlaceDao {
    public static void createPlaces(PlaceDao repoPlace) {
        Place k = new Place();
        k.setNazwa("Korytarz");
        repoPlace.insertNew(k);

        Place n = new Place();
        n.setNazwa("Siłownia");
        repoPlace.insertNew(n);

        Place l = new Place();
        l.setNazwa("Parter");
        repoPlace.insertNew(l);
    }

    public static void main(String[] args) {
        PlaceDao repoPlace = new PlaceDao();
        createPlaces(repoPlace);

        //wykorzystanie "findAllUsers"
        for(Place u : repoPlace.findAll()) {
            System.out.println(u);
        }
        System.out.println(repoPlace.findById(2));
    }
}
