public class main2 {

	public static void main(String[] args) {
		SList<String> s = new SList<String> (); 
		s.insertFront("banana"); 
		s.insertFront("watermelon");
		s.insertAfter("lemon", s.head.getNext());
		s.insertFront("strawberry");
		
		s.print();
		System.out.println(": s�� ����=" + s.size()+ "\n");
		System.out.println(" ���Ⱑ \t" + s.search("strawberry")+ "��°�� �ִ�.");
		System.out.println("�ٳ����� \t" + s.search("banana")+ "��°�� �ִ�.\n");
		s.deleteAfter(s.head);
		s.print();
		System.out.println(": s�� ����=" + s.size());
		System.out.println();
		s.deleteFront();
		s.print();
		System.out.println(": s�� ����=" + s.size());
		System.out.println();
		
		SList<Integer> t= new SList<Integer>(); 
		t.insertFront(500); t.insertFront(200);
		t.insertAfter(400, t.head);
		t.insertFront(100);
		t.insertAfter(300, t.head.getNext());
		t.print();
		System.out.println(": t�� ����=" + t.size());
		

	}

}
