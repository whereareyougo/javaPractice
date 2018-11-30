package studyCode;

import org.junit.Test;

public class JunitTest {
	@Test
	public void testIntern(){
		String s = "abc";
		s.intern();
		String s1 = "abc";
		System.out.println(s1 == s);
	}
	
//	@Test 
//	public void testInt(){
//		System.out.println(-Integer.MAX_VALUE);
//		System.out.println(Integer.MAX_VALUE + 1);
//		System.out.println(Integer.MAX_VALUE + 4);
//		System.out.println(Integer.MIN_VALUE);
//		System.out.println(Integer.MIN_VALUE - 20);
//	}
//	
//	@Test
//	public void TestInteger(){
//		System.out.println(Integer.parseInt("123"));
//	}
}
