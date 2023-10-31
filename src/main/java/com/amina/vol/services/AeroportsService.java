package com.amina.vol.services;

import com.amina.vol.entites.Aeroports;
import com.amina.vol.dao.AeroportsDAO;
import com.amina.vol.dao.Impl.AeroportsDAOImpl;

import java.util.List;

public class AeroportsService {
    private AeroportsDAO aeroportsDAO;

    public AeroportsService() {
        this.aeroportsDAO = new AeroportsDAOImpl();
    }
    public List<Aeroports> findAllAeroports() {
        if (aeroportsDAO != null) {
            return aeroportsDAO.findAllAeroports();
        } else {
            throw new NullPointerException("aeroportsDAOImpl is null");
        }
    }
    public Aeroports findAeroportByID(int aeroportId) {
        if (aeroportsDAO != null) {
            return aeroportsDAO.findAeroportById(aeroportId);
        } else {
            throw new NullPointerException("aeroportsDAOImpl is null");
        }
    }
}
