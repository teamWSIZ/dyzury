package test;

import model.Break;
import model.Dyzur;
import service.BreakDao;
import service.DyzurDao;
import service.UserDao;

import java.util.Date;

/**
 * Created on 03.09.16, at 11:42
 */
public class TestSprawdzaniaDyzurow {
    public static void createBreaks(BreakDao dao) {
        Break b1 = new Break();
        b1.setNazwa("Pierwsza");
        Break b2 = new Break();
        b2.setNazwa("Druga");
        Break b3 = new Break();
        b3.setNazwa("Trzecia");
        dao.insertNew(b1);
        dao.insertNew(b2);
        dao.insertNew(b3);
    }

    public static void createDyzurs(DyzurDao dyzurDao) {
        Dyzur d1 = new Dyzur();
        d1.setIduser(1);
        d1.setIdbreak(1);
        dyzurDao.insertDyzur(d1);
        Dyzur d2 = new Dyzur();
        d2.setIduser(1);
        d2.setIdbreak(2);
        dyzurDao.insertDyzur(d2);
        Dyzur d3 = new Dyzur();
        d3.setIduser(2);
        d3.setIdbreak(3);
        d3.setData(new Date());
        dyzurDao.insertDyzur(d3);
    }

    public static void main(String[] args) {
        UserDao repoUserow = new UserDao();
        BreakDao repoBreak = new BreakDao();
        DyzurDao repoDyzurow = new DyzurDao();

        TestUserDao.createUsers(repoUserow);
        createBreaks(repoBreak);
        createDyzurs(repoDyzurow);
        //to moglo by byc juz w osobnym dialogu

        //wypisanie wszystkich
        for(Dyzur d : repoDyzurow.findAll()) {
            System.out.println(d);
        }

        //wypisanie dyzurow usera 1
        for (Dyzur d : repoDyzurow.findByUserId(1)) {
            System.out.println(
                    "Dyzur na break:" + repoBreak.findById(d.getIdbreak()) +
                            "\t User na dyzuze:" + repoUserow.findById(d.getIduser())
            );
        }


    }
}
