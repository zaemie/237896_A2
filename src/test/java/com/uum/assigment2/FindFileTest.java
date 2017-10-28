/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uum.assigment2;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
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
public class FindFileTest {
    
    public FindFileTest() {
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
     * Test of filterJava method, of class FindFile.
     */
    @Test
    public void testFilterJava() {
        System.out.println("filterJava");
        Collection<File> listAllFileName = new ArrayList<>();
        String[] expResult = {};
        String[] result = FindFile.filterJava(listAllFileName);
        assertArrayEquals(expResult, result);
        
    }
    
}
