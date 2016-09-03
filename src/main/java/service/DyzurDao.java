package service;

import model.Dyzur;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static sun.java2d.cmm.ColorTransform.In;

/**
 * Created on 03.09.16, at 11:34
 */
public class DyzurDao {
    Map<Integer, Dyzur> dyzurs = new HashMap<>();
    Integer nextId = 1;

    public Dyzur insertDyzur(Dyzur noId) {
        noId.setIddyzur(nextId++);
        dyzurs.put(noId.getIddyzur(), noId);
        return noId;
    }

    public List<Dyzur> findAll() {
        List<Dyzur> res = new ArrayList<>();
        for(int id : dyzurs.keySet()) res.add(dyzurs.get(id));
        return res;
    }

    public List<Dyzur> findByUserId(int userid) {
        List<Dyzur> res = new ArrayList<>();
        for(int id : dyzurs.keySet()) {
            Dyzur d = dyzurs.get(id);
            if (d.getIduser()==userid) {
                res.add(dyzurs.get(id));
            }
        }
        return res;
    }


}
