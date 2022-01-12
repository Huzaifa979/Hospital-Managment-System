import java.util.ArrayList;

class Pharmacy<T> {

	public void medicine(ArrayList<String> list,String ar) {
		if(list.contains(ar)) {
			System.out.println(ar);
		}
		else {
			System.out.println("not found");
			
		}
	}

	public void cart(String med1) {
		if(med1 == "Yes" || med1 =="yes") {
			System.out.println("Added to cart");
		}
		else {
			return;
		}
		
	}


}

