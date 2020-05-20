package com.project.housingproject.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;

import com.project.housingproject.services.ExternalAPI;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import java.net.URLConnection;

@Service
public class ExternalAPIImpl implements ExternalAPI {  // 外部API
    private static String readAll(Reader rd) throws IOException {
        StringBuilder sb = new StringBuilder();
        int cp;
        while ((cp = rd.read()) != -1) {
            sb.append((char) cp);
        }
        return sb.toString();
    }

    public static JSONObject getRequestFromUrl(String url) throws IOException, JSONException {
        URL realUrl = new URL(url);
        URLConnection conn = realUrl.openConnection();
        InputStream instream = conn.getInputStream();
        try {
            BufferedReader rd = new BufferedReader(new InputStreamReader(instream, Charset.forName("UTF-8")));
            String jsonText = readAll(rd);
            JSONObject json = new JSONObject(jsonText);
            return json;
        } finally {
            instream.close();
        }
    }

    public String getResult(int page) throws IOException, JSONException {
// 请求示例 url 默认请求参数已经做URL编码
        String url = "http://api01.idataapi.cn:8000/news/qihoo?kw=%E6%88%BF%E6%BA%90&pageToken="+page+"&apikey=uwz1YRUYuYtSX6Y15FBww2Rq53W7ILqDgopdmCr0O8DXkWAvt10PPt4JgoToEKPz";
        JSONObject json = getRequestFromUrl(url);
        System.out.println(json.toString());
        return json.toString();
    }
    public String getWeather(String id) throws IOException, JSONException {  //根据地区编号进行天气查询
        String url = "http://api.map.baidu.com/weather/v1/?district_id=222405&ak=VZMGLRdK3GbYBCQpsK8acvi9qddB3KPf&data_type=all&district_id="+id;
        JSONObject json = getRequestFromUrl(url);
        System.out.println(json.toString());
        return json.toString();
    }

    @Override
    public String getCurrentLocation() throws IOException, JSONException {
        String url = "https://api.map.baidu.com/location/ip?ak=pBwCDR7fP4vgWVkUFSHDpbNupbKmGT6r&coor=bd09ll";
        JSONObject json = getRequestFromUrl(url);
        System.out.println(json.toString());
        return json.toString();
    }
}
