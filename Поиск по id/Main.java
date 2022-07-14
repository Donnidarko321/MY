import java.util.Scanner;
public class Main{
	public static void main(String [] args) {
		Scanner si=new Scanner(System.in);
		User us=new User(new Cart());
		System.out.println("?");
		int a=si.nextInt();
		us.count(a);
		
	}
}
interface A{
	void show(int c);
	
}


class Cart implements A{
	int a[][]= {{1010,4000},{1011,5000},{1012,7000},{1013,2000}};
	public void show(int c) {
		for(int[] s:a) {
			if(s[0]==c) {
				System.out.print(s[1]);
			}
		}
	}
}
class User{
	A a;
	User(A b){
		this.a=b;
	}
	void count(int c) {
		a.show(c);
	}
	
}

