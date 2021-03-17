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
public class GiftModel {
    private static String offerName;
    private static String offerStartDate;
    private static String offerEndDate;
    private static String customerUserName;
    private static String isGiftYes;
    private static String offerPrice;
    private static String offerDescription;
    private static String userTypeCustomer;
    private static String customerFullName;

    public static String getCustomerFullName() {
        return customerFullName;
    }

    public static void setCustomerFullName(String customerFullName) {
        GiftModel.customerFullName = customerFullName;
    }
    
    
    private static Double totalPrice;

    public static Double getTotalPrice() {
        return totalPrice;
    }

    public static void setTotalPrice(Double totalPrice) {
        GiftModel.totalPrice = totalPrice;
    }
    

    public static String getOfferName() {
        return offerName;
    }

    public static void setOfferName(String offerName) {
        GiftModel.offerName = offerName;
    }

    public static String getOfferStartDate() {
        return offerStartDate;
    }

    public static void setOfferStartDate(String offerStartDate) {
        GiftModel.offerStartDate = offerStartDate;
    }

    public static String getOfferEndDate() {
        return offerEndDate;
    }

    public static void setOfferEndDate(String offerEndDate) {
        GiftModel.offerEndDate = offerEndDate;
    }

    public static String getCustomerUserName() {
        return customerUserName;
    }

    public static void setCustomerUserName(String customerUserName) {
        GiftModel.customerUserName = customerUserName;
    }

    public static String getIsGiftYes() {
        return isGiftYes;
    }

    public static void setIsGiftYes(String isGiftYes) {
        GiftModel.isGiftYes = isGiftYes;
    }

    public static String getOfferPrice() {
        return offerPrice;
    }

    public static void setOfferPrice(String offerPrice) {
        GiftModel.offerPrice = offerPrice;
    }

    public static String getOfferDescription() {
        return offerDescription;
    }

    public static void setOfferDescription(String offerDescription) {
        GiftModel.offerDescription = offerDescription;
    }

    public static String getUserTypeCustomer() {
        return userTypeCustomer;
    }

    public static void setUserTypeCustomer(String userTypeCustomer) {
        GiftModel.userTypeCustomer = userTypeCustomer;
    }
    
    
}
