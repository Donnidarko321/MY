import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner cc=new Scanner(System.in);
		System.out.println("?");
		String word=cc.nextLine();
		Winter[] a=Winter.values();
		Autumn[] b=Autumn.values();
		Spring[] c=Spring.values();
		Summer[] d=Summer.values();
		boolean on=false;
		for(Winter i:a) {
			for(Autumn j:b) {
				for(Spring l:c) {
					for(Summer t:d) {
				
			if(word.equals(i.toString())||word.equals(j.toString())||word.equals(l.toString())||word.equals(t.toString())) {
				on=true;
					}
				}
			}
		}
		}
		if(on) {
			System.out.println(on);
		}else{
			Calendar month=Calendar.valueOf(word);
			switch(month) {
			case Зима:
				Winter[] f=Winter.values();
				for(Winter s:f) {
					System.out.println(s);
				}
				break;
			case Лето:
				Autumn[] g=Autumn.values();
				for(Autumn s:g) {
					System.out.println(s);
				}
				break;
			case Весна:
				Spring[] h=Spring.values();
				for(Spring s:h) {
					System.out.println(s);
				}
				break;
			case Осень:
				Spring[] k=Spring.values();
				for(Spring s:k) {
					System.out.println(s);
				}
				break;
			}
		}
	}
}
enum Calendar{
	Зима,
	Осень,
	Лето,
	Весна
}

enum Winter{
	Декабрь,
	Январь,
	Февраль
}
enum Autumn{
	Сентябрь,
	Октябрь,
	Ноябрь
}
enum Spring{
	Март,
	Апрель,
	Май
}
enum Summer{
	Авгус,
	Июнь,
	Июль
}
