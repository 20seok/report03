public class main4 {

	public static void main(String[] args) {
		CList<String> s = new CList<String>();
		
		s.insert("watermelon");
		s.insert("kiwi");
		s.insert("orange");
		s.insert("blueberry");
		s.print();
		System.out.print(":s의 길이 = "+ s.size() + "\n");
		
		s.delete();
		s.print();
		System.out.print(":s의 길이 = "+ s.size() + "\n");
		System.out.println();

	}

}
