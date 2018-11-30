package Lambda5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class NewString {

	public static void main(String[] args) {
		
		ArrayList<String> arrayList=new ArrayList<String>();
		arrayList.add("Simer");
		arrayList.add("Imran");
		arrayList.add("Manish");
		
		List<Character> list2= (List) arrayList.stream().map(s->s.charAt(0)).collect(Collectors.toList());
		
		System.out.println(list2);
		
		
		
	}
}
