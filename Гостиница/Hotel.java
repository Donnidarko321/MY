public class Hotel{
	Room room[];
	Hotel(Room a[]){
		this.room=a;
	}
	void get() {
		String word="Данные комнаты свободны "+"\n";
		String point="";
		for(int i=0;i<room.length;i++) {
			if(!room[i].getStatus()) {
				word+=room[i].getRoom()+".";
			}
		}
		for(int i=0;i<word.length()-1;i++) {
			if(String.valueOf(word.charAt(i)).equals(".")){
				point+=",";
			}else {
				point+=word.charAt(i);
			}
		}
		System.out.println(point);
	}
	void set(int a) {
		String word="Комната забронирована "+"\n";
		if(a>room.length||a<0) {
			word=("Ошибка: данной комнаты не существует!");
		}
		for(int i=0;i<room.length;i++) {
			 if(!room[i].getStatus()&&room[i].getRoom()==a) {
				room[i].setRoom(true);
				word+=room[i].getRoom();
				}else if(room[i].getStatus()&&room[i].getRoom()==a) {
					System.out.println("Ошибка:");
					word="Невозможно забронировать, данная комната уже зарезервирована!";
				}
			}
		System.out.println(word);
	}
	void free(int a) {
		String word="Комната свободна "+"\n";
		if(a>room.length||a<0) {
			word=("Ошибка: данной комнаты не существует!");
		}
		for(int i=0;i<room.length;i++) {
			 if(room[i].getStatus()&&room[i].getRoom()==a) {
				room[i].setRoom(false);
				word+=room[i].getRoom();
				}
			}
		System.out.println(word);
	}
}
