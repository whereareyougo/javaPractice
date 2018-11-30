package studyCode;

import java.lang.reflect.Field;

public class Code {

	public static void main(String[] args) {
		A a = new A();
		a.setAge(2);
		a.setName("张三");
		a.setHair(true);
		System.out.println("这是处理前的年龄："+a.getAge()+"===这是处理前的头发:"+a.isHair());
		try {
			dealObject(a);
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("这是处理后的年龄："+a.getAge()+"===这是处理后的头发:"+a.isHair());
		
		String s = "abc";
		String s1 = s.intern();
		System.out.println(s1 == s);
	}
	
	public static void dealObject(Object object) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException{
		//获取单个属性值
		Field field =  object.getClass().getDeclaredField("age");
		field.setAccessible(true);
		field.set(object,field.getInt(object)+1);
		field = object.getClass().getDeclaredField("hair");
		field.set(object, field.getBoolean(object)?false:true);
		
	}

}

class A{
	private String name ;
	private int age;
	boolean hair ;
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
	public boolean isHair() {
		return hair;
	}
	public void setHair(boolean hair) {
		this.hair = hair;
	}
	
}
