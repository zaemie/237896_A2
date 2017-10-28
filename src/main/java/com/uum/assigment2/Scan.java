package com.uum.assigment2;

import static com.uum.assigment2.FindFile.filterJava;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class Scan {
    LinkedList<String> listFileContent;
    public String semester;
    public String course;
    public String group;
    public String task;
    public String matrik;
    public String name;
    public JSONObject json = new JSONObject();
    public JSONArray array = new JSONArray();
    public JSONObject item;
    
    public Scan() {
        Collection<File> all = new ArrayList<>();
        addTree(new File(System.getProperty("user.dir") + File.separator + "test"), all);
        Collection<File> a = all;
        String[] listJavaFile = filterJava(a);
    }

    static void addTree(File file, Collection<File> all) {
        File[] children = file.listFiles();
        if (children != null) {
            for (File child : children) {
                all.add(child);
                addTree(child, all);
            }
        }
    }
    public JSONObject info(String[] listJavaFile) {
        for (int i = 0; i < listJavaFile.length; i++) {
            try (BufferedReader br = new BufferedReader(new FileReader(listJavaFile[i]))) {
                String readLine;
                while ((readLine = br.readLine()) != null) {
                    if (readLine.contains("//Semester:")) {
                        semester = readLine.replaceAll("\\s*//Semester:\\s*#", "");
                    } else if (readLine.contains("//Course:")) {
                        course = readLine.replaceAll("\\s*//Course:\\s*#", "");
                    } else if (readLine.contains("//Task:")) {
                        task = readLine.replaceAll("\\s*//Task:\\s*#", "");
                    } else if (readLine.contains("//Matrik:")) {
                        matrik = readLine.replaceAll("\\s*//Matrik:\\s*#", "");
                    } else if (readLine.contains("//Name:")) {
                        name = readLine.replaceAll("\\s*//Name:\\s*#", "");
                    }
                }
            } catch (IOException e) {
            }
            try {
                item = new JSONObject();
                item.put("File Name", listJavaFile[i]);
                item.put("Semester", semester);
                item.put("Course", course);
                item.put("Task", task);
                item.put("Matrik", matrik);
                item.put("Name", name);
                array.put(item);

                json.put("information", array);
            } catch (JSONException ex) {
            }
        }
        return json;
    }
}
