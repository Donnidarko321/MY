import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Button tv=new Button(new press());
		Door doorhandle=new Door(new press());
		tv.click();
		tv.click();
		tv.click();
		doorhandle.open();
		doorhandle.open();
		doorhandle.open();
	}
}
interface action{
	void event();
	boolean getOn();
}

class Door{
	action a;
	Door(action b){
		this.a=b;
	}
	void open() {
		if(a.getOn()) {
			System.out.println("Дверь закрыта");
			}else System.out.println("Дверь открыта");		
		a.event();
	}
}
class Button{
	action a;
	Button(action b){
		this.a=b;
	}
	void click() {
		if(a.getOn()) {
			System.out.println("Телек выкл");
			}else System.out.println("Телек вкл");
		a.event();
	}
}
class press implements action{
	boolean on=false;
	public boolean getOn() {
		return this.on;
	}
	public void event() {
		if(!on) {
			on=true;
			//System.out.println("ON");
		}else {
			on=false;
			//System.out.println("OFF");
		}
	}
}
