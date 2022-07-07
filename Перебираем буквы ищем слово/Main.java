/*
1. Перебираем слово "МИР" Через циклы for;
2. Нумерум строки через переменную "n";
3. Находим слово "RIM" в комбинация "any";
4. Выводим результаты ;
*/
public class Main{
	public static void main(String[] args) {
	String word="МИР";
	String rim="РИМ";
	int n=0;
	int point=0;
		for(int i=0;i<word.length();i++) {
			for(int j=0;j<word.length();j++) {
				for(int l=0;l<word.length();l++) {
				String any=String.valueOf(word.charAt(i))+word.charAt(j)+word.charAt(l);
				n++;
				  if(any.equals(rim)) {
					  point=n;
				  }
          System.out.println(n+")"+any);
				}
			}
		}
		System.out.println("Cлово (РИМ), это строка №"+point);
	}
}
