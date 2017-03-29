package _08_object;

public class Test // extend object
    {

	/*
	 * object:是所有对象的直接或者间接父类，根类。
	 * 该类中定义的肯定是所有对象都具备的功能。
	 * 
	 * object 类中已经提供了对对象是否相同的比较方法。
	 * 如果自定义类中也有比较相同的功能，没有必要重新定义。
	 * 只要沿袭父类中的功能，建立自己特有比较雷让内容即可，这就是覆盖。
	 */
	
public static void main(String[] args) {

	Demo d1 = new Demo(4) ;
	Demo d2 = new Demo(4) ;
	Demo d3 = d1 ;
	System.out.println(d1.equals(d3));
	System.out.println(d1.equals(d2));
	System.out.println(d1 == d2);
	System.out.println(d1 == d3);
		
	}
}
