package com.amina.vol.services;

import com.amina.vol.dao.AdministrateurDAO;
import com.amina.vol.dao.Impl.AdministrateurDAOImpl;
import com.amina.vol.entites.Administrateur;

public class AdministrateurService {

    private AdministrateurDAO administrateurDAOImpl  ;


    public AdministrateurService() {
        this.administrateurDAOImpl = new AdministrateurDAOImpl();

    }

    public Administrateur getAdministrateur() {
        if (administrateurDAOImpl != null) {
            return administrateurDAOImpl.findAdministrateur();
        } else {
            throw new NullPointerException("administrateurDAOImpl is null");
        }
    }
    public Administrateur authenticateAdministrator(String email, String password) {
        Administrateur administrator = administrateurDAOImpl.findAdministrateur();
        if (administrator != null && administrator.getPassword().equals(password) && administrator.getEmail().equals(email)) {
            return administrator;
        }
        return null;
    }


}
