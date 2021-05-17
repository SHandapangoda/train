package servlets;


import model.train;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "trainServlet")


public class trainServlet extends HttpServlet {


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ArrayList<train> trains=(ArrayList<train>)(getServletContext().getAttribute("trains"));

        ArrayList<train> results = new ArrayList();

        for (int i = 0; i < trains.size(); i++)
        {
            train tr = trains.get(i);

            if ((tr.getDepature().equals(request.getParameter("dep"))) && (tr.getDestination().equals(request.getParameter("des"))))
            {

               /* if (f.getCurrentSeats() >= Integer.parseInt(request.getParameter("people")))
                {
                    if (request.getParameter("class").equals("Economy") && (f.getEconomySeats()>= Integer.parseInt(request.getParameter("people"))))
                    {
                        if (!f.isChanged && !Features.isChanged)
                            results.add(f);
                    }
                    else if (request.getParameter("class").equals("Business") && (f.getBusinessSeats()>= Integer.parseInt(request.getParameter("people"))))
                    {
                        if (!f.isChanged && !Features.isChanged)
                            results.add(f);
                    }
                    else if (request.getParameter("class").equals("First") && (f.getFirstSeats()>= Integer.parseInt(request.getParameter("people"))))
                    {
                        if (!f.isChanged && !Features.isChanged)
                            results.add(f);
                    }
                }*/
            }
            results.add(trains.get(1));
            request.setAttribute("results",results);
            request.getRequestDispatcher("web.jsp").forward(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) {

    }
}
