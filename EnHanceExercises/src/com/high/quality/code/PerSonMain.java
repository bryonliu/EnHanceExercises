package com.high.quality.code;

import java.lang.reflect.Field;

public class PerSonMain {

	/**
	 * @param args
	 * @throws SecurityException 
	 * @throws NoSuchFieldException 
	 * @throws IllegalAccessException 
	 * @throws IllegalArgumentException 
	 */
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		// TODO Auto-generated method stub

		Person  p = new Person("张三",11);
		p.setHome(new Person.Home("武汉","123"));
		
		Field fage = p.getClass().getDeclaredField("age");
		Field fname = p.getClass().getDeclaredField("name");
		fname.setAccessible(true);
		fage.setAccessible(true);

		fage.setInt(p, 10000);
		System.out.println(fage.getInt(p));
	}

}
