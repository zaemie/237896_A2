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
public class FindKeywordsTest {
    
    public FindKeywordsTest() {
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
     * Test of CountKeyword method, of class FindKeywords.
     */
    @Test
    public void testCountKeyword() {
        System.out.println("CountKeyword");
        String[] listJavaFile = {};
        FindKeywords instance = new FindKeywords();
        JSONObject expResult = instance.json;
        JSONObject result = instance.CountKeyword(listJavaFile);
        assertEquals(expResult, result);
        
    }
    
}
