package _08_object;

public class Demo {

	private int num ;
	Demo(int num){
		this.num =  num;
	}
	public boolean equals(Object obj){
		if(!(obj instanceof Demo))  //���������Demo���͡�
			return false ;
		Demo d = (Demo)obj ;
		return this.num == d.num ;
	}

}
