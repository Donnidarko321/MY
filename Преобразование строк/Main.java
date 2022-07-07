/* 1. Меняем таб между цифрами на ":" и записываем в переменную "а";
   2. Преобразуем переменную "а" из String в int и записываем в переменую "b", путем разделения строки через ":" на две части
   3. Выводим результаты всех переменых word,a,b,c*/

public class Main{
	public static void main(String[] args) {
	String word="888	1234";
	String a="";
	for(int i=0;i<word.length();i++) {
  		if(word.charAt(i)==9) {
	  		a+=":";
		  }else {
			  a+=word.charAt(i);
		  }
	  }

	int b=Integer.parseInt(a.split(":")[0]);
	int c=Integer.parseInt(a.split(":")[1]);
  System.out.println(word);
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	}
}
