package _08_object;

public class Test // extend object
    {

	/*
	 * object:�����ж����ֱ�ӻ��߼�Ӹ��࣬���ࡣ
	 * �����ж���Ŀ϶������ж��󶼾߱��Ĺ��ܡ�
	 * 
	 * object �����Ѿ��ṩ�˶Զ����Ƿ���ͬ�ıȽϷ�����
	 * ����Զ�������Ҳ�бȽ���ͬ�Ĺ��ܣ�û�б�Ҫ���¶��塣
	 * ֻҪ��Ϯ�����еĹ��ܣ������Լ����бȽ��������ݼ��ɣ�����Ǹ��ǡ�
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
