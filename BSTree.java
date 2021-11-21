package Doan;

public class BSTree {
//	private int size;
	public Node root;
	
	public BSTree() {
//		this.size = 0;
		this.root = null;
	}
	
//	public int size() {
//		return this.size;
//	}
	
//	thêm
	
	public void insert(Node newNode) {
		this.root = insert(this.root, newNode);
	}
	
	public Node insert(Node node, Node newNode) {
		if (node == null) {
//			this.size++;
			return newNode;
		}
		
		if(newNode.lessThanOrEqual(node.student)) {
			node.left = insert(node.left, newNode);
		} else {
			node.right = insert(node.right, newNode);
		}
		return node;
	}
	
//	hiển thị NLR
	
	public void printPreOrder() {
		printPreOrder(this.root);
	}
	
	public void printPreOrder(Node node) {
		if (node == null) return;
		
		node.printData();
		printPreOrder(node.left);
		printPreOrder(node.right);
	}
	
//	tìm kiếm id
	
	public Node search(int studentId) {  
		return search(this.root, studentId);
	}
	
	private Node search(Node node, int studentId) { 
		if (node == null) return null;
		
		if (node.hasStudent(studentId)) {
			return node;
		}
		if (node.lessThan(studentId)) {
			return search(node.right, studentId);
		} else {
			return search(node.left, studentId);
		}
	}
	
//	chỉnh sửa id
	
	public Node edit(int studentId) {
		Node node = search(studentId);
		edit1(node);
		return node;
	}
	
	public void edit1(Node node) {
		System.out.println();
		System.out.println(node.student.getId());
		node.student.setName("diễm");
		node.student.setAge(24);
		node.student.setAddress("Hà Lội");
		node.student.setEmail("diemcute@gmail.com");
		printPreOrder();
	}
	
	
//	xóa theo id
	
	public void delete(int studentId) {  
		this.root = delete(this.root, studentId); 
	}
	
	private Node delete(Node node, int studentId) { 
		if (node == null) return null;
		
		if (node.hasStudent(studentId)) { 
//			this.size--;
			if (node.left == null) {
				return node.right;
			}
			Node maxNode = node.left;
			Node preNode = maxNode;
			while (maxNode.right != null) {
				preNode = maxNode;
				maxNode = maxNode.right;
			}
			maxNode.right = node.right;
			if (maxNode != node.left) {
				maxNode.left = node.left;
				preNode.right = null;
			}
			return maxNode; 
		}
		if (node.lessThan(studentId)) {
			node.right = delete(node.right, studentId); 
		} else {
			node.left = delete(node.left, studentId);
		}
		return node;
	}
}
