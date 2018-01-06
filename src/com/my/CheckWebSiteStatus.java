package com.my;

import javax.net.ssl.HttpsURLConnection;
import java.net.URL;

public class CheckWebSiteStatus {

    public static  void main(String []arg)
    {
      int status=  CheckWebStatus("https://www.villaplus.com");
      System.out.println("Website status is:"+ status);
    }
    public static int CheckWebStatus(String url)
    {
        try {
            //String httpsURL = "https://www.villaplus.com";
            URL myUrl = new URL(url);
            HttpsURLConnection conn = (HttpsURLConnection) myUrl.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();
            int code = conn.getResponseCode();
           System.out.println(conn.getResponseMessage());

            return code;
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        return 0;
    }
}
