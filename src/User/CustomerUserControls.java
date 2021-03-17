/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author thegh
 */
public class CustomerUserControls {
    private int registeredOffersCounter = 0;
    private void getActivatedOffersForUser(String offerName , String username) {
        Connection myConnObj = null;
        Statement myStatObj = null;
        ResultSet myResObj = null;

        String query = "Select * from registered_offers";
        try {
            myConnObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant_management_system", "root", "1234");
            myStatObj = myConnObj.createStatement();
            myResObj = myStatObj.executeQuery(query);
            while (myResObj.next()) {

                String name = myResObj.getString("offer_name");
                String registered_username = myResObj.getString("registered_username");
                String isGift = myResObj.getString("gift");
                if (offerName.equalsIgnoreCase(name) && registered_username.equalsIgnoreCase(username) && isGift.equalsIgnoreCase("NO")) {
                    
                   registeredOffersCounter++;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void registerOffer(String offerName, String offerStartDate, String offerEndDate, String username, String isGift, String offerPrice, String offerDescription , String userType) {
        getActivatedOffersForUser(offerName , username);
        Connection myConnObj = null;
        Statement myStatObj = null;
        ResultSet myResObj = null;

        if (registeredOffersCounter == 0) {
            String query = "Insert Into `registered_offers` Values ('" + offerName + "' , '" + offerStartDate + "' , '" + offerEndDate + "' , '" + username + "' , '"+isGift+"' , '"+offerPrice+"' , '"+offerDescription+"' , '"+userType+"')";

            try {
                myConnObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant_management_system", "root", "1234");
                PreparedStatement ps = myConnObj.prepareStatement(query);
                ps.executeUpdate();

            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "This Order " + offerName + " is already Existed , Enter another one.");
        }
    }
}
