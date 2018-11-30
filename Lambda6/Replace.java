package Lambda6;

import java.util.ArrayList;

public class Replace {
public static void main(String[] args) {
	
	ArrayList<String> arrayList=new ArrayList<String>();
	arrayList.add("simer");
	arrayList.add("manish");
	arrayList.add("suraj");
	
	arrayList.replaceAll(s->s.replaceAll(s, s.toUpperCase()));
	
	System.out.println(arrayList);
}
	
}
