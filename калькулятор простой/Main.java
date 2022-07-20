import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
	Scanner ss=new Scanner(System.in);
	System.out.println("Это простой калькулятор, который считает только два занчения.\n"
	+ "Пример: 2+2 или 2*2 \n"
	+ "Напиши, что хочешь посчитать в строку ?");
	
	String word=ss.nextLine();
	for(int i=0;i<word.length();i++) {
		if(String.valueOf(word.charAt(i)).equals("+")) {
			word=word.replace("+", "-");
			int  a=Integer.parseInt(word.split("-")[0]);
			int  b=Integer.parseInt(word.split("-")[1]);
			int c=a+b;
			System.out.println("Результат: "+(a+b));
			
		}
		else if(String.valueOf(word.charAt(i)).equals("-")) {
			int  a=Integer.parseInt(word.split("-")[0]);
			int  b=Integer.parseInt(word.split("-")[1]);
			System.out.println("Результат: "+(a-b));
		}
		else if(String.valueOf(word.charAt(i)).equals("*")) {
			word=word.replace("*", "-");
			int  a=Integer.parseInt(word.split("-")[0]);
			int  b=Integer.parseInt(word.split("-")[1]);
			System.out.println("Результат: "+(a*b));
		}
		else if(String.valueOf(word.charAt(i)).equals("/")) {
			int  a=Integer.parseInt(word.split("/")[0]);
			int  b=Integer.parseInt(word.split("/")[1]);
			System.out.println("Результат: "+(a/b));
		}
	}
	
}
}
