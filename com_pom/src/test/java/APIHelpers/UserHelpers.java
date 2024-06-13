package ApiHelpers;

import org.json.JSONArray;

import com.endpoints.Routes;

import static io.restassured.RestAssured.given;
import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class UserHelpers {
    
    /***
     * This method returns list of users 
     * @return
     */
    public JSONArray getUsers(){

       Response response= given()
            .contentType(ContentType.JSON)
            .accept(ContentType.JSON)
        .when()
            .get(Routes.users_url);

            return new JSONArray(response.asString());


    }
    
    /***
     * This method returns todos list of users
     * @return
     */
    public JSONArray getTodos(){

        Response response= given()
             .contentType(ContentType.JSON)
             .accept(ContentType.JSON)
         .when()
             .get(Routes.todos_url);
 
             return new JSONArray(response.asString());
 
 
    }

    

}
