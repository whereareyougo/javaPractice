package Code;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.nullValue;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import com.sun.org.apache.xalan.internal.utils.XMLSecurityManager.NameMap;

public class Test {
	
	private static class Person{
		String name;
		int age;
		public Person() {
			// TODO Auto-generated constructor stub
		}
		public Person(String name,int age){
			this.age = age;
			this.name = name;
		}
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
		@Override
		public int hashCode() {
			// TODO Auto-generated method stub
			return this.age;
		}
		@Override
		public boolean equals(Object obj) {
			if (obj == this) {
				return true;
			}
			if (obj == null) {
				return false;
			}
			if (obj.getClass() != this.getClass()) {
				return false;
			}
			Person person = (Person) obj;
			return person.age == this.age;
		}
		
	}

	public static void main(String[] args) {
		Map map1= new HashMap<>();
		Map map2 = new TreeMap<>();
		Map map3 = new Hashtable<>();
		Map map4 = new LinkedHashMap<>();
		Person person1 = new Person("李四", 123);
		map1.put(person1, "32131");
		System.out.println("结果:"+map1.get(new Person("123",123)));
//		int h = 15;
//		  h = h^(h >>> 20) ^ (h >>> 12);
//		  System.out.println(h);
//	      h = h ^ (h >>> 7) ^ (h >>> 4);System.out.println(h);
	}

}
