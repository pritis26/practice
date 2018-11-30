package Streams3;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestTraderTransaction {
public static void main(String[] args) {
	
	Trader trader1=new  Trader("Priti", "Delhi");
	Trader trader2=new Trader("Chaitali","Bangalore");
	Trader trader3=new Trader("Simer","Raipur");
	Trader trader4=new Trader("zahul","Pune");
	Trader trader5=new Trader("Alex","Pune");
	Trader trader6=new Trader("Raju","Pune");
	
	Transaction transaction=new Transaction(trader1, 2011, 10000);
	Transaction transaction2=new Transaction(trader2,2012,12000);
	Transaction transaction3=new Transaction(trader3, 2011, 15000);
	Transaction transaction4=new Transaction(trader4, 2011, 16000);
	Transaction transaction5=new Transaction(trader5, 2016, 12000);
	Transaction transaction6=new Transaction(trader6, 2017, 15000);
	
	List<Transaction> arrayList=new ArrayList<Transaction>();
	arrayList.add(transaction);
	arrayList.add(transaction2);
	arrayList.add(transaction3);
	arrayList.add(transaction4);
	arrayList.add(transaction5);
	arrayList.add(transaction6);
	
	ArrayList<Transaction> arrayList2= (ArrayList<Transaction>) arrayList.stream().filter(i -> i.getYear()==2011).sorted((i1,i2)->(i1.getValue()>i2.getValue())?1 : (i1.getValue()<i2.getValue()) ? -1 : 0).collect(Collectors.toList());
	
	for(Transaction t : arrayList2)
	{
		System.out.println(t);
	}
	
	System.out.println("================All distinct cities=============");
	
	System.out.println(arrayList.stream().map(i->i.trader.getCity()).distinct().collect(Collectors.toList()));
	
	ArrayList<Transaction> arrayList3= (ArrayList<Transaction>) arrayList.stream().filter(i-> i.trader.getCity()=="Pune").sorted((i1,i2)->i1.trader.getName().compareTo(i2.trader.getName())).collect(Collectors.toList());
	//arrayList3.forEach(System.out :: println);
	
	arrayList3.forEach(System.out :: println);
	
/*	List<Transaction> arrayList8=(List<Transaction>) arrayList.stream().map(i->i.trader.getName()).sorted().forEach(System.out::println);
	 System.out.println(arrayList8);
//System.out.println(arrayList.stream().map(i->i.trader.getCity()).sorted((c1,c2)->c1.trader.getName().compareTo(c2.trader.getName())).collect(Collectors.toList()));
	System.out.println("====================Sorted names alphabetically=======================");*/
	
	ArrayList<String> arrayList8= (ArrayList<String>) arrayList.stream().map(i->i.trader.getName()).sorted().collect(Collectors.toList());
	System.out.println(arrayList8);
}

	
}
