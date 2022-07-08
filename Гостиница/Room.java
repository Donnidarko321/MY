public class Room{
	int room;
	boolean status;
	boolean toilet;
	Room(int a,boolean b){
		this.room=a;
		this.toilet=b;
		this.status=false;
	}
	public int getRoom() {
		return this.room;
	}
	boolean getToilet() {
		return this.toilet;
	}
	public boolean getStatus() {
		return this.status;
	}
	void setRoom(boolean a, boolean b, int c) {
		status=a;
		if(c==1||c==2||c==4) {
		toilet=b;
		}
	}
}
