/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Offers;

/**
 *
 * @author thegh
 */
public class SelectedOfferModel {
    private static String offerName;
    private static String offerEvent;
    private static String offerDescription;
    private static String offerPrice;
    private static String offerStartDate;
    private static String offerEndDate;

    public static String getOfferName() {
        return offerName;
    }

    public static void setOfferName(String offerName) {
        SelectedOfferModel.offerName = offerName;
    }

    public static String getOfferEvent() {
        return offerEvent;
    }

    public static void setOfferEvent(String offerEvent) {
        SelectedOfferModel.offerEvent = offerEvent;
    }

    public static String getOfferDescription() {
        return offerDescription;
    }

    public static void setOfferDescription(String offerDescription) {
        SelectedOfferModel.offerDescription = offerDescription;
    }

    public static String getOfferPrice() {
        return offerPrice;
    }

    public static void setOfferPrice(String offerPrice) {
        SelectedOfferModel.offerPrice = offerPrice;
    }

    public static String getOfferStartDate() {
        return offerStartDate;
    }

    public static void setOfferStartDate(String offerStartDate) {
        SelectedOfferModel.offerStartDate = offerStartDate;
    }

    public static String getOfferEndDate() {
        return offerEndDate;
    }

    public static void setOfferEndDate(String offerEndDate) {
        SelectedOfferModel.offerEndDate = offerEndDate;
    }
    
    
}
