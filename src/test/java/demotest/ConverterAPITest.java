package demotest;

import org.testng.Assert;
import org.testng.annotations.Test;
import helpers.ConverterAPI;
import io.restassured.response.Response;

public class ConverterAPITest extends ConverterAPI {

	@Test
	public void ConvertDateToUnixTimeStamp() {
		Response res = ConverterAPI.convertDateString();
		String jsonResponseString = res.asString();
		System.out.println("Read Response::\n"+ jsonResponseString);
		Assert.assertEquals(res.statusCode(), 200);
		Assert.assertEquals(res.body(), 1451613802);
	}

	@Test
	public void ConvertUnixTimeStampToDate() {
		Response res = ConverterAPI.convertUnixTimeStamp();
		String jsonResponseString = res.asString();
		System.out.println("Read Response::\n"+ jsonResponseString);
		Assert.assertEquals(res.statusCode(), 200);
		Assert.assertEquals(res.body(), "2016-01-01%202:3:22");
	}

	@Test
	public void ConvertInvalidDataToUnixTimeStamp() {
		Response res = ConverterAPI.convertInvalidData();
		String jsonResponseString = res.asString();
		System.out.println("Read Response::\n"+ jsonResponseString);
		Assert.assertEquals(res.statusCode(), 503);
	}

}
