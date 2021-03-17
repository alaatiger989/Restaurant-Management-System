/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RewardPrograms;

/**
 *
 * @author Alaa_Sayed
 */
public class SelectedRewardModel {
    private static String rewardType;
    private static String requriedTime;
    private static String dateOfReward;
    private static String targetedUser;

    public static String getTargetedUser() {
        return targetedUser;
    }

    public static void setTargetedUser(String targetedUser) {
        SelectedRewardModel.targetedUser = targetedUser;
    }
    
    public static String getRewardType() {
        return rewardType;
    }

    public static void setRewardType(String rewardType) {
        SelectedRewardModel.rewardType = rewardType;
    }

    public static String getRequriedTime() {
        return requriedTime;
    }

    public static void setRequriedTime(String requriedTime) {
        SelectedRewardModel.requriedTime = requriedTime;
    }

    public static String getDateOfReward() {
        return dateOfReward;
    }

    public static void setDateOfReward(String dateOfReward) {
        SelectedRewardModel.dateOfReward = dateOfReward;
    }
   

   
    
    
}
