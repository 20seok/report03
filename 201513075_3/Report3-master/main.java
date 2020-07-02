public class main {

	public static void main(String[] args) {
		ArrList<String> s = new ArrList<String>();
		s.insertLast("watermelon"); s.print();
		s.insertLast("orange"); s.print();
		s.insertLast("strawberry"); s.print();
		s.insertLast("blueberry"); s.print();
		s.insert("lemon", 1); s.print();
		s.insert("kiwi", 4); s.print();
		s.insertLast("banana"); s.print();
		
		s.delete(4); s.print();
		s.delete(0); s.print();
		s.delete(0); s.print();
		s.delete(3); s.print();
		s.delete(0); s.print();
		
		System.out.println("1번째 항목은 " + s.peek(1) + " 이다.");
		System.out.println();
		
		ArrList<Integer> t = new ArrList<Integer>();
		t.insertLast(100);
		t.insertLast(200);
		t.insertLast(300);
		t.insertLast(400);
		t.print();
		
		t.insert(350, 3); t.print();
		t.insert(250, 2); t.print();
		t.insertLast(500); t.print();


	
		

	}

}
