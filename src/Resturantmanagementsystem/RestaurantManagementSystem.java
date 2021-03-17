/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Resturantmanagementsystem;

import LoginSystem.Login;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alaa_Sayed
 */
public class RestaurantManagementSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        new CreatingDB();
        SplashScreen splashScreen = new SplashScreen();
        splashScreen.setVisible(true);
       
        try {
            
            for(int i = 0 ; i <=100 ; i++)
            {
                Thread.sleep(40);
                SplashScreen.jLabel1.setText("" + i);
                SplashScreen.jProgressBar1.setValue(i);
                if(i == 100)
                {
                    splashScreen.dispose();
                    try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            
        } catch (InstantiationException ex) {
           
        } catch (IllegalAccessException ex) {
           
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            
        }
                    new Login().setVisible(true);
                }
            }
        } catch (InterruptedException ex) {
            
        }
    }
    
}
