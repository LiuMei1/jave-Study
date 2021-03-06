package _07_Template;

public class Test2 {
	
	/*93
	 * 需求：获取一段程序运行的时间。
	 * 原理：获取程序开始和结束的时间并相减即可。
	 * 
	 * 获取时间：System.curentTimeMillis();
	 * 
	 * 当代码完成优化后，就可以解决这类问题。
	 * 
	 * 这种方法，模式方法设计模式。
	 * 什么是模板方法呢？
	 * 在定义功能时，功能的一部分是确定的，但是有一部分是不确定，而确定的部分在使用不确定的部分，
	 * 那么这时就将不确定的部分暴露出去。由该类的子类去完成
	 */

	public static void main(String[] args) {
		
		SubTime sb = new SubTime() ;
		sb.getTime();
	}
}
