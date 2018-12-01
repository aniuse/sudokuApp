package com.miageprojet.app;

//import static org.junit.jupiter.api.Assertions.*;

//import org.junit.jupiter.api.Test;

import org.junit.Assert.*;
import org.junit.jupiter.api.Test;

class GrilleImplTest {

	@Test
	public void Constructeurtest() {
		new GrilleImpl(new char[][]{
            {'3', '@', '6', '5', '@', '8', '4', '@', '@'},
            {'5', '2', '@', '@', '@', '@', '@', '@', '@'},
            {'@', '8', '7', '@', '@', '@', '@', '3', '1'},
            {'@', '@', '3', '@', '1', '@', '@', '8', '@'},
            {'9', '@', '@', '8', '6', '3', '@', '@', '5'},
            {'@', '5', '@', '@', '9', '@', '6', '@', '@'},
            {'1', '3', '@', '@', '@', '@', '2', '5', '@'},
            {'@', '@', '@', '@', '@', '@', '@', '7', '4'},
            {'@', '@', '5', '2', '@', '6', '3', '@', '@'}
        });
		}
	
	@Test
	public void getDimensiontest(){
		  
	    
	    org.junit.Assert.Assert.assertEquals(9, new GrilleImpl(new char[][]{
            {'3', '@', '6', '5', '@', '8', '4', '@', '@'},
            {'5', '2', '@', '@', '@', '@', '@', '@', '@'},
            {'@', '8', '7', '@', '@', '@', '@', '3', '1'},
            {'@', '@', '3', '@', '1', '@', '@', '8', '@'},
            {'9', '@', '@', '8', '6', '3', '@', '@', '5'},
            {'@', '5', '@', '@', '9', '@', '6', '@', '@'},
            {'1', '3', '@', '@', '@', '@', '2', '5', '@'},
            {'@', '@', '@', '@', '@', '@', '@', '7', '4'},
            {'@', '@', '5', '2', '@', '6', '3', '@', '@'}
        }).getDimension());
	  
	  }
	@Test
	public void getValuetest(){
		  
	    
	    org.junit.Assert.Assert.assertEquals('3', new GrilleImpl(new char[][]{
            {'3', '@', '6', '5', '@', '8', '4', '@', '@'},
            {'5', '2', '@', '@', '@', '@', '@', '@', '@'},
            {'@', '8', '7', '@', '@', '@', '@', '3', '1'},
            {'@', '@', '3', '@', '1', '@', '@', '8', '@'},
            {'9', '@', '@', '8', '6', '3', '@', '@', '5'},
            {'@', '5', '@', '@', '9', '@', '6', '@', '@'},
            {'1', '3', '@', '@', '@', '@', '2', '5', '@'},
            {'@', '@', '@', '@', '@', '@', '@', '7', '4'},
            {'@', '@', '5', '2', '@', '6', '3', '@', '@'}
        }).getValue(0, 0));
	  
	  }
/**
 * 	@Test

	public void setValuetest(){
		  
	    
	    Assert.assertEquals('4', new GrilleImpl(new char[][]{
            {'3', '@', '6', '5', '@', '8', '4', '@', '@'},
            {'5', '2', '@', '@', '@', '@', '@', '@', '@'},
            {'@', '8', '7', '@', '@', '@', '@', '3', '1'},
            {'@', '@', '3', '@', '1', '@', '@', '8', '@'},
            {'9', '@', '@', '8', '6', '3', '@', '@', '5'},
            {'@', '5', '@', '@', '9', '@', '6', '@', '@'},
            {'1', '3', '@', '@', '@', '@', '2', '5', '@'},
            {'@', '@', '@', '@', '@', '@', '@', '7', '4'},
            {'@', '@', '5', '2', '@', '6', '3', '@', '@'}
        }).setValue(0, 0, '4'));
	  
	  }
 */	  
}

