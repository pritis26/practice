package Lambda7;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ConvertKeyValue {

	public static void main(String[] args) {
		
	ArrayList<String> list=new ArrayList<>();
		
    Map<Integer, String> map=new HashMap<Integer, String>();
    map.put(1,"Simer");
    map.put(2, "Manish");
    map.put(3, "Ghanshyam");
    

    for(Map.Entry<Integer, String> m : map.entrySet())
    {
    	list.add(m.getKey()+m.getValue());
    }
    System.out.println(list);
	}

}
