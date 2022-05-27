package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Comparator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import classes.ETypeMarket;
import classes.Market;
import classes.Supermarket;
import exception.ExceptionMarket;

public class TestCaseSupermarketGetBiggestMarket {

	static Market m1;
	static Market m2;
	static Market m3;
	static Market m4;
	static Market m5;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("setUpBeforeClass");
		m1=new Market("Sephora", 20, ETypeMarket.BEAUTY);
		m1=new Market("Douglas", 29, ETypeMarket.BEAUTY);
		m1=new Market("H&M", 40, ETypeMarket.CLOTHES);
		m1=new Market("Mobexpert", 100, ETypeMarket.DECORATIONS);
		m1=new Market("Zara", 20, ETypeMarket.CLOTHES);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("SetUp");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Tear down");
	}

	//@Test
//public void test() {
	//	fail("Not yet implemented");
	//}
	
	@Test
	public void TestRight() {
		System.out.println("Test Right");
		
		ArrayList<Market> markets=new ArrayList<>();
		markets.add(m1);
		markets.add(m2);
		markets.add(m3);
		markets.add(m4);
		markets.add(m5);
		Supermarket sm=new Supermarket("Electroputere", markets);
		try {
			String result=sm.getBiggestMarketByArea(ETypeMarket.BEAUTY);
//			if(result.equals("Douglas"))
//				assertTrue(true);
//			else assertTrue(false);
			assertEquals("H&M",result);
			
		} catch (ExceptionMarket e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("Nu trebuia sa se arunce o exceptie");
		}
	}
	
	
	@Test
	public void TestBoundary() {
		
		System.out.println("Test Boundary");
		
		ArrayList<Market>listMarkets = new ArrayList<Market>();
		listMarkets.add(m1);
		Supermarket sm = new Supermarket("Electroputere", listMarkets);
		
		try {
			String result = sm.getBiggestMarketByArea(ETypeMarket.BEAUTY);
			
			assertEquals("Sephora", result);
			
		} catch (ExceptionMarket e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("Not supposed to throw exception - la limitele intervalului");
		}
		
	}
	
	@Test(expected = ExceptionMarket.class)
	public void TestException() throws ExceptionMarket {
		
		Supermarket sm=new Supermarket("Electroputere", null);
		String result=sm.getBiggestMarketByArea(ETypeMarket.BEAUTY);
	}
	
	@Test 
	public void TestPerformance() {
		
		//NOT NOW Start Time!!
		
		ArrayList<Market>listMarkets = new ArrayList<Market>();
		listMarkets.add(m1);
		listMarkets.add(m2);
		listMarkets.add(m3);
		listMarkets.add(m4);
		listMarkets.add(m5);
		
		Supermarket sm = new Supermarket("Electroputere", listMarkets);
		
		double startTime = System.currentTimeMillis();
		
//		String result = sm.getBiggestMartkeByArea(ETypeMarket.BEAUTY);
		
		double stopTime = System.currentTimeMillis();
//		assertEquals("The test runs < 0.5 ms", 0.5, stopTime-startTime);
		assertTrue("The test runs < 10 ms", stopTime-startTime <= 10);
	}
	
	public Market getLargestMarket(ETypeMarket type, ArrayList<Market>markets)
	{
		markets.sort(new Comparator<Market>() {

			@Override
			public int compare(Market o1, Market o2) {
				// TODO Auto-generated method stub
				if(o1.getArea()>o2.getArea())
					return 1;
				else return 0;
			}
			
		});
		for(int i=0; i<markets.size(); i++)
			if(type==markets.get(i).getTypeMarket())
				return markets.get(i);
		return null;
	}
	@Test
	public void testCrossCheck() throws ExceptionMarket {
		ArrayList<Market> markets=new ArrayList<>();
		markets.add(m1);
		markets.add(m2);
		markets.add(m3);
		markets.add(m4);
		markets.add(m5); 
		Supermarket sm=new Supermarket("Electroputere", markets);
		String actual=sm.getBiggestMarketByArea(ETypeMarket.BEAUTY);
		Market expectedM=getLargestMarket(ETypeMarket.BEAUTY, markets);
		String expected =expectedM.getName();
		assertEquals("comp Crossckeck", expected, actual);
	}

}
