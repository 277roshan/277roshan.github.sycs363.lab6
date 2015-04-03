package howard.edu.sycs363.spring15.lab3;

import static org.junit.Assert.*;

public class Test {

	@org.junit.Test
	public void testAdd() {
		// method Add is tested
		   IntegerArrayList tester = new IntegerArrayList(1);
		   
		   tester.add(10);
		   //Accomodates even when you add items that exceed the indicated size 1.
		   tester.add(20);

		   // Tests
		   assertEquals("Should return 10", 10, tester.get(0));
		   assertEquals("Should return 10", 20, tester.get(1));
		 } 

	@org.junit.Test
	public void test2Add() {
		// method Add is tested
		   IntegerArrayList tester = new IntegerArrayList();
		   tester.add(0,10);
		   tester.add(1,57);

		   // Tests
		   assertEquals("Should return 10", 10, tester.get(0));
		   assertEquals("Should return 57", 57, tester.get(1));
		 } 
	
	@org.junit.Test
	public void testGet() {
		// method Get is tested
		   IntegerArrayList tester = new IntegerArrayList();
		  
		   tester.add(0,10);
		   tester.add(1,57);

		   // Tests
		   assertEquals("Should return 10", 10, tester.get(0));
		   assertEquals("Should return 57", 57, tester.get(1));
		 } 

	
	@org.junit.Test
	public void testindexOf() {
		// method indexOf is tested
		   IntegerArrayList tester = new IntegerArrayList();
		   tester.add(0,10);
		   tester.add(1,52);

		   // Tests
		   assertEquals("Should return 0", 0, tester.indexOf(10));
		   assertEquals("Should return 1", 1, tester.indexOf(52));
		   assertEquals("Should return -1", -1, tester.indexOf(89));
		   
		 } 
	
	@org.junit.Test
	public void testisEmpty() {
		// method isEmpty is tested
		   IntegerArrayList tester = new IntegerArrayList();
		   
		// Tests
		   assertEquals("Should return true", true, tester.isEmpty());
		   
		   tester.add(0,10);
		   tester.add(1,52);

		   // Tests
		   assertEquals("Should return false", false, tester.isEmpty());
		   
		 } 
	
	
	@org.junit.Test
	public void testremove() {
		// method remove is tested
		   IntegerArrayList tester = new IntegerArrayList();
	      
		   tester.add(0,10);
		   tester.add(1,52);

		   // Tests
		   assertEquals("Should return 10", 10, tester.remove(0));
		   assertEquals("Should return 52", 52, tester.remove(0));
		   
		 } 
	
}
