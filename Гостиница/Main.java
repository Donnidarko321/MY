import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
	Scanner ss=new Scanner(System.in);
	Scanner si=new Scanner(System.in);
	Hotel Preston=new Hotel(new Room[] {
			new Room(1,true),
			new Room(2,true),
			new Room(3,false),
			new Room(4,true),
			new Room(5,false)
	});
	String command="";
	String info="Инстукция:\n"
			+ "стоп- остановить программу \n"
			+ "получить - получить информацию о свободных комнатах \n"
			+ "бронь - бронировать комнату\n"
			+ "отмена - отменить бронь\n"
			+ "туалет - посмотреть в каких комнатах есть туалет\n";

	System.out.println(info);
	while(!command.equals("стоп")) {
		if(command.equals("получить")) {
			Preston.get();
		}
		else if(command.equals("бронь")) {
			System.out.println("Укажите комнату?" );
			int room=si.nextInt();
			Preston.set(room);
		}else if(command.equals("отмена")) {
			System.out.println("Укажите комнату?" );
			int room=si.nextInt();
			Preston.free(room);
		}else if(command.equals("туалет")) {
			Preston.getT();
		}
		System.out.println("Введите команду?" );
		command=ss.nextLine();
	}
}
}
