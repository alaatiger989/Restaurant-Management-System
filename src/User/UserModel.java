/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

/**
 *
 * @author Alaa_Sayed
 */
public class UserModel {
    private static String username;
    private static String password;
    private static String firstName;
    private static String lastName;
    private static String type;

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        UserModel.username = username;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        UserModel.password = password;
    }

    public static String getFirstName() {
        return firstName;
    }

    public static void setFirstName(String firstName) {
        UserModel.firstName = firstName;
    }

    public static String getLastName() {
        return lastName;
    }

    public static void setLastName(String lastName) {
        UserModel.lastName = lastName;
    }

    public static String getType() {
        return type;
    }

    public static void setType(String type) {
        UserModel.type = type;
    }
    
    
}
