/*
Проверяем логин и пароль с использованием Массивов.
В массив "arry" заранее заданы значения, второй массив "arr" используется для ввода логина и пароля.
Затем череч цикл for и if проверяем совпадение данных в каждой итерации.
*/
import java.util.Scanner;
import java.util.Arrays;
public class Main{
	public static void main(String[] args) {
	Scanner ss=new Scanner(System.in);
	String a,b;
	String arry[][]= {{"dog","123"},{"cat","321"},{"bird","123"}};
	String arr[][]=new String[1][2];
	boolean circle=false;
	while(!circle) {
		System.out.println("Login ?");
		a=ss.nextLine();
		arr[0][0]=a;
		System.out.println("Password ?");
		b=ss.nextLine();
		arr[0][1]=b;
		for(int i=0;i<arry.length;i++) {
			if(Arrays.toString(arr[0]).equals(Arrays.toString(arry[i]))) {
				System.out.println("Вход разрешен");
			circle=true;
			}
		}
		if(!circle)
			System.out.println("Ошибка");
	}
  }
}
