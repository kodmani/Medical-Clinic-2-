/* File Name: OurDateTester
* Course Name: CST8284 Object Oriented Programming
* Lab Section: 300
* Student Name: Mohamad Al Kodmani
* Date: October 8th 2018
*/

package assign1test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import assign1.OurDate;

class OurDateTester {
	
	OurDate od;
	OurDate od2;
	
	@BeforeEach
	public void testBeforeEach() {
		 od = new OurDate();
		 od2 = new OurDate(22, 11, 2020);
		 System.out.println("test starting");
	}
	
	@AfterEach
	public void testAfterEach() {
		od = null;
		od2 = null;
		System.out.println("test ending");
	}
	
	@BeforeAll	//Test before all
	public static void setUpBeforeAll() {
		System.out.println("TESTING STARTING.....");
	}
	
	@AfterAll	//Test after all
	public static void teardownAfterAll() {
		System.out.println("TESTING ENDING.....");
	}

	@Test 	//Test default constructor for year
	public void testDefaultConstructorForYear() {
		assertTrue("2018", od.getYear() == 2018);
		/*assertEquals(2018, od.getYear());*/
		System.out.println("testing year");
	}
	
	@Test	//Test default constructor for month
	public void testDefaultConstructorForMonth() {
		assertTrue("01", od.getMonth() == 01);
		/*assertEquals(01, od.getMonth());*/
		System.out.println("testing month");
	}
	
	@Test	//Test default constructor for day
	public void testDefaultConstructorForDay() {
		assertTrue("01", od.getDay() == 01);
		/*assertEquals(01, od.getDay());*/
		System.out.println("testing day");
	}
	
	@Test	//Test overloaded constructor for year
	public void testOverloadedConstructorForYear(){
		assertTrue("2020", od2.getYear() == 2020);
		/*assertEquals(2020, od2.getYear());*/
		System.out.println("testing overloaded year");
	}
	
	@Test	//Test overloaded constructor for month
	public void testOverloadedConstructorForMonth() {
		assertTrue("11", od2.getMonth() == 11);
		/*assertEquals(11, od2.getMonth());*/
		System.out.println("testing overloaded Month");
	}
	
	@Test	//Test overloaded constructor for day
	public void testOverloadedConstructorForDay() {
		assertTrue("22", od2.getDay() == 22);
		/*assertEquals(22, od2.getDay());*/
		System.out.println("testing overloaded day");
	}
	
	
	

}
