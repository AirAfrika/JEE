package com.amina.vol.dao.Impl;

import com.amina.vol.connection.Jpa;
import com.amina.vol.entites.Administrateur;
import com.amina.vol.dao.AdministrateurDAO;
import jakarta.persistence.EntityManager;

public class AdministrateurDAOImpl implements AdministrateurDAO {



    public Administrateur findAdministrateur() {
        EntityManager entityManager = Jpa.getInstance().getEntityManager();
        Administrateur administrateur=null;
        try {
            administrateur = entityManager.find(Administrateur.class, 1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return administrateur;
    }


}
