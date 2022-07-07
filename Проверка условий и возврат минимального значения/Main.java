/*
Есть несколько условий, надо найти минимальное значение.
*/

public class Main{
	public static void main(String[] args) {
		if(f(8,4)<f(6,2)) {
			System.out.println(f(8,4));
		}else {
			System.out.println(f(6,2));
		}
	}
  	static int f(int a,int b) {
	  	if(a<b) {
		  	return a;
		  }else {
			  return b;
	    }
	}
}
