package com.amina.vol.dao;

import com.amina.vol.entites.Client;

import java.util.List;

public interface ClientDAO {
    public Client addClient(Client client);
    public Client updateClient(Client client);
    public Client deleteClient(int clientId);
    public  List<Client> findAllClient() ;
    public Client findClientByID(int clientId);
    public Client findClientByEmail(String clientEmail,String password);
}
