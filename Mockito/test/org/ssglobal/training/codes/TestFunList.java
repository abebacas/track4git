package org.ssglobal.training.codes;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class TestFunList {

	@Mock
	private FunList mockedFunList;
	
	@Mock
	private List<String> arrayList;

	
	@Test
	public void testProcessStr() {
		when(mockedFunList.processStr("str1", "str2")).thenReturn("str1 str2");
		
		String result1 = mockedFunList.processStr("str1", "str2");
		Assertions.assertEquals("str1 str2", result1);
		
	}
	
	@Test
	public void testRetrieveDataList() {
		when(arrayList.get(anyInt())).thenReturn("Anna", "Lorna", "Fe");
		
		String result1 = arrayList.get(1);
		Assertions.assertEquals("Anna", result1);
		String result2 = arrayList.get(1);
		Assertions.assertEquals("Lorna", result2);
		String result3 = arrayList.get(10);
		Assertions.assertEquals("Fe", result3);
	}
	
	@Test
	public void testGetEmpty() {
		when(arrayList.get(anyInt())).thenReturn("Anna");
		when(arrayList.isEmpty()).thenReturn(false);
		
		Assertions.assertEquals(false, arrayList.isEmpty());
		Assertions.assertEquals("Anna", arrayList.get(20));
		
	}
	
	@Test
	public void testAddAnywhere() {
		doNothing().when(arrayList).add(anyInt(), isA(String.class));
		
		arrayList.add(10, "Anna");
		verify(arrayList, times(1)).add(10, "Anna");
	}
	

}
