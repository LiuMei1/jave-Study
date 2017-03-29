package _08_object;

public class Demo {

	private int num ;
	Demo(int num){
		this.num =  num;
	}
	public boolean equals(Object obj){
		if(!(obj instanceof Demo))  //如果对象不是Demo类型。
			return false ;
		Demo d = (Demo)obj ;
		return this.num == d.num ;
	}

}
