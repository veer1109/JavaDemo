package com.my;

import javax.net.ssl.HttpsURLConnection;
import java.net.URL;

public class CheckWebSiteStatus {

    public static  void main(String []arg)
    {
        try {
            String httpsURL = "https://www.villaplus.com";
            URL myUrl = new URL(httpsURL);
            HttpsURLConnection conn = (HttpsURLConnection) myUrl.openConnection();

            conn.setRequestMethod("GET");
            conn.connect();
            int code = conn.getResponseCode();

            System.out.println(code);
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
