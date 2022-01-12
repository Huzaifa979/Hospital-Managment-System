public class patient {
	static Node root;
	patient(){
		root=null;
	}
	//insertion of data
	void insert(int age,int phonenumber,String name,String address,String disease,String gender) {
		root=Insert_rec(root,age,phonenumber,name,address,disease,gender);
	}
	
	Node Insert_rec(Node root,int age,int phonenumber,String name,String address,String disease,String gender) {
		if(root==null) {
			root=new Node(age,phonenumber,name,address,disease,gender);
			return root;
		}
		else if(name.compareTo(root.name)<0) {
			root.left=Insert_rec(root.left,age,phonenumber,name,address,disease,gender);
		}
		else if(name.compareTo(root.name)>0) {
			root.right=Insert_rec(root.right,age,phonenumber,name,address,disease,gender);
		}
		return root;
	}
	//to insert values in binary tree in inorder format
	void inorder() {
		inorder_rec(root);
	}
	
	void inorder_rec(Node root) {
		if(root!=null) {
			inorder_rec(root.left);
			System.out.println("Name:"+root.name+" Age:"+root.age+" Gender:"+root.gender+" Phone Number:"+root.phonenumber+" Address:"+root.address);
			inorder_rec(root.right);
		}
	}
	
	
	//deletion in binary tree
	void delete(String name) {
		root=delete_rec(root,name);
	}
	Node delete_rec(Node root,String name) {
		if(root==null) {
			return root;
		}
		else if(name.compareTo(name)<0) {
			root.left=delete_rec(root.left,name);
		}
		else if(name.compareTo(name)>0) {
			root.right=delete_rec(root.right,name);
		}
		else {
			if(root.left==null) {
				return root.right;
			}
			else if(root.right==null) {
				return root.left;
			}
			
			root.name=mnvalue(root.right);
			
			root.right=delete_rec(root.right,root.name);
		}
		
		return root;
	}
	
	String mnvalue(Node root) {
		String minval=root.name;
		while(root!=null) {
			minval=root.left.name;
			root=root.left;
		}
		return minval;
	}
	
	boolean search(String name) {
		root=search_rec(root,name);
		if(root!=null)
			return true;
		else 
			return false;
		
	}
	
	Node search_rec(Node root,String name) {
		if (root==null || root.name==name) 
			return root; 			
		else if (root.name.compareTo(name)<0) 
			return search_rec(root.left, name);

        	return search_rec(root.right,name);

	}

	
	
	
}
