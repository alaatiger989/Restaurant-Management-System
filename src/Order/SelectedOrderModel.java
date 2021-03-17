/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Order;

/**
 *
 * @author thegh
 */
public class SelectedOrderModel {
    private static String mealName;
    private static String additions;
    private static String mealPrice;
    private static String creatorName ;
    private static String customer ;
    private static String date;

    public static String getMealName() {
        return mealName;
    }

    public static void setMealName(String mealName) {
        SelectedOrderModel.mealName = mealName;
    }

    public static String getAdditions() {
        return additions;
    }

    public static void setAdditions(String additions) {
        SelectedOrderModel.additions = additions;
    }

    public static String getMealPrice() {
        return mealPrice;
    }

    public static void setMealPrice(String mealPrice) {
        SelectedOrderModel.mealPrice = mealPrice;
    }

    public static String getCreatorName() {
        return creatorName;
    }

    public static void setCreatorName(String creatorName) {
        SelectedOrderModel.creatorName = creatorName;
    }

    public static String getCustomer() {
        return customer;
    }

    public static void setCustomer(String customer) {
        SelectedOrderModel.customer = customer;
    }

    public static String getDate() {
        return date;
    }

    public static void setDate(String date) {
        SelectedOrderModel.date = date;
    }
    
    
}
