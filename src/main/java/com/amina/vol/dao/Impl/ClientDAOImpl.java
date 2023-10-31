package com.amina.vol.dao.Impl;

import com.amina.vol.connection.Jpa;
import com.amina.vol.entites.Client;
import com.amina.vol.dao.ClientDAO;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.NoResultException;

import java.util.List;

public class ClientDAOImpl implements ClientDAO {
    EntityManager entityManager = Jpa.getInstance().getEntityManager();

    @Override
    public Client addClient(Client client) {
        EntityTransaction transaction = null;
        try {
            transaction = entityManager.getTransaction();
            transaction.begin();
            entityManager.persist(client);
            transaction.commit();
            return client;
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Client updateClient(Client client) {
        return null;
    }

    @Override
    public Client deleteClient(int clientId) {
        return null;
    }

    @Override
    public List<Client> findAllClient() {
        return null;
    }

    @Override
    public Client findClientByID(int clientId) {
        return null;
    }

    @Override
    public Client findClientByEmail(String clientEmail ,String password) {
        try {
            Client client = entityManager.createQuery("SELECT c FROM Client c WHERE c.email = :email AND c.password = :password", Client.class)
                    .setParameter("email", clientEmail)
                    .setParameter("password", password)
                    .getSingleResult();

            return client; // Renvoie le client trouvé ou null si aucun client ne correspond
        } catch (NoResultException e) {
            // Aucun client correspondant n'a été trouvé
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
