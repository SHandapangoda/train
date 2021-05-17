package servlets;

import model.train;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "choseTrainServlet")
public class choseTrainServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ArrayList<train> trains=(ArrayList<train>)(getServletContext().getAttribute("train"));
        train tr1=null;

        for(int i=0 ; i<trains.size();i++){
            if (trains.get(i).getTrainName().equals(request.getParameter("train_name")))
            {
                tr1= trains.get(i);
                break;
            }
        }

request.getRequestDispatcher("");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
