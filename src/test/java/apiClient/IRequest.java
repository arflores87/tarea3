package apiClient;

import io.restassured.response.Response;

/**
 * @autor : eynar.pari
 * @date : 03/10/2020.
 **/
public interface IRequest {
        Response send (String url);
}
