public class Main{
	public static void main(String[] args) {
		Button tv=new Button(new Press());
		tv.click();
		tv.click();
		tv.click();
	}
}
interface Event{
	default void Put() {
		System.out.println("err");
	}
}
class Button{
	Event a;
	Button(Event b){
		this.a=b;
	}
	void click() {
		a.Put();
	}
}
class Press implements Event{
	boolean on=false;
	public void Put() {
		if(!on) {
			on=true;
		System.out.println("ON");
		}else {
			on=false;
			System.out.println("OFF");
		}
	}
}
