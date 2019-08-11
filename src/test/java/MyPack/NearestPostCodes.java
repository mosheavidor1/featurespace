package MyPack;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;

public class NearestPostCodes {


    public static void PostCodesNearby() throws IOException {



        // use OKHttp client to create the connection and retrieve data
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()

                .url("http://api.postcodes.io/postcodes/CB3%200FA/nearest")
                .build();


        Response response = client.newCall(request).execute();
        String jsonData = response.body().string();
        // parse JSON
        JSONObject mainJsonObject = new JSONObject(jsonData);
        // get Json object
        JSONArray resultsJson = mainJsonObject.getJSONArray("result");
        JSONObject mainJson=resultsJson.getJSONObject(1);
        JSONObject mainJson2=resultsJson.getJSONObject(2);


        JSONObject codes = mainJson.getJSONObject("codes");

        JSONObject codes2 = mainJson2.getJSONObject("codes");



        System.out.println( "Nearest Post Codes:"+" "+"\n"+codes+codes2);




    }
}




