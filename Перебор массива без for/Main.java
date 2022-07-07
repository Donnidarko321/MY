/*
Перебираем и выводим данные без for
*/
public class Main{
	public static void main(String[] args) {
		int arr[]= {1,2,5,4,6,7};
		int i=0;
		f(i,arr);
	}
	static void f(int a,int arr[]) {
		if(a<arr.length-1) {
			System.out.println(arr[a]+",");
			a++;
			f(a,arr);
		}else if(a<arr.length) {
			System.out.println(arr[a]+".");
		}
	}
  }
