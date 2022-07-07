/*
Проверка доступа через логин и пароль, с использованием цикла "while"
*/
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
	Scanner ss=new Scanner(System.in);
	Scanner si=new Scanner(System.in);
	boolean circle=false;
	while(!circle) {
		System.out.println("Login ?");
		String log=ss.nextLine();
		System.out.println("Password ?");
		int pass=si.nextInt();
		if(circle=f(log,pass))
			System.out.println("Вход разрешен");
		else
			System.out.println("Ошибка: Неверный логи или пароль");
		}
	}
	static boolean f(String a,int b){
	if(a.equals("admin")&&b==123) return true;	
	else return false;
	}
}
