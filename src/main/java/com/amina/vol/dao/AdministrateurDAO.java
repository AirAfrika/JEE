package com.amina.vol.dao;

import com.amina.vol.entites.Administrateur;

public interface AdministrateurDAO {
    // public Optional<Administrateur>addAdministrateur(Administrateur administrateur);
    // public Optional<Administrateur>updateAdministrateur(Administrateur administrateur);
    // public Optional<Administrateur>deleteAdministrateur(int administrateurId);
    // public Optional<List<Administrateur>>findAllAdministrateur();
    public Administrateur findAdministrateur();
}
