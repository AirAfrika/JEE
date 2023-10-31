package com.amina.vol.connection;


import com.amina.vol.entites.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import lombok.Getter;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import java.util.Properties;

public class Jpa {

    private static Jpa instance = null;
    @Getter
    private final EntityManager entityManager;

    @Getter
    private static EntityManagerFactory entityManagerFactory = null;

    private Jpa() {
        entityManagerFactory = Persistence.createEntityManagerFactory("default");
        entityManager = entityManagerFactory.createEntityManager();


        try {
            Configuration configuration = new Configuration();

            Properties properties = new Properties();

            properties.setProperty("hibernate.connection.url", "jdbc:postgresql://localhost:5432/AirAfrika2");
            properties.setProperty("hibernate.connection.username", "postgres");
            properties.setProperty("hibernate.connection.password", "1234");
            properties.setProperty("hibernate.connection.driver_class", "org.postgresql.Driver");
            properties.setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
            properties.setProperty("hibernate.show_sql", "true");
            properties.setProperty("hibernate.current_session_context_class", "thread");
            properties.setProperty("hibernate.hbm2ddl.auto", "update");

            configuration.setProperties(properties);

            configuration.addAnnotatedClass(Administrateur.class);
            configuration.addAnnotatedClass(Aeroports.class);
            configuration.addAnnotatedClass(Escal.class);
            configuration.addAnnotatedClass(Client.class);
            configuration.addAnnotatedClass(Extra.class);
            configuration.addAnnotatedClass(Reservation.class);
            configuration.addAnnotatedClass(Vol.class);


            StandardServiceRegistryBuilder serviceRegistryBuilder =
                    new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());

            entityManagerFactory = configuration.buildSessionFactory(serviceRegistryBuilder.build());
        } catch (Throwable ex) {
            System.err.println("Initial SessionFactory creation failed: " + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static Jpa getInstance() {
        if (instance == null) {
            instance = new Jpa();
        }
        return instance;
    }

    public void close() {
        if (entityManager != null && entityManager.isOpen()) {
            entityManager.close();
        }
        if (entityManagerFactory != null && entityManagerFactory.isOpen()) {
            entityManagerFactory.close();
        }
    }

}