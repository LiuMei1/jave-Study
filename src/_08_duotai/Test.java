package _08_duotai;

public class Test {

	/*98-104...............................................................................................    
	 *     
	 * ��̬���������Ϊ������ڵĶ���������̬
	 *   
	 *   1.��̬������
	 *      ���������ָ���Լ����������
	 *      ���������Ҳ���Խ����Լ����������
	 *   2.��̬��ǰ��
	 *      ������������֮���й�ϵ���̳л�ʵ�֣�
	 *      ͨ������һ��ǰ�᣺���ڸ��ǡ�
	 *   3.��̬�ĺô�
	 *      ��̬�ĳ��ִ�����߳������չ�ԡ�
	 *   4.��̬�ı׶ˣ�
	 *      �������չ�ԣ�����ֻ��ʹ�ø�������÷��ʸ����еĳ�Ա��   
	 *   5.��̬��Ӧ��
	 *   6.��̬�ĳ��ִ����е��ص�(��̬ʹ�õ�ע������)
	 *   
	 *   �ڶ������⣺���ʹ���������з�����
	 *   
	 *   fu f = new zi() ;
	 *   �ڶ�̬�г�Ա�������ص㣨�Ǿ�̬��:
	 *   �ڱ���ʱ�ڣ������������ͱ��������������Ƿ��е��õķ���������У�����ͨ�������û�У�����ʧ�ܡ�
	 *   �������ڼ䣺���Ķ��������������Ƿ��е��õķ�����
	 *   ���ܽ���ǣ���Ա�����ڶ�̬����ʱ�����뿴��ߣ����п��ұߡ�
	 *   
	 *   ��̬�У���Ա�������ص㣺
	 *   ���۱�������У����ο���ߣ������ͱ����������ࣩ
	 *   
	 *   �ڶ�̬�У���̬��Ա�������ص㣺
	 *   ���۱�������У����ο���ߡ�
	 *   
	 *   
	 *   ����
	 *   ��������ʵ����
	 *   �������л������塣(MainBoard�ࡢNetCard��PCI�ӿ�)
	 *   mb.usePCI(new NetCard()); //�ӿ�������ָ���Լ����������
	 *   
	 *   
	 *   ���� ���ݿ�Ĳ�����
	 *   �����ǣ��û���Ϣ��
	 *   1.�������ݿ⡣ JDBC Hibernate
	 *   2.�������ݿ⡣
	 *      c create r read u update d delete
	 *      
	 *  
	 *  
	 *   3.�ر����ݿ����ӡ�
	 */
	
	
	//һ��α����
	/*interface UserInfoDao{
		public void add(User user) ;
		public void delete(User user) ;
	}
	 class UserInfoByJDBC implements UserInfoDao{
		 public void add(User user){
			 1.�������ݿ⡣��
			 2.ʹ��sql������������ݡ���
			 3.�ر����ӡ���
		 }
		 public void delete(User user){
			 1.�������ݿ⡣ ��
			 2.ʹ��sql������ɾ�����ݡ���
			 3.�ر����ӡ���
		 }
	 }
	 class UserInfoByHibernate implements UserInfoDao{
		 public void add(User user){
			 1.�������ݿ⡣��
			 2.ʹ��sql������������ݡ���
			 3.�ر����ӡ���
		 }
		 public void delete(User user){
			 1.�������ݿ⡣ ��
			 2.ʹ��sql������ɾ�����ݡ���
			 3.�ر����ӡ���
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
		
		Animal  c =new Cat() ;//��������������ת�͡�
		c.eat();
		function(new Dog()) ;
		function(new Cat()) ;
		//�����Ҫ����è�����з���ʱ����β�����
		//ǿ�ƽ���������ã�ת�����������͡�
		Cat a = (Cat)c ;
		
		a.catchMouse();
		
			
		
		//ǧ��Ҫ���������ת����������
		//������ת�����Ǹ���Ӧ���Լ����������ʱ����Ӧ�ÿ��Ա�������Ҳ���Ա�ǿ��ת����
		//��̬��ʼ���ն���������������ű仯
		
	}
	
	public static void function(Animal c){//��̬��ʵ��  Animal a�� new Cat()
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
