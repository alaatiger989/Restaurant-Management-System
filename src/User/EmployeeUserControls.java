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
public class EmployeeUserControls {
    private int orderCounter = 0;
    private int registeredOffersCounter = 0;
    public void addOrder(String mealName, String additions, String mealPrice, String creatorName , String customer , String date) {
        getActivatedMeals(mealName);
        Connection myConnObj = null;
        Statement myStatObj = null;
        ResultSet myResObj = null;

        if (orderCounter == 0) {
            String query = "Insert Into `order` Values ('" + mealName + "' , '" + additions + "' , '" + mealPrice + "' , '" + creatorName + "' , '"+customer+"' , '"+date+"')";

            try {
                myConnObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant_management_system", "root", "1234");
                PreparedStatement ps = myConnObj.prepareStatement(query);
                ps.executeUpdate();

            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "This Order " + mealName + " is already Existed , Enter another one.");
        }

    }

    /**
     * *******************************************************************************************************************************************************************************
     */
    /**
     * ******************** --------------------------------- Update Meal
     * ----------------------------------------------------------******
     */
    public void updateOrder(String mealName, String additions, String mealPrice, String creatorName , String customer,String date,  String oldDate) {
        Connection myConnObj = null;
        Statement myStatObj = null;
        ResultSet myResObj = null;
        

        String query = "update `order` set meal_name = '" + mealName + "' , additions = '"+additions+"' , price = '"+mealPrice+"' , creator_name = '"+creatorName+"'   where date = '" + oldDate + "' ";
        System.out.println(query);
        try {
            myConnObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant_management_system", "root", "1234");
            PreparedStatement ps = myConnObj.prepareStatement(query);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    /**
     * *******************************************************************************************************************************************************************************
     */
    public void deleteOrder(String date) {
        Connection myConnObj = null;
        Statement myStatObj = null;
        ResultSet myResObj = null;
        

        String query = "Delete from `order` where date = '"+date+"'";
        System.out.println(query);
        try {
            myConnObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant_management_system", "root", "1234");
            PreparedStatement ps = myConnObj.prepareStatement(query);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    /**
     * *******************************************************************************************************************************************************************************
     */
    
    private void getActivatedMeals(String mealName) {
        Connection myConnObj = null;
        Statement myStatObj = null;
        ResultSet myResObj = null;

        String query = "Select * from meal";
        try {
            myConnObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant_management_system", "root", "1234");
            myStatObj = myConnObj.createStatement();
            myResObj = myStatObj.executeQuery(query);
            while (myResObj.next()) {

                String name = myResObj.getString("meal_name");
                if (mealName.equalsIgnoreCase(name)) {
                   
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private void getActivatedOffersForUser(String offerName , String username , String isGift) {
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
                if (offerName.equalsIgnoreCase(name) && registered_username.equalsIgnoreCase(username)) {
                    
                   registeredOffersCounter++;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void registerOffer(String offerName, String offerStartDate, String offerEndDate, String username, String isGift, String offerPrice, String offerDescription , String userType) {
        getActivatedOffersForUser(offerName , username , "No");
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
    
    
    /*************************************************** Send Gift **********************************************/
    
    public void sendGift(String offerName, String offerStartDate, String offerEndDate, String customerUsername, String isGift, String offerPrice, String offerDescription , String customerType, Double totalPrice)
    {
        getActivatedOffersForUser(offerName , customerUsername , "Yes");
        Connection myConnObj = null;
        Statement myStatObj = null;
        ResultSet myResObj = null;

        if (registeredOffersCounter == 0) {
            String query = "Insert Into `registered_offers` Values ('" + offerName + "' , '" + offerStartDate + "' , '" + offerEndDate + "' , '" + customerUsername + "' , '"+isGift+"' , '"+offerPrice+"' , '"+offerDescription+"' , '"+customerType+"')";

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
