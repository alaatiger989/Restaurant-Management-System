/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

import RewardPrograms.SelectedRewardModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alaa_Sayed
 */
public class AdminUserControls {

    private int counter = 0;
    private int mealCounter = 0;
    private int offerCounter = 0;
    private int rewardCounter = 0;
    private int questionCounter = 0;
    
    /**
     * ******************** --------------------------------- Update User
     * ----------------------------------------------------------******
     */
    public void updateUser(String username, String password, String firstName, String lastName, String type, String oldUserName) {
        getActivatedUsers(username);
        if (counter == 0) {
            updateSelectedUser(username, password, firstName, lastName, type, oldUserName);
            JOptionPane.showMessageDialog(null, "User Updated Successfully");
        } else {
            JOptionPane.showMessageDialog(null, "Username already Existed, Please Try another one");
        }

    }

    private void getActivatedUsers(String username) {
        Connection myConnObj = null;
        Statement myStatObj = null;
        ResultSet myResObj = null;

        String query = "Select * from user";
        try {
            myConnObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant_management_system", "root", "1234");
            myStatObj = myConnObj.createStatement();
            myResObj = myStatObj.executeQuery(query);
            while (myResObj.next()) {
                String userName = myResObj.getString("username");
                if (username.equalsIgnoreCase(userName)) {
                    counter++;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void updateSelectedUser(String username, String password, String firstName, String lastName, String type, String oldUserName) {
        Connection myConnObj = null;
        Statement myStatObj = null;
        ResultSet myResObj = null;

        String query = "update user set username = '" + username + "' ,password = '" + password + "', first_name = '" + firstName + "' , last_name = '" + lastName + "', type = '" + type + "' where username = '" + oldUserName + "' ";
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
    /**
     * ******************** --------------------------------- Delete User
     * ----------------------------------------------------------******
     */
    public void deleteUser(String userName) {
        Connection myConnObj = null;
        Statement myStatObj = null;
        ResultSet myResObj = null;

        String query = "Delete From user where username = '" + userName + "'";
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
    /**
     * ******************** --------------------------------- Add Meal
     * ----------------------------------------------------------******
     */
    public void addMeal(String mealName, String mealIngredients, String mealPrice, String creatorName) {
        getActivatedMeals(mealName);
        Connection myConnObj = null;
        Statement myStatObj = null;
        ResultSet myResObj = null;

        if (mealCounter == 0) {
            String query = "Insert Into meal Values ('" + mealName + "' , '" + mealIngredients + "' , '" + mealPrice + "' , '" + creatorName + "')";

            try {
                myConnObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant_management_system", "root", "1234");
                PreparedStatement ps = myConnObj.prepareStatement(query);
                ps.executeUpdate();

            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "This Meal " + mealName + " is already Existed , Enter another one.");
        }

    }

    /**
     * *******************************************************************************************************************************************************************************
     */
    /**
     * ******************** --------------------------------- Update Meal
     * ----------------------------------------------------------******
     */
    public void updateMeal(String mealName, String mealIngredients, String mealPrice ,String creatorName, String oldMealName) {
        Connection myConnObj = null;
        Statement myStatObj = null;
        ResultSet myResObj = null;
        

        String query = "update meal set meal_name = '" + mealName + "' , meal_ingredients = '"+mealIngredients+"' , meal_price = '"+mealPrice+"' , creator_name = '"+creatorName+"'   where meal_name = '" + oldMealName + "' ";
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
    public void deleteMeal(String mealName) {
        Connection myConnObj = null;
        Statement myStatObj = null;
        ResultSet myResObj = null;
        

        String query = "Delete from meal where meal_name = '"+mealName+"'";
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
                    mealCounter++;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    /**
     * ******************** --------------------------------- Add Offer
     * ----------------------------------------------------------******
     */
    public void addOffer(String offerName, String offerEvent, String offerDescription,String offerPrice,String startDate , String endDate, String creatorName) {
        getActivatedOffers(offerName);
        Connection myConnObj = null;
        Statement myStatObj = null;
        ResultSet myResObj = null;

        if (offerCounter == 0) {
            String query = "Insert Into offer Values ('" + offerName + "' , '" + offerEvent + "' , '" + offerDescription + "' , '" + offerPrice + "', '" + startDate + "', '" + endDate + "', '" + creatorName + "')";

            try {
                myConnObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant_management_system", "root", "1234");
                PreparedStatement ps = myConnObj.prepareStatement(query);
                ps.executeUpdate();

            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "This Offer " + offerName + " is already Existed , Enter another one.");
        }

    }

    /**
     * *******************************************************************************************************************************************************************************
     */
    /**
     * ******************** --------------------------------- Update Offer
     * ----------------------------------------------------------******
     */
    public void updateOffer(String offerName, String offerEvent, String offerDescription,String offerPrice,String startDate , String endDate, String creatorName, String oldOfferName) {
        Connection myConnObj = null;
        Statement myStatObj = null;
        ResultSet myResObj = null;
        

        String query = "update offer set offer_name = '" + offerName + "' , offer_event = '"+offerEvent+"' , offerDescription = '"+offerDescription+"' ,offer_price = '"+offerPrice+"', start_date = '"+startDate+"' , end_date = '"+endDate+"' ,creator_name = '"+creatorName+"'   where offer_name = '" + oldOfferName + "' ";
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
    public void deleteOffer(String offerName) {
        Connection myConnObj = null;
        Statement myStatObj = null;
        ResultSet myResObj = null;
        

        String query = "Delete from offer where offer_name = '"+offerName+"'";
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
    
    private void getActivatedOffers(String offerName) {
        Connection myConnObj = null;
        Statement myStatObj = null;
        ResultSet myResObj = null;

        String query = "Select * from offer";
        try {
            myConnObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant_management_system", "root", "1234");
            myStatObj = myConnObj.createStatement();
            myResObj = myStatObj.executeQuery(query);
            while (myResObj.next()) {

                String name = myResObj.getString("offer_name");
                if (offerName.equalsIgnoreCase(name)) {
                    offerCounter++;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    /**
     * ******************** --------------------------------- Add Reward
     * ----------------------------------------------------------******
     */
    public void addReward(String rewardType, String rewardDate, String rewardRequiredTime,String targetedUser,String creatorName ) {
        getActivatedRewards(rewardType, rewardDate);
        Connection myConnObj = null;
        Statement myStatObj = null;
        ResultSet myResObj = null;

        if (rewardCounter == 0) {
            String query = "Insert Into reward Values ('" + rewardType + "' , '" + rewardRequiredTime + "' , '" + rewardDate + "' , '" + targetedUser + "', '" + creatorName + "')";

            try {
                myConnObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant_management_system", "root", "1234");
                PreparedStatement ps = myConnObj.prepareStatement(query);
                ps.executeUpdate();

            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "This Reward " + rewardType + " is already Existed , Enter another one.");
        }

    }

    /**
     * *******************************************************************************************************************************************************************************
     */
    /**
     * ******************** --------------------------------- Update Reward
     * ----------------------------------------------------------******
     */
    public void updateReward(String rewardType, String rewardDate, String rewardRequiredTime,String targetedUser,String creatorName, String oldRewardType , String oldRewardDate) {
        Connection myConnObj = null;
        Statement myStatObj = null;
        ResultSet myResObj = null;
        

        String query = "update reward set reward_type = '" + rewardType + "' , reward_date = '"+rewardDate+"' , required_time = '"+rewardRequiredTime+"' ,targeted_user = '"+targetedUser+"', creator_name = '"+creatorName+"' where reward_type = '" + oldRewardType + "' AND reward_date = '"+oldRewardDate+"'";
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
    public void deleteReward(String rewardType , String rewardDate) {
        Connection myConnObj = null;
        Statement myStatObj = null;
        ResultSet myResObj = null;
        

        String query = "Delete from reward where reward_type = '"+rewardType+"' AND reward_date = '"+rewardDate+"'";
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
    
    private void getActivatedRewards(String rewardType , String rewardDate) {
        Connection myConnObj = null;
        Statement myStatObj = null;
        ResultSet myResObj = null;

        String query = "Select * from reward";
        try {
            myConnObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant_management_system", "root", "1234");
            myStatObj = myConnObj.createStatement();
            myResObj = myStatObj.executeQuery(query);
            while (myResObj.next()) {

                String reward_type = myResObj.getString("reward_type");
                String reward_date = myResObj.getString("reward_date");
                if (reward_type.equalsIgnoreCase(rewardType) && reward_date.equalsIgnoreCase(rewardDate)) {
                    rewardCounter++;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    
    /******************************************************************************************************************************************************************************/
    
    public void addQuestion(String rewardType , String requiredTime , String rewardDate ,String question, String choiceA , String choiceB , String choiceC, String choiceD , String choiceAnswer , String grade , String targetedUser)
    {
        getQuestions(rewardType , rewardDate, question);
        Connection myConnObj = null;
        Statement myStatObj = null;
        ResultSet myResObj = null;

        if (questionCounter == 0) {
            String query = "Insert Into questions Values ('" + rewardType + "' , '" + requiredTime + "' , '" + rewardDate + "', '"+question+"' , '"+choiceA+"' , '"+choiceB+"' , '"+choiceC+"' , '"+choiceD+"' , '"+choiceAnswer+"' , '"+grade+"' , '"+targetedUser+"')";

            try {
                myConnObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant_management_system", "root", "1234");
                PreparedStatement ps = myConnObj.prepareStatement(query);
                ps.executeUpdate();

            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "This Question is already Existed For That Exam, Enter another one.");
        }
        
        
    }
    /*****************************************************************************************************************************/
   public void deleteQuestions(String rewardDate )
    {
        Connection myConnObj = null;
        Statement myStatObj = null;
        ResultSet myResObj = null;
        

        String query = "Delete from questions where reward_date = '"+rewardDate+"' AND reward_type = '"+SelectedRewardModel.getRewardType()+"'";
        System.out.println(query);
        try {
            myConnObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant_management_system", "root", "1234");
            PreparedStatement ps = myConnObj.prepareStatement(query);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private void getQuestions(String rewardType ,String rewardDate , String question) {
        Connection myConnObj = null;
        Statement myStatObj = null;
        ResultSet myResObj = null;

        String query = "Select * from questions";
        try {
            myConnObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant_management_system", "root", "1234");
            myStatObj = myConnObj.createStatement();
            myResObj = myStatObj.executeQuery(query);
            while (myResObj.next()) {
                
                String reward_type  = myResObj.getString("reward_type");
                String reward_date = myResObj.getString("reward_date");
                String ques = myResObj.getString("question");
                if(rewardType.equalsIgnoreCase(reward_type) &&rewardDate.equalsIgnoreCase(reward_date) && ques.equalsIgnoreCase(question))
                {
                    questionCounter++;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
