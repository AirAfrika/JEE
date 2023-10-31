package com.amina.vol.services;

import com.amina.vol.standard.ValidationUtils;
import com.amina.vol.dao.ClientDAO;
import com.amina.vol.dao.Impl.ClientDAOImpl;
import com.amina.vol.entites.Client;

public class ClientService {
    private static ClientDAO clientDAOImpl ;
    private ValidationUtils validationUtils;

    public ClientService() {
        this.clientDAOImpl = new ClientDAOImpl();
        this.validationUtils =new ValidationUtils();

    }

    public boolean ajouterClient(String nom, String prenom, String email, String telephone,String password) {
        if (!validationUtils.isValidString(nom) || !validationUtils.isValidString(prenom) ||
                !validationUtils.isValidEmail(email) || !validationUtils.isValidTelephone(telephone)) {
            return false;
        }

        Client client = new Client();
        client.setNom(nom);
        client.setPrenom(prenom);
        client.setEmail(email);
        client.setTelephone(telephone);
        client.setPassword(password);

        Client addedClient = clientDAOImpl.addClient(client);

        return addedClient != null; // Si l'ajout du client a réussi envoyer true
    }
    public  Client SearchClient(String email, String password) {
        Client searchedClient= null;
        searchedClient = clientDAOImpl.findClientByEmail(email, password);

        return searchedClient ; // Si l'ajout du client a réussi envoyer true
    }


}
