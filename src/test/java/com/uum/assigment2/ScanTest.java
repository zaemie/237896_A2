/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uum.assigment2;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
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
public class ScanTest {
    
    public ScanTest() {
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
     * Test of addTree method, of class Scan.
     */
    @Test
    public void testAddTree() {
        System.out.println("addTree");
        File file = new File("C:\\Users\\HP\\Documents\\NetBeansProjects\\Assignment2\\test");
        Collection<File> all = new ArrayList<>();
        Scan.addTree(file, all);
        
    }

    /**
     * Test of info method, of class Scan.
     */
    @Test
    public void testInfo() {
        System.out.println("info");
        String[] listJavaFile = {};
        Scan instance = new Scan();
        JSONObject expResult = instance.json;
        JSONObject result = instance.info(listJavaFile);
        assertEquals(expResult, result);
        
    }
    
}
