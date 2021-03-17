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
 * @author Alaa_Sayed
 */
public class StudentUserControls {
    private int courseCounter = 0;
    public void addNewCourse(String courseName)
    {
        getStudentCourses(courseName);
        if(courseCounter == 0)
        {
            Connection myConnObj = null;
            Statement myStatObj =null;
            ResultSet myResObj = null;
        
        
            String query = "Insert Into student Values ('"+UserModel.getUsername()+"' , '"+UserModel.getFirstName()+"' , '"+UserModel.getLastName()+"' , '"+courseName+"')";

        
            try{
                myConnObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/learning_management_system" , "root" ,"1234");
                PreparedStatement ps = myConnObj.prepareStatement(query);
                ps.executeUpdate();

            }
            catch(SQLException e)
            {
                e.printStackTrace();
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "This Course is Already registered ");
        }
    }

    public void deleteCourse(String courseName)
    {
            Connection myConnObj = null;
            Statement myStatObj =null;
            ResultSet myResObj = null;
        
        
            String query = "Delete from student where course_regiestered = '"+courseName+"' and username = '"+UserModel.getUsername()+"'";

        
            try{
                myConnObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/learning_management_system" , "root" ,"1234");
                PreparedStatement ps = myConnObj.prepareStatement(query);
                ps.executeUpdate();

            }
            catch(SQLException e)
            {
                e.printStackTrace();
            }
    }
    private void getStudentCourses(String courseName) {
        Connection myConnObj = null;
        Statement myStatObj = null;
        ResultSet myResObj = null;

        String query = "Select * from student where username = '"+UserModel.getUsername()+"'";
        try {
            myConnObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/learning_management_system", "root", "1234");
            myStatObj = myConnObj.createStatement();
            myResObj = myStatObj.executeQuery(query);
            while (myResObj.next()) {
                String course_name = myResObj.getString("course_regiestered");
                if(course_name.equalsIgnoreCase(courseName))
                {
                    courseCounter++;
                }
                
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
