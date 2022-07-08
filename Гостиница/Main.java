import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
	Scanner ss=new Scanner(System.in);
	Scanner si=new Scanner(System.in);
	Hotel Preston=new Hotel(new Room[] {
			new Room(1),
			new Room(2),
			new Room(3),
			new Room(4),
			new Room(5)
	});
	String command="";
	String info="Инстукция:\n"
			+ "стоп- остановить программу \n"
			+ "получить - получить информацию о свободных комнатах \n"
			+ "бронь - бронировать комнату\n"
			+ "отмена - отменить бронь\n";

	System.out.println(info);
	while(!command.equals("стоп")) {
		if(command.equals("получить")) {
			Preston.get();
		}
		else if(command.equals("бронь")) {
			System.out.println("Укажите комнату?" );
			int room=si.nextInt();
			Preston.set(room);
		}else if(command.equals("Отменить")) {
			System.out.println("Укажите комнату?" );
			int room=si.nextInt();
			Preston.set(room);
		}
		System.out.println("Введите команду?" );
		command=ss.nextLine();
	}

	
}
}
