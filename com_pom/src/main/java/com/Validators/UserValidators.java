package com.Validators;

import org.testng.Assert;

public class UserValidators {

    /***
     * This method validates if user has completed 50% of their tasks
     * @param userId
     * @param completedPercentage
     */
    public void validateUserTaskPercentageGreaterThan50(int userId, int completedPercentage){

       Assert.assertTrue(completedPercentage > 50,"User ID: " + userId + " has less than 50% todos completed.");
    }

}
