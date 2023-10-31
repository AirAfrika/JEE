package com.amina.vol.dao;

import com.amina.vol.entites.Aeroports;

import java.util.List;

public interface AeroportsDAO {
    public Aeroports addAeroports(Aeroports aeroports);
    public Aeroports updateAeroports(Aeroports aeroports);
    public Aeroports deleteAeroports(int aeroportsId);

    public  List<Aeroports> findAllAeroports() ;
    public Aeroports findAeroportById(int aeroportId);
}
