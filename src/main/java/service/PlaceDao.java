package service;

import model.Break;
import model.Place;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class PlaceDao {
    Map<Integer, Place> places = new HashMap<>();
    Integer nextId = 1;

    public Place insertNew(Place noId) {
        noId.setIdplace(nextId++);
        places.put(noId.getIdplace(), noId);
        return noId;
    }

    public List<Place> findAll() {
        List<Place> res = new ArrayList<>();
        for(int id : places.keySet()) res.add(places.get(id));
        return res;
    }

    public Place findById(int id) {
        return places.get(id);
    }
}
