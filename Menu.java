
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		patient pt = new patient();
		Pharmacy ph=new Pharmacy();
		
		System.out.println("Welcome to ABC Hospital");
		
		int menu;
		do {
			
			int op;
			System.out.println("Enter 1 to get tips of the day and \t2 take appoitment \t 3 to buy medicine");
			menu=sc.nextInt();
			
		switch(menu){
			case 1:
				@SuppressWarnings("unused")
				health_tips ht = new health_tips();
				break;
			
			case 2:
				do {
					
					System.out.println(
							" 5 to exit \n 1 Add Patient" + "\n 2 del patient \n 3 search by Name" + "\n 4 to print list");
					op = sc.nextInt();
					switch (op) {
						case 1:
							System.out.println("Enter Patient details here");
							System.out.println("Enter Name");
							String name = sc.next();
							System.out.println("Enter age");
							int age = sc.nextInt();
							System.out.println("Enter Gender");
							String gender = sc.next();
							System.out.println("Enter Phone Number");
							int number = sc.nextInt();
							System.out.println("Enter disease");
							String disease = sc.next();

							System.out.println("Enter Address");
							String address = sc.next();
							pt.insert(age, number, name, address, disease, gender);
							break;

						case 2:
							System.out.println("Enter name of patient you want to delete");
							String name1 = sc.next();
							pt.delete(name1);
							break;

						case 3:
							System.out.println("Enter Name of Patient whose detail you want");
							String name3 = sc.next();
							System.out.print(pt.search(name3));
							break;

						case 4:
							System.out.println("List of Patients");
							pt.inorder();
							break;

						case 5:
							System.out.println("Program has been terminated");
							break;

						}
					} while (op < 6 && op > 0);
					break;
					
			case 3:
				
				ArrayList<String> ar=new ArrayList<String>();
				ar.add("Panadol");
				ar.add("bruffin");
				ar.add("Paracetamol");
				ar.add("Cannabis");
				ar.add("Vicodin");
				ar.add("Lipitor");
				System.out.println("Enter Name od drug you want to buy");
				String med=sc.next();
				ph.medicine(ar, med);
			
				System.out.println("Do you want to buy");
				String med1=sc.next();
				ph.cart(med1);
				break;
			}
		}while(menu>0 && menu<4);

		}
}
