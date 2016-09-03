package gui;

import model.User;
import service.BreakDao;
import service.DyzurDao;
import service.PlaceDao;
import service.UserDao;
import test.TestPlaceDao;
import test.TestSprawdzaniaDyzurow;
import test.TestUserDao;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created on 03.09.16, at 13:05
 */
public class MainGui {
    private JPanel mp;
    private JComboBox comboBox1;
    private JButton pokażDyżuryUseraButton;
    private JButton pokażWszystkieDyżuryButton;
    private JTextArea textArea1;

    // Zbiory danych
    UserDao userDao;
    PlaceDao placeDao;
    BreakDao breakDao;
    DyzurDao dyzurDao;

    private void createData() {
        TestUserDao.createUsers(userDao);
        TestPlaceDao.createPlaces(placeDao);
        TestSprawdzaniaDyzurow.createBreaks(breakDao);
        TestSprawdzaniaDyzurow.createDyzurs(dyzurDao);
    }

    public MainGui() {
        userDao = new UserDao();
        placeDao = new PlaceDao();
        breakDao = new BreakDao();
        dyzurDao = new DyzurDao();
        createData();

        for(User u : userDao.findAllUsers()) {
            comboBox1.addItem(u);
        }

        pokażDyżuryUseraButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Wyciąga który obiekt klasy User jest aktualnie wybrany w combo
                System.out.println((User)(comboBox1.getSelectedItem()));
            }
        });
    }

    public JPanel getMp() {
        return mp;
    }
}
