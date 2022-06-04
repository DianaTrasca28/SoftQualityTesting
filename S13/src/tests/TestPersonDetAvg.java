package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import classes.CategorySlowClass;
import classes.Person;

class TestPersonDetAvg {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
	}
	
	@Test
	public void testConformance() throws Exception {
		Person pers=new Person();
		double[] cost= {70.00, 90.00, 95.00, 100.00};
		pers.setCostReceipts(cost);
		double resultActual=pers.getAvgCosts();
		
		assertEquals(88.75, resultActual, 0.01);
	}
	
	//@Category(CategorySlowClass.class)
	@Test
	public void testOrdering() throws Exception {	//ca rezultatul e acelasi indiferent de ordine
		Person pers=new Person();
		double[] cost= {95.00, 70.00, 90.00, 100.00};
		pers.setCostReceipts(cost);
		double resultActual=pers.getAvgCosts();
		
		assertEquals(88.75, resultActual, 0.01);
	}

	// RangeTest: datele de intrare sa fie: costul intre 0 si 2000, iar avg intre 0 si 2000
	
	@Test (expected=Exception.class)
	public void testExistence() throws Exception {
		Person pers=new Person();
		pers.getAvgCosts();
	}
	
	@Test (expected=Exception.class)
	public void testCardinality() throws Exception {
		Person pers=new Person();
		double[] cost= {};
		pers.setCostReceipts(cost);
		double result=pers.getAvgCosts();
		assertEquals(1,  pers.getCostReceipts().length);
	}

}
