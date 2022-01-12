
public class Node {
	int age, phonenumber;
	String name, address, disease, gender;
	Node left, right;
	public Node(int kage,int kphonenumber,String kname,String kaddress,String kdisease,String kgender) {
		age=kage;
		phonenumber=kphonenumber;
		name=kname;
		address=kaddress;
		disease=kdisease;
		gender=kgender;
		left=right=null;
	}
}
