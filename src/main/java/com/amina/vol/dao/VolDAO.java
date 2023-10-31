package com.amina.vol.dao;

import com.amina.vol.entites.Vol;

import java.util.List;

public interface VolDAO {
    public Vol addVol(Vol vol);
    public Vol updateVolClient(Vol vol);
    public Vol deleteVol(int volId);
    public List<Vol> findAllVols() ;
    public Vol findVolById(int volId);
}
