package com.userTodos.Tests;


import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

import com.utils.UserUtils;
import com.validators.UserValidators;

import ApiHelpers.UserHelpers;

public class UserTodosTest{
    UserHelpers helpers=new UserHelpers();
    UserValidators validators=new UserValidators();

    
    @Test(description = "Verify Users belonging to City FanCode has completed 50% of their Todos")
    public void testUsersInFanCodeCityHaveMoreThanHalfTodosCompleted() {
            
        //Given User has the todo tasks
            JSONArray users = helpers.getUsers();
            JSONArray todos = helpers.getTodos();
        
            for (int i = 0; i < users.length(); i++) {
                JSONObject user = users.getJSONObject(i);
        
        //And: User belongs to the city FanCode
                
            if (UserUtils.isUserInFanCodeCity(user)) {
                   
        // Then: User Completed task percentage should be greater than 50%
                int userId = user.getInt("id");
                int completedPercentage = UserUtils.getCompletedTodosCount(todos, userId);
                validators.validateUserTaskPercentageGreaterThan50(userId,completedPercentage);
                  
            }
        }
    }
            
        


}
