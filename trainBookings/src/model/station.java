package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class station {
    private String StName;

    public station(String stName){
        this.StName=stName;
    }

    public String getStName() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Timing")) {

                PreparedStatement statement = con.prepareStatement("select *from ");
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();

        }


        return StName;
    }

    public void setStName(String stName) {
        StName = stName;
    }

}
