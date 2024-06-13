package com.Utils;

import org.json.JSONArray;
import org.json.JSONObject;

public class UserUtils {
    
    /***
     * This method returns if user belongs to Fan code city
     * @param user
     * @return
     */
    public static boolean isUserInFanCodeCity(JSONObject user) {
        double lat = user.getJSONObject("address").getJSONObject("geo").getDouble("lat");
        double lng = user.getJSONObject("address").getJSONObject("geo").getDouble("lng");
        return lat > -40 && lat < 5 && lng > 5 && lng < 100;
    }

    /***
     * This method returns the total completed Todos Count
     * @param todos
     * @param userId
     * @return
     */
    public static int getCompletedTodosCount(JSONArray todos, int userId) {
        int completedCount = 0;
        int totalCount = 0;
        for (int i = 0; i < todos.length(); i++) {
            JSONObject todo = todos.getJSONObject(i);
            if (todo.getInt("userId") == userId) {
                totalCount++;
                if (todo.getBoolean("completed")) {
                    completedCount++;
                }
            }
        }
        return totalCount == 0 ? 0 : (completedCount * 100 / totalCount);
    }

}
