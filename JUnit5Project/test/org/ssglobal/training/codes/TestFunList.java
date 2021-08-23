package org.ssglobal.training.codes;

import java.time.Duration;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class TestFunList {

	private static FunList funList;
	private Word word;
	
	@BeforeEach																	// BeforeAll and AfterAll make static
	public void	setup() {												
		System.out.println("initialization");
		funList = new FunList("test/config/myfile.txt");						// this is where you instantiate; one setup per test case class
	}

	// Sunny Day Testing
	
	@Test
	public void testCount() {													
		long count = funList.countWords();
		System.out.println(count);
	}
	
	
	// Verification
	@Test
	public void testCountEqualsValue() {													
		long count = funList.countWords();
		Assertions.assertEquals(6, count);										// no need to System.out for function calls
	}	// there is a problem with the algorithm								// one assert for one test method
	
	@Test
	public void testCountNonNegativeFile1() {													
		long count = funList.countWords();
		Assertions.assertTrue(count > 0);
	}
	
	@Test
	public void testCountNonNegativeFile2() {													
		FunList funList = new FunList("test/config/myfile2.txt");
		long count = funList.countWords();
		Assertions.assertEquals(0, count);
		funList = null;
	}	
	
	@Test
	public void testContentListNotNull() {													
		List<String> temp = funList.getContentList();
		Assertions.assertNotNull(temp);											// no available collections; only for Arrays	
	}
	
	// Enum, constant objects, pointers pointing to one object
	
	// Exceptions Handling Test
	@Test
	public void testSameContentArrays() {													
		Assertions.assertDoesNotThrow(() -> {
			String[] content = {"The fox jumps over the window."};				// requires Exception Handling
			String[] temp = funList.getContentArray();
			Assertions.assertSame(content, temp);
		});																		// for methods who produces Exception																		// checks the memory address, not the value
	}	
	
	@Test
	public void testSameContentArraysRainy() {													
		Assertions.assertThrows(ClassCastException.class, () -> {
			String[] content = {"The fox jumps over the window."};				// requires Exception Handling
			String[] temp = funList.getContentArray();
			Assertions.assertSame(content, temp);
		});																		// for methods who produces Exception																		// checks the memory address, not the value
	}	
	
	@Test
	public void testSameContentArraysValue() {													
		String[] content = {"The fox jumps over the window."};					// requires Exception Handling
		String[] temp = funList.getContentArray();
		Assertions.assertArrayEquals(content, temp);							// checks the memory address, not the value
	}	
	
	// Rainy Day Testing
	
	@Test
	public void testCountNonNegativeFile1Rainy() {													
		long count = funList.countWords();
		Assertions.assertFalse(count <= 0);
	}
	
	@Test
	public void testCountNonNegativeFile2Rainy() {													
		FunList funList = new FunList("test/config/myfile2.txt");
		long count = funList.countWords();
		Assertions.assertNotEquals(6, count);
		funList = null;
	}	
	
	@Test
	public void testContentListNotNullRainy() {													
		List<String> temp = funList.getContentList();
		Assertions.assertNull(temp);											// no available collections; only for Arrays	
	}
	
	
	// Test Running time
	@Test
	public void testDisplayInSeconds() {													
		Assertions.assertTimeout(Duration.ofSeconds(2),  () -> {
			funList.showLines();
		});
		
	}
	
	@Test
		public void testDisplayInMillis() {													
		Assertions.assertTimeout(Duration.ofMillis(10),  () -> {
			funList.showLines();
		});
		
	}
	
	@RepeatedTest(value = 5)
	public void testSameContentArraysValueRepeat() {													
		String[] content = {"The fox jumps over the window."};						// requires Exception Handling
		String[] temp = funList.getContentArray();
		Assertions.assertArrayEquals(content, temp);
	}
	
	@AfterEach
	public void teardown() {													// garbage collect; only objects can be destroyed
		System.out.println("destroyer");
		funList = null;
	}
}
