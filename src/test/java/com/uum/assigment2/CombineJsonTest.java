/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uum.assigment2;

import org.json.JSONObject;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HP
 */
public class CombineJsonTest {
    
    public CombineJsonTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of combinejson method, of class CombineJson.
     */
    @Test
    public void testCombinejson() {
        System.out.println("combinejson");
        JSONObject listdetail = new JSONObject();
        JSONObject keyword = new JSONObject();
        JSONObject noLine = new JSONObject();
        CombineJson instance = new CombineJson();
        instance.combinejson(listdetail, keyword, noLine);
        
    }
    
}
