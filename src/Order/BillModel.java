/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Order;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author thegh
 */
public class BillModel {
    private static String customerName;
    private static String customerUserName;
    private static String totalPrice;
    private static List<String> mealName = new ArrayList<>();
    private static List<String> additions= new ArrayList<>();
    private static List<String> price= new ArrayList<>();
    private static List<String> orderMaker= new ArrayList<>();
    
    private static String date;

    public static String getDate() {
        return date;
    }

    public static void setDate(String date) {
        BillModel.date = date;
    }
    

    public static List<String> getMealName() {
        return mealName;
    }

    public static void setMealName(List<String> mealName) {
        BillModel.mealName = mealName;
    }

    public static List<String> getAdditions() {
        return additions;
    }

    public static void setAdditions(List<String> additions) {
        BillModel.additions = additions;
    }

    public static List<String> getPrice() {
        return price;
    }

    public static void setPrice(List<String> price) {
        BillModel.price = price;
    }

    public static List<String> getOrderMaker() {
        return orderMaker;
    }

    public static void setOrderMaker(List<String> orderMaker) {
        BillModel.orderMaker = orderMaker;
    }
    

    public static String getCustomerName() {
        return customerName;
    }

    public static void setCustomerName(String customerName) {
        BillModel.customerName = customerName;
    }

    public static String getCustomerUserName() {
        return customerUserName;
    }

    public static void setCustomerUserName(String customerUserName) {
        BillModel.customerUserName = customerUserName;
    }

    public static String getTotalPrice() {
        return totalPrice;
    }

    public static void setTotalPrice(String totalPrice) {
        BillModel.totalPrice = totalPrice;
    }
    
}
