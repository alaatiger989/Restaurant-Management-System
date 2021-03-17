/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Meal;

/**
 *
 * @author Alaa_Sayed
 */
public class SelectedMealModel {
    private static String mealName;
    private static String mealIngredients;
    private static String mealPrice;

    public static String getMealName() {
        return mealName;
    }

    public static void setMealName(String mealName) {
        SelectedMealModel.mealName = mealName;
    }

    public static String getMealIngredients() {
        return mealIngredients;
    }

    public static void setMealIngredients(String mealIngredients) {
        SelectedMealModel.mealIngredients = mealIngredients;
    }

    public static String getMealPrice() {
        return mealPrice;
    }

    public static void setMealPrice(String mealPrice) {
        SelectedMealModel.mealPrice = mealPrice;
    }

    
}
