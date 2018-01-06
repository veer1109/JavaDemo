package com.my;

import javax.net.ssl.HttpsURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class CheckWebSiteStatus {


    public static  void main(String []arg)
    {
        List urls = new ArrayList();
      urls.add("https://www.villaplus.com");
        urls.add("https://t.villaplus.com");
        urls.add("https://m.villaplus.com");
        for (Object u: urls) {

          System.out.println("WEB:"+  u + " Status: "  + CheckWebStatus(u.toString()));
        }


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
            if(code ==200) {
                System.out.println(conn.getResponseMessage());
                return code;
            }
            else if(code==301)
            {
                System.out.println(conn.getResponseMessage());
                return code;
            }
            else if(code==404)
            {
                System.out.println(conn.getResponseMessage());
                return code;
            }


        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        return 0;
    }
}
