package SpaceXAPI.TestApi;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import validators.Getv4LaunchesValidator;

public class GetLatestLaunchesTest {

	@Test
	public void GetLatestLaunches()
	{   
		RestAssured.baseURI = "https://api.spacexdata.com";
		RequestSpecification httpRequest = RestAssured.given().relaxedHTTPSValidation();
		Response response = httpRequest.request(Method.GET, "/v4/launches/latest");
		Getv4LaunchesValidator.getInstance().validateV4LatestLaunches(response);
	}

}

