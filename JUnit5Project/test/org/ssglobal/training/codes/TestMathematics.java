package org.ssglobal.training.codes;

import java.util.stream.Stream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class TestMathematics {

	private Mathematics math;
	
	@BeforeEach
	public void setup() {
		math = new Mathematics();
	}
	
	@ParameterizedTest
	@MethodSource(value = {"mathProvider"})
	public void testDivideCorrectData(int[] testData) {
		Assertions.assertDoesNotThrow( () -> {
			int result = math.divide(testData[0], testData[1]);
			Assertions.assertEquals(testData[2], result);
		});
	}
	
	@ParameterizedTest
	@MethodSource(value = {"mathProvider2"})
	public void testDivideCorrectDataRainy(int[] testData) {
		Assertions.assertThrows(ArithmeticException.class, () -> {
			int result = math.divide(testData[0], testData[1]);
			Assertions.assertNotEquals(testData[2], result);
		});
	}
	
	@AfterEach
	public void teardown() {
		math = null;	
	}
	
	// Custom test data
	private static Stream<int[]> mathProvider() {								// always private static
		return Stream.of(new int[] {1, 2, 0}, new int[] {5, 2, 2},
				         new int[] {10, 2, 5});
	}
	
	private static Stream<int[]> mathProvider2() {								// always private static
		return Stream.of(new int[] {1, 2, 1}, new int[] {5, 0, 1},
				         new int[] {-10, -2, -5});
	}
}
