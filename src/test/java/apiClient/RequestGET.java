package apiClient;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

/**
 * @autor : eynar.pari
 * @date : 03/10/2020.
 **/
public class RequestGET implements  IRequest {
    @Override
    public Response send(String url) {

        Response response = given()
                            .when()
                            .get(url);
        return response;
    }
}
