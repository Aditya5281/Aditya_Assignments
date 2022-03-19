package io.javaBrains;

import static org.junit.jupiter.api.Assumptions.*;
import static org.junit.jupiter.api.Assertions.*;

//import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
public class MyTestDemo {
	   MyTest a; //Member Variable
	   TestInfo testInfo; //Member Variable
	   TestReporter testReporter; //Member Variable
	   
	   @BeforeAll
	   static void beforAllInit() {
		   System.out.println("This method show beforeAll");
	   }
	   
	   @AfterAll
	   static void afterAllInit() {
		   System.out.println("Code Completed");
	   }
	   
	   @BeforeEach
	   @Tag("Put")
	   void init(TestInfo testInfo, TestReporter testReporter) {
		   a = new MyTest();
		   this.testInfo=testInfo;
		   this.testReporter=testReporter;
		   testReporter.publishEntry("Running "+testInfo.getDisplayName()+" with tag "+testInfo.getTags());
	   }
	   
	   @AfterEach
       public void claenup() {
    	   System.out.println("Clean Up......");
       }
	   

	   @Nested
	   @DisplayName("add method")
	   class AddTest{
		   
		   @Test
		   @DisplayName("when adding two positive nums")
		   void testAddPositive() {
			   assertEquals(2, a.add(1, 1),"should return the right sum");
		   }
		   
		   @Test
		   @DisplayName("when adding two negative nums")
		   void testAddNegative() {
			   assertEquals(-2, a.add(-1, -1),"should return the right sum");
		   }
		   
	   }
	   
       @Test
       public void method() {
    	  //MyTest a = new MyTest(); 
    	  int expected = 2;
    	  int actual = a.add(2, 0);
    	  System.out.println("Method Show");
    	  assertEquals(expected,actual,"Message Show");	  
       }
       
       @Test
       @DisplayName("Divide Methods")
       public void method1() {
    	   //MyTest a = new MyTest();
    	   System.out.println("Method1 Show");
    	   assertThrows(ArithmeticException.class, ()->a.divide(1,0),"Divide by 0 should throw");
       }
        
       @Test
       @DisplayName("Multiply Methods")
       public void method2() {
    	  // assertEquals(4, a.multiply(2, 2),"should return the right multiplication");
          assertAll(
        		  () -> assertEquals(4, a.multiply(2, 2)),
                  () -> assertEquals(0, a.multiply(2, 0)),
                  () -> assertEquals(-2, a.multiply(2, -1))
                   );
       }
       
       @Test
       public void method3() {
    	   boolean isServerUp = false;
    	   assumeTrue(isServerUp);
       }
       
}
