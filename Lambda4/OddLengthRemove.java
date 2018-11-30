package Lambda4;

import java.util.ArrayList;

public class OddLengthRemove {

	public static void main(String[] args) {
		
		ArrayList<String> arrayList=new ArrayList<String>();
		arrayList.add("bbb");
		arrayList.add("bbbb");
		arrayList.add("bbbbbb");
		
		arrayList.removeIf(s-> (s.length()%2 !=0));
		System.out.println(arrayList);
		
	}
}
