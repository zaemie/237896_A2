package com.uum.assigment2;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class CombineJson {
    public JSONObject json;
    public JSONArray array, array1, array2;
    public JSONObject item;
    public String matrik, matrik1, matrik2;

    public void combinejson(JSONObject listdetail, JSONObject keyword, JSONObject noLine) {
        try {
            array = listdetail.getJSONArray("information");
            array.put(keyword);
            array.put(noLine);
        } catch (JSONException ex) {
            Logger.getLogger(CombineJson.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(listdetail.toString());
    }
}
