package MyPack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class InvalidAPI {

    public static void InvalidRequest() throws IOException {

        URL urlForGetRequest = new URL("http://api.postcodes.io/postcodes/CB3%200FA/validate");

        String readLine = null;

        HttpURLConnection conection = (HttpURLConnection) urlForGetRequest.openConnection();

        conection.setRequestMethod("GET");



        int responseCode = conection.getResponseCode();

        if (responseCode == HttpURLConnection.HTTP_OK) {

            BufferedReader in = new BufferedReader(

                    new InputStreamReader(conection.getInputStream()));

            StringBuffer response = new StringBuffer();

            while ((readLine = in.readLine()) != null) {

                response.append(readLine);

            }
            in.close();


            System.out.println("Your Result Status is : " + response.toString());

        }
    }
}
