package _08_duotai;

public class Test {

	/*98-104...............................................................................................    
	 *     
	 * 多态：可以理解为事物存在的多种体现形态
	 *   
	 *   1.多态的体现
	 *      父类的引用指向自己的子类对象。
	 *      父类的引用也可以接受自己的子类对象
	 *   2.多态的前提
	 *      必须是类与类之间有关系（继承或实现）
	 *      通常还有一个前提：存在覆盖。
	 *   3.多态的好处
	 *      多态的出现大大的提高程序的扩展性。
	 *   4.多态的弊端：
	 *      提高了扩展性，但是只能使用父类的引用访问父类中的成员。   
	 *   5.多态的应用
	 *   6.多态的出现代码中的特点(多态使用的注意事项)
	 *   
	 *   第二个问题：如何使用子类特有方法。
	 *   
	 *   fu f = new zi() ;
	 *   在多态中成员函数的特点（非静态）:
	 *   在编译时期：参阅引用类型变量所属的类中是否有调用的方法，如果有，编译通过，如果没有，编译失败。
	 *   在运行期间：参阅对象所属的类中是否有调用的方法。
	 *   简单总结就是：成员函数在多态调用时，编译看左边，运行看右边。
	 *   
	 *   多态中，成员变量的特点：
	 *   无论编译和运行，都参考左边（引用型变量所属的类）
	 *   
	 *   在多态中，静态成员函数的特点：
	 *   无论编译和运行，都参考左边。
	 *   
	 *   
	 *   需求：
	 *   电脑运行实例，
	 *   电脑运行基于主板。(MainBoard类、NetCard、PCI接口)
	 *   mb.usePCI(new NetCard()); //接口型引用指向自己的子类对象
	 *   
	 *   
	 *   需求： 数据库的操作。
	 *   数据是：用户信息。
	 *   1.连接数据库。 JDBC Hibernate
	 *   2.操作数据库。
	 *      c create r read u update d delete
	 *      
	 *  
	 *  
	 *   3.关闭数据库连接。
	 */
	
	
	//一段伪代码
	/*interface UserInfoDao{
		public void add(User user) ;
		public void delete(User user) ;
	}
	 class UserInfoByJDBC implements UserInfoDao{
		 public void add(User user){
			 1.连接数据库。；
			 2.使用sql添加语句添加数据。；
			 3.关闭连接。；
		 }
		 public void delete(User user){
			 1.连接数据库。 ；
			 2.使用sql添加语句删除数据。；
			 3.关闭连接。；
		 }
	 }
	 class UserInfoByHibernate implements UserInfoDao{
		 public void add(User user){
			 1.连接数据库。；
			 2.使用sql添加语句添加数据。；
			 3.关闭连接。；
		 }
		 public void delete(User user){
			 1.连接数据库。 ；
			 2.使用sql添加语句删除数据。；
			 3.关闭连接。；
		 }
	 }
	 
	 class DBOprate
	 {
		 public static void main(String[] args) {
			//UserInfoByJDBC ui = new UserInfoByJDBC() ;
			 UserInfoDao ui = new UserInfoByHibernate() ;
			ui.add(user );
			ui.delete(user);
		}
	 }
	*/
	public static void main(String[] args) {
		
		Animal  c =new Cat() ;//类型提升。向上转型。
		c.eat();
		function(new Dog()) ;
		function(new Cat()) ;
		//如果想要调用猫的特有方法时，如何操作？
		//强制将父类的引用，转换成子类类型。
		Cat a = (Cat)c ;
		
		a.catchMouse();
		
			
		
		//千万不要将父类对象转成子类类型
		//我们能转换的是父类应用自己的子类对象时，该应用可以被提升，也可以被强制转换。
		//多态自始至终都是子类对象在做着变化
		
	}
	
	public static void function(Animal c){//多态的实现  Animal a＝ new Cat()
		c.eat();
		if (c instanceof Cat){
			Cat a = (Cat)c ;
			a.catchMouse();
		
	}else if(c instanceof Dog ){
		Dog d = (Dog) c;
		d.kanjia();
	}
	
	/*public static void function(Cat c){
		c.eat();
	}
	public static void function(Dog c){
		c.eat();
	}
	public static void function(Pig c){
		c.eat();
	}*/
	}
}
