package com.amina.vol.dao;

import com.amina.vol.entites.Client;
import com.amina.vol.entites.Reservation;
import com.amina.vol.entites.Vol;

import java.util.List;
import java.util.Optional;
public interface ReservationDAO {
    public Optional<Reservation>addReservation(Reservation reservation);
    public Optional<Reservation>updateClient(Reservation reservation);
    public Optional<Reservation>deleteReservation(int reservationId);
    public  Optional<List<Reservation>> findAllReservation() ;
    public Optional<List<Reservation>> findReservationByClient(Client client);
    public Optional<List<Reservation>> findReservationByvol(Vol vol);

}
