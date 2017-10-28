package com.uum.assigment2;

import org.json.JSONObject;

public class Assignment2 {
    public static void main(String[] args) {
        String name;
        FindFile find = new FindFile();
        String[] listJavaFile = find.listJavaFile;

        Scan open = new Scan();
        JSONObject listdetail = open.json;
        open.info(listJavaFile);

        FindKeywords key = new FindKeywords();
        key.CountKeyword(listJavaFile);
        JSONObject keyword = key.json;

        FindLine line = new FindLine();
        line.Find(listJavaFile);
        JSONObject noLine = line.json; 

        CombineJson com = new CombineJson();
        com.combinejson(listdetail, keyword, noLine);
    }
}