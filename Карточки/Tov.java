import java.util.ArrayList;
public class Tov{
 private ArrayList<Cart>arr=new ArrayList<Cart>();
	public void push(int id, int price) {
		Cart tov=new Cart(id,price);
		arr.add(tov);
	}
	public Cart get(int id) {
		for(Cart c : arr) {
			if(c.getId() == id) {
				return c;
			}
		}
		 return null;
	 }
}
