package booking;

import model.train;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class checkTrain {


    public ArrayList<train>getAllTrains(Connection connection) {
        ArrayList trains=new ArrayList();
        String p = "";
        String host =   "jdbc:mysql://localhost:3306/department_of_railway" + p;

        // Step 1: Loading or registering Oracle JDBC driver class
        try {

            Class.forName("com.mysql.jdbc.Driver");
        }
        catch(ClassNotFoundException cnfex) {

            System.out.println("Problem in loading or "
                    + "registering MS Access JDBC driver");
            cnfex.printStackTrace();
        }

        try
        {
            Connection con = DriverManager.getConnection(host);

            //To prevent SQL Injection

            //‌to be changed according to database tables
            String q = "SELECT * FROM train1";

            PreparedStatement statement = con.prepareStatement(q);

            //    statement.setString(1, origin);
            //  statement.setString(2, destination);

            ResultSet r = statement.executeQuery();

            boolean isFound = false;

            while(r.next() && !isFound)
            {
                isFound = true;
            }
/*
            if (isFound)
            {
                q = "SELECT PRICE FROM FEATURES WHERE TYPE = 0";
                statement = con.prepareStatement(q);
                r = statement.executeQuery();

                while (r.next())
                {
                    price = r.getInt(1);
                }
            }
*/
            statement.close();
            r.close();
            con.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        try
        {
            Statement stmt = connection.createStatement();
            String sql = "SELECT * FROM train1 ";
            ResultSet rs = stmt.executeQuery(sql);


            while (rs.next())
            {
                String departure = rs.getString("dep");
                String destination = rs.getString("des");
                String trainName = rs.getString("trainName");

                train tr1=new train(destination,departure,trainName);
                trains.add(tr1);
                /*boolean isChanged = rs.getBoolean("isChanged");



                int totalSeats = rs.getInt("TotalSeats");
                int currentSeats = rs.getInt("CurrentSeats");



                Date departureDate = rs.getDate("DepartureDate");
                Date arrivalDate = rs.getDate("ArrivalDate");

                int economySeats = rs.getInt("EconomySeats");
                int businessSeats = rs.getInt("BusinessSeats");
                int firstSeats = rs.getInt("FirstSeats");

                int oldESeats = rs.getInt("OldESeats");
                int oldBSeats = rs.getInt("OldBSeats");
                int oldFSeats = rs.getInt("OldFSeats");
                int oldTSeats = rs.getInt("OldTSeats");

                Flight f = new Flight(isChanged, oldESeats, oldBSeats, oldFSeats, oldTSeats, flightName,null, totalSeats, currentSeats, departureCity, arrivalCity, departureDate, arrivalDate, economySeats, businessSeats, firstSeats);
                flights.add(f);


                ArrayList<Seat> seats = new ArrayList();

                Statement stmt1 = con.createStatement();
                sql = "Select * from Seats where flightName = '" +flightName+ "'";
                ResultSet r = stmt1.executeQuery(sql);

                while(r.next())
                {

                    int seatnumber = r.getInt("SeatNumber");
                    String cEmail = r.getString("CustomerEmail");
                    String ftype = r.getString("FeatureType");

                    Customer c = null;
                    for(int j = 0; j < customers.size(); j++)
                    {
                        if (customers.get(j).getEmail().equals(cEmail))
                        {    c = customers.get(j);
                            break;
                        }
                    }

                    Features fet = null;

                    if(ftype.equals("Economy"))
                        fet = features.get(0);
                    if(ftype.equals("Business"))
                        fet = features.get(1);
                    if(ftype.equals("First Class"))
                        fet = features.get(2);

                    Seat s = new Seat(seatnumber, f,fet,c);
                    seats.add(s);

                    if (c!=null)
                        c.setSeat(s);
                }

                f.setSeats(seats);
            }*/

        }
    }
        catch (SQLException ex ) {
            Logger.getLogger(checkTrain.class.getName()).log(Level.SEVERE, null,ex);
            System.out.println(ex.getMessage());
        }
        return trains;
}

   /* public static int getPrice(String origin, String destination)
    {
        int price = 0;
        //get db path
        String p = "";

        try
        {
            p = new File(checkTrain.class.getProtectionDomain().getCodeSource().getLocation().toURI()).getPath() + "\\department_of_railways";
        }
        catch (URISyntaxException ex)
        {
            System.out.println("Error loading database file.");
        }

        String host =   "jdbc:mysql://localhost:3306/department_of_railway" + p;

        // Step 1: Loading or registering Oracle JDBC driver class
        try {

            Class.forName("com.mysql.jdbc.Driver");
        }
        catch(ClassNotFoundException cnfex) {

            System.out.println("Problem in loading or "
                    + "registering MS Access JDBC driver");
            cnfex.printStackTrace();
        }

        try
        {
            Connection con = DriverManager.getConnection(host);

            //To prevent SQL Injection

            PreparedStatement statement = null;
//‌to be changed according to database tables
            String q = "SELECT * FROM train1";

            statement = con.prepareStatement(q);

        //    statement.setString(1, origin);
          //  statement.setString(2, destination);

            ResultSet r = statement.executeQuery();

            boolean isFound = false;

            while(r.next() && !isFound)
            {
                isFound = true;
            }

            if (isFound)
            {
                q = "SELECT PRICE FROM FEATURES WHERE TYPE = 0";
                statement = con.prepareStatement(q);
                r = statement.executeQuery();

                while (r.next())
                {
                    price = r.getInt(1);
                }
            }

            statement.close();
            r.close();
            con.close();
        }
        catch (SQLException ex)
        {

        }

        return price;
    }

*/
}
