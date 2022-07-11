public class Main{
	public static void main(String[] args) {
	Button tv=new Button(new event() {
		boolean on=false;
		public void put() {
			if(!on) {
				on=true;
				System.out.println("ON");
			}else {
				on=false;
				System.out.println("OFF");
			}
		}
	});
	tv.click();
	tv.click();
	tv.click();
	}
}
interface event{
	void put();
}
class Button{
	event a;
	Button(event b){
		this.a=b;
	}
	void click() {
		a.put();
	}
}
