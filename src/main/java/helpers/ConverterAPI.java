package helpers;

import io.restassured.response.Response;

public class ConverterAPI extends APIHelper {

	public static Response convertDateString() {
		String apiPath = "api/unix-timestamp-converter/";
		String s = "2016-01-01%202:3:22";
		Response getResponse = APIHelper.get(apiPath, s);

		return getResponse;
	}

	public static Response convertUnixTimeStamp() {
		String apiPath = "api/unix-timestamp-converter/";
		String s = "1451613802";
		Response getResponse = APIHelper.get(apiPath, s);

		return getResponse;
	}

	public static Response convertInvalidData() {
		String apiPath = "api/unix-timestamp-converter/";
		String s = "sdfasd";
		Response getResponse = APIHelper.get(apiPath, s);

		return getResponse;
	}
}
