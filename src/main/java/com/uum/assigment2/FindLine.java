package com.uum.assigment2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class FindLine {
    LinkedList<String> listFileContent;
    public JSONObject json = new JSONObject();
    public JSONArray array = new JSONArray();
    public JSONObject item;
    public int totalLine;
    String task;
    String matrik;

    public JSONObject Find(String[] listJavaFile) {
        for (String listJavaFile1 : listJavaFile) {
            int command = 0;
            int kosong = 0;
            int code = 0;
            try (final BufferedReader br = new BufferedReader(new FileReader(listJavaFile1))) {
                String readLine;
                totalLine = 0;
                while ((readLine = br.readLine()) != null) {
                    if (readLine.contains("//Task:")) {
                        task = readLine.replaceAll("\\s*//Task:\\s*#", "");
                    } else if (readLine.contains("//Matrik:")) {
                        matrik = readLine.replaceAll("\\s*//Matrik:\\s*#", "");
                    }
                    if (readLine.contains("//")) {
                        command++;
                    } else if (readLine.isEmpty()) {
                        kosong++;
                    } else {
                        code++;
                    }
                    totalLine++;
                }
            }catch (IOException e) {
            }
            try {
                item = new JSONObject();
                item.put("Task", task);
                item.put("Matrik", matrik);
                item.put("Command", command);
                item.put("Empty", kosong);
                item.put("Actual", code);
                array.put(item);
                json.put("line", array);
            } catch (JSONException ex) {
            }
        }
        return json;
    }
}
