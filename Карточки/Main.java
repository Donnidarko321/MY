import java.util.Scanner;
public class Main{
	public static void main(String [] args) {
		Tov tovari = new Tov();
		Scanner ss=new Scanner(System.in);
		Scanner si=new Scanner(System.in);
		System.out.println("Найти товар или завести?");
		String event=ss.nextLine();
		while(!event.equals("стоп")) {
			if(event.equals("завести")) {
				System.out.println("id ?");
				int id=si.nextInt();
				System.out.println("price ?");
				int price=si.nextInt();
				tovari.push(id, price);
			}else if(event.equals("найти")) {
				System.out.println("id ?");
				int id=si.nextInt();
				Cart kartochka = tovari.get(id);
				System.out.println(kartochka.getPrice());
				tovari = null;
			}
			System.out.println("Найти товар или завести?");
			event=ss.nextLine();
		}
}
}
interface A{
	void show();
}
class B implements A{
	public void show() {
		
	}
}
