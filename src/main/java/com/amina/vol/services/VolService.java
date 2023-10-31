package com.amina.vol.services;

import com.amina.vol.dao.Impl.VolDAOImpl;
import com.amina.vol.dao.VolDAO;
import com.amina.vol.entites.Vol;

import java.util.List;

public class VolService {
    private VolDAO volDAO;

    public VolService() {
        this.volDAO = new VolDAOImpl();
    }
    public List<Vol> findAllVols() {
        if (volDAO != null) {
            return volDAO.findAllVols();
        } else {
            throw new NullPointerException("volDAOImpl is null");
        }
    }
    public Vol addVol(Vol vol) {
        if (volDAO != null) {
            return volDAO.addVol(vol);
        } else {
            throw new NullPointerException("volDAOImpl is null");
        }
    }

}
