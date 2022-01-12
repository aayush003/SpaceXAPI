package validators;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.parsing.Parser;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import responsePojo.GetLatestLaunchesResponsePojo;

public class Getv4LaunchesValidator {

	
	private RequestSpecBuilder requestSpecBuilder = new RequestSpecBuilder();
	private static volatile Getv4LaunchesValidator instance;
    private Getv4LaunchesValidator() {
    }

    public static Getv4LaunchesValidator getInstance() {
        if (instance == null) {
            synchronized (Getv4LaunchesValidator.class) {
                if (instance == null) {
                    instance = new Getv4LaunchesValidator();
                }
            }
        }
        return instance;
    }

	public void validateV4LatestLaunches(Response response) {
		
		requestSpecBuilder.setContentType(ContentType.JSON);
		
		RequestSpecification spec = RestAssured.given();
		spec.expect().defaultParser(Parser.JSON);
		
		GetLatestLaunchesResponsePojo getLatestLaunchesResponsePojo = response.as(GetLatestLaunchesResponsePojo.class);
		
		assertEquals(response.getStatusCode(), 200,"Status code validation");
		assertTrue(getLatestLaunchesResponsePojo.isSuccess(),"success status validation");
		assertNotNull(getLatestLaunchesResponsePojo.getId(),"Id of launch validation");
		assertNotNull(getLatestLaunchesResponsePojo.getLinks(), "validate links are present");
		for(int i = 0; i < getLatestLaunchesResponsePojo.getCores().size(); i++)
		{
			assertTrue(getLatestLaunchesResponsePojo.getCores().get(i).isLanding_success(),"landing success validation");
		}
		assertEquals(getLatestLaunchesResponsePojo.getId(),"61d5eca1f88e4c5fc91f1eb7", "validate launch id");
	}
}