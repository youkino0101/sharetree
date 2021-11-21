package Doan;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		BSTree tree = new BSTree();
		
		tree.insert(new Node(new Student(12,"Quan", 20, "Quảng Nam", "quan@gmail.com")));
		tree.insert(new Node(new Student(20,"Quan", 21, "Quảng Ngãi", "quan1@gmail.com")));
		tree.insert(new Node(new Student(7,"Quan", 21, "Quảng Ngãi", "quan1@gmail.com")));
		tree.insert(new Node(new Student(30,"Quan", 20, "Quảng Nam", "quan@gmail.com")));
		tree.insert(new Node(new Student(21,"Quan", 21, "Quảng Ngãi", "quan1@gmail.com")));
		tree.insert(new Node(new Student(42,"Quan", 21, "Quảng Ngãi", "quan1@gmail.com")));
		tree.insert(new Node(new Student(17,"Quan", 20, "Quảng Nam", "quan@gmail.com")));
		tree.insert(new Node(new Student(29,"Quan", 21, "Quảng Ngãi", "quan1@gmail.com")));
		tree.insert(new Node(new Student(2,"Quan", 21, "Quảng Ngãi", "quan1@gmail.com")));
		System.out.println("-------------DANH SÁCH SINH VIÊN---------------");
//		System.out.printf("\n|%5d|%20s|%5d|%25s|%20s|", id, name, age, address, email);
		System.out.printf("|%5s|%10s|%10s|%10s|%15s|", "Mã SV", "Tên SV", "Năm Sinh", "Nơi Sinh", "Email");
		tree.printPreOrder();
		tree.delete(12);
		System.out.println("\n\nDanh sách sau khi xóa");
		System.out.printf("|%5s|%10s|%10s|%10s|%15s|", "Mã SV", "Tên SV", "Năm Sinh", "Nơi Sinh", "Email");
		tree.printPreOrder();
		int studentId = 17;
		Node node = tree.search(studentId);
		if (node == null) {
			System.out.print("\nTìm không ra"); 
		} else {
			System.out.println("\nTìm ra rồi"); 
			node.printData();
		}
		
		tree.edit(17);
		
//		tái sử dụng code 
		Scanner sc = new Scanner(System.in);
		String string = "|%1$-10s|%2$-10s|%3$-20s|%4$-20s|%5$-20s|\n";
		System.out.printf(string, "Mã SV", "Tên SV", "Năm Sinh", "Nơi Sinh", "Email");
		System.out.format(string, "Mã SV", "Tên SV", "Năm Sinh", "Nơi Sinh", "Email");

		
	}

}
