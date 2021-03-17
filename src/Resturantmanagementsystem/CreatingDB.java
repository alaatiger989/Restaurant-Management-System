/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Resturantmanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alaa_Sayed
 */
public class CreatingDB {

    private int checker = 0;
    public CreatingDB() {
        ResultSet resultSet;
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant_management_system", "root", "1234");
            resultSet = connection.getMetaData().getCatalogs();
            //iterate each catalog in the ResultSet
            while (resultSet.next()) {
                // Get the database name, which is at position 1
                String databaseName = resultSet.getString(1);
                if(databaseName.equalsIgnoreCase("restaurant_management_system"))
                {
                    System.out.println(databaseName);
                    checker++;
                }
                
            }
            resultSet.close();
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(checker == 0)
        {
            System.out.println("" + checker);
            Connection Conn;
            try { 
                Conn = DriverManager.getConnection("jdbc:mysql://localhost/?user=root&password=1234");
                Statement s=Conn.createStatement();
                int Result=s.executeUpdate("CREATE DATABASE restaurant_management_system");
                System.out.println("Database has been created");
                new CreatingTables();
            } catch (SQLException ex) {
                Logger.getLogger(CreatingDB.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }
    

}
