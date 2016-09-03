package service;

import model.Break;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created on 03.09.16, at 11:31
 */
public class BreakDao {
    Map<Integer, Break> breaks = new HashMap<>();
    Integer nextId = 1;

    public Break insertNew(Break noId) {
        noId.setIdbreak(nextId++);
        breaks.put(noId.getIdbreak(), noId);
        return noId;
    }

    public List<Break> findAll() {
        List<Break> res = new ArrayList<>();
        for(int id : breaks.keySet()) res.add(breaks.get(id));
        return res;
    }

    public Break findById(int id) {
        return breaks.get(id);
    }
}
