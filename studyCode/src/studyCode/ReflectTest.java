package studyCode;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class ReflectTest {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {
		// TODO Auto-generated method stub
		Person c = Person.class.newInstance();
		
		c.setAge(10);
		System.out.println(Person.class.getMethod("getAge", null).invoke(c, null));
		
	}

}

class Person {
	private String name;
	private int age;
	public Person(){}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
