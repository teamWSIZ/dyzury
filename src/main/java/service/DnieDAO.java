package service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created on 23.09.16, at 18:49
 */

public class DnieDAO {
    Map<Integer, String> dnieTygodnia = new HashMap<>();
    public DnieDAO() {
        dnieTygodnia.put(1, "Poniedziałek");
        dnieTygodnia.put(3, "Środa");
    }

    public String getDay(int id) {
        return dnieTygodnia.get(id);
    }

    public Integer getId(String nazwa) {
        for(Integer id : dnieTygodnia.keySet()) {
            if (dnieTygodnia.get(id).equals(nazwa)) {
                return id;
            }
        }
        return null;
    }
}
