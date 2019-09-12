package MyPack;


import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONObject;

import java.io.IOException;


public class PostCodeApi{
    

    public static void MyGETRequest() throws IOException{


        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()

                .url("http://api.postcodes.io/postcodes/CB3%200FA")
                .build();
        Response response = client.newCall(request).execute();
        String jsonData = response.body().string();

        JSONObject mainJsonObject = new JSONObject(jsonData);

        JSONObject Object = mainJsonObject.getJSONObject("result");


        System.out.println( "Name of the Country:"+" "+Object.get("country").toString());
        System.out.println( "Name of the Region:"+" "+Object.get("region"));

    }



}






  
  




