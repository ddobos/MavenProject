package curs16;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestExample {
	
	@Test(invocationCount = 4)
	public void TestCeva() {
		System.out.println("Print Test ceva");
	}
	
	@RunMultipleTimes(times = 4)
	public void testAltceva() {
		System.out.println("Print test altceva");
	}

	@BeforeClass
	public void setup() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		TestExample testExample = new TestExample();
		
		for(Method method : testExample.getClass().getDeclaredMethods()) {
			if (method.isAnnotationPresent(RunMultipleTimes.class)) {
				RunMultipleTimes annotation = method.getAnnotation(RunMultipleTimes.class);
				for (int i = 0; i< annotation.times(); i++) {
					method.invoke(testExample);
				}
			}
		}
	}
}
