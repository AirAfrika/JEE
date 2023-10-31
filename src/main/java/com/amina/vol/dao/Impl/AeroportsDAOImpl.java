package com.amina.vol.dao.Impl;

import com.amina.vol.connection.Jpa;
import com.amina.vol.entites.Aeroports;
import com.amina.vol.dao.AeroportsDAO;
import jakarta.persistence.EntityManager;

import java.util.List;

public class AeroportsDAOImpl implements AeroportsDAO {
    static EntityManager entityManager = Jpa.getInstance().getEntityManager();

    @Override
    public Aeroports addAeroports(Aeroports aeroports) {
        return null;
    }

    @Override
    public Aeroports updateAeroports(Aeroports aeroports) {
        return null;
    }

    @Override
    public Aeroports deleteAeroports(int aeroportsId) {
        return null;
    }

    @Override
    public List<Aeroports> findAllAeroports() {
        return  entityManager.createQuery("SELECT a FROM Aeroports a", Aeroports.class).getResultList();

    }

    @Override
    public Aeroports findAeroportById(int aeroportId) {
        return entityManager.find(Aeroports.class, aeroportId);
    }
}
