package com.amina.vol.servlets;

import com.amina.vol.entites.Aeroports;
import com.amina.vol.entites.Vol;
import com.amina.vol.services.AeroportsService;
import com.amina.vol.services.VolService;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;
@WebServlet(name = "dashboard",value = "/dashboard")

public class dashbordServlet extends HelloServlet{

    VolService volService =new VolService();
    AeroportsService aeroportsService = new AeroportsService();

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        List<Vol> vols = volService.findAllVols();
        List<Aeroports> aeroports =aeroportsService.findAllAeroports();

        request.setAttribute("vols", vols);
        request.setAttribute("aeroports", aeroports);

        try {
            RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/dashboard.jsp");

            // Transmettez la demande à la page JSP
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        }
    }
     }

