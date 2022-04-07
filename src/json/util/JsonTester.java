package json.util;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class JsonTester {

    public static String getJSONFromURL(String strUrl) {
        String jsonText = "";

        try {
            URL url = new URL(strUrl);
            InputStream is = url.openStream();

            BufferedReader bufferedReader =
                    new BufferedReader(new InputStreamReader(is));

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                jsonText += line + "\n";
            }

            is.close();
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return jsonText;
    }

    public static void main(String[] args) {
        //String strJson = getJSONFromFile("C:/Users/BoostMyTool/Desktop/example.json");
        String strJson = getJSONFromURL(
                "http://info.venturepulse.org:8080/service-webapp/api/AllEmployeeResources"
        );

        System.out.println(strJson);

        try {
            JsonParser parser = new JsonParser();
            Object object = parser.parse(strJson);
            JsonObject mainJsonObject = (JsonObject) object;

            // empName
            String String = "";
            String firstName = String; mainJsonObject.get("empName");
            System.out.println("First Name : " + firstName);


        }
        catch(Exception ex) {
            ex.printStackTrace();
        }

    }
}

