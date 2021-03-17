/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Resturantmanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alaa_Sayed
 */
public class CreatingTables {

    public CreatingTables() {
        Connection Conn;
        String query = "CREATE TABLE customer_grades ( \n" +
"        reward_type VARCHAR(200) , \n" +
"        reward_date VARCHAR(200),\n" +
"        username VARCHAR(200),  \n" +
                "        first_name VARCHAR(200),  \n" +
                "        last_name VARCHAR(200),  \n" +
                "        grade VARCHAR(200),  \n" +
                "        total_grade VARCHAR(200),  \n" +
                
                "targeted_user VARCHAR(200));";
        
        String query2 = "CREATE TABLE meal ( \n" +
"        meal_name VARCHAR(200) , \n" +
"        meal_ingredients VARCHAR(200),\n" +
"        meal_price VARCHAR(200), \n" +
                "creator_name VARCHAR(200));";
        
        String query3 = "CREATE TABLE offer ( \n" +
"        offer_name VARCHAR(200) , \n" +
"        offer_event VARCHAR(200),\n" +
"        offerDescription VARCHAR(200), \n" +
                 "offer_price VARCHAR(200), \n" +
                "start_date VARCHAR(200), \n" +
                "end_date VARCHAR(200), \n" +
                "creator_name VARCHAR(200) \n" +
"        );";
        
        String query4 = "CREATE TABLE order ( \n" +
"        meal_name VARCHAR(200) , \n" +
"        additions VARCHAR(200),\n" +
"        price VARCHAR(200), \n" +
                 "order_maker VARCHAR(200), \n" +
                 "order_customer VARCHAR(200), \n" +
                "date VARCHAR(200) \n" +
"       );";
        
        String query6 = "CREATE TABLE questions ( \n" +
"        reward_type VARCHAR(200), \n" +
"        required_time VARCHAR(200),\n" +
"        reward_date VARCHAR(200), \n" +
                 
                 "question VARCHAR(200), \n" +
                "choice_a VARCHAR(200), \n" +
                "choice_b VARCHAR(200), \n" +
                "choice_c VARCHAR(200), \n" +
                "choice_d VARCHAR(200), \n" +
                "answer VARCHAR(200), \n" +
                "question_grade VARCHAR(200) \n" +
                "targeted_user VARCHAR(200) \n" +
"        );";
        
       
        
        String query7 = "CREATE TABLE registered_offers ( \n" +
"        offer_name VARCHAR(200) , \n" +
"        offer_start_date VARCHAR(200),\n" +
"        offer_end_date VARCHAR(200), \n" +
                 "registered_username VARCHAR(200) \n" +
                "gift VARCHAR(200) \n" +
                "offer_price VARCHAR(200) \n" +
                "offer_description VARCHAR(200) \n" +
                "user_type VARCHAR(200) \n" +
              
"       );";
        String query8 = "CREATE TABLE reward ( \n" +

"        reward_type VARCHAR(200),\n" +
"        required_time VARCHAR(200), \n" +
                 "reward_date VARCHAR(200), \n" +
                "targeted_user VARCHAR(200), \n" +
                
                 
                "creator_name VARCHAR(200));" ;

        String query9 = "CREATE TABLE user ( \n" +

"        username VARCHAR(200),\n" +
                "        password VARCHAR(200),\n" +
                "        first_name VARCHAR(200),\n" +
                "        last_name VARCHAR(200),\n" +
                "        type VARCHAR(200),\n" +
                
                 "        seen_offers VARCHAR(200),\n" +
                "        seen_gifts VARCHAR(200),\n" +
"        view_exam VARCHAR(200));"; 
        String query5 = "Insert Into user Values('admin' , '1234' , 'Admin' , '.RMS' , 'Admin' ,  '0', '0')";
        
            try { 
                Conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant_management_system" , "root" ,"1234");
            Statement ps = Conn.createStatement();
            ps.executeUpdate(query);
            ps.executeUpdate(query2);
             ps.executeUpdate(query3);
              ps.executeUpdate(query4);
               
               ps.executeUpdate(query6);
               ps.executeUpdate(query7);
               ps.executeUpdate(query8);
               ps.executeUpdate(query9);
               ps.executeUpdate(query5);
            } catch (SQLException ex) {
                Logger.getLogger(CreatingDB.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
}
