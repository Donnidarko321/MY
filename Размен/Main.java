import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
	Scanner si=new Scanner(System.in);
		System.out.println("?");
		int mony=si.nextInt();
		f(mony);
	
	}
	static void f(int a) {
		if(a>10) {
			a-=10;
			System.out.println(10);
			f(a);
		}
		else if(a>=5){
			a-=5;
			System.out.println(5);
			f(a);
		}
		else if(a>=2){
			a-=2;
			System.out.println(2);
			f(a);
		}
		else if(a>=1){
			a-=1;
			System.out.println(1);
			f(a);
		}
	}
}
