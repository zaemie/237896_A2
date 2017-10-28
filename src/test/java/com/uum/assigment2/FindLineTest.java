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
public class FindLineTest {
    
    public FindLineTest() {
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
     * Test of Find method, of class FindLine.
     */
    @Test
    public void testFind() {
        System.out.println("Find");
        String[] listJavaFile = {};
        FindLine instance = new FindLine();
        JSONObject expResult = instance.json;
        JSONObject result = instance.Find(listJavaFile);
        assertEquals(expResult, result);
        
    }
    
}
