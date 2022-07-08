public class Animal{
	String name;
	String voic;
	Animal(String a,String b){
		this.name=a;
		this.voic=b;
	}
	void say() {
		System.out.println(this.name+" say:"+this.voic);
	}
}
