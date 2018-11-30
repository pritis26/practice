package Streams1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class TestFruit {

	public static void main(String[] args) {
		
		Fruit fruit1=new Fruit("Banana", 5, 40, "Yellow");
		Fruit fruit2=new Fruit("Orange", 109, 50, "Orange");
		Fruit fruit3=new Fruit("Mango", 20, 70, "Yellow");
		Fruit fruit4=new Fruit("Watermelon", 25, 30, "Green");
		Fruit fruit5=new Fruit("Apple", 111, 80, "Red");
		Fruit fruit6=new Fruit("Cherry", 88, 100, "Red");
		Fruit fruit7=new Fruit("Strawberry", 99 , 120, "Red");
		
		ArrayList<Fruit> arrayList=new ArrayList<Fruit>();
		arrayList.add(fruit1);
		arrayList.add(fruit2);
		arrayList.add(fruit3);
		arrayList.add(fruit4);
		arrayList.add(fruit5);
		arrayList.add(fruit6);
		arrayList.add(fruit7);
		
	    Comparator<? super Fruit> c= (i1,i2)-> {
	    	if(i1.getCalories()>i2.getCalories())
	    	{
	    		return -1;
	    	}
	    	else if(i1.getCalories()<i2.getCalories())
	    	{
	    		return 1;
	    	}
	    	else
	    		return 0;
	    };
		
		ArrayList<Fruit> arrayList2= (ArrayList<Fruit>) arrayList.stream().filter(s->s.getCalories()<100).sorted(c).collect(Collectors.toList());
		 System.out.println("--------According to descending order of colories-------");
		for(Fruit f : arrayList2)
		{
			System.out.println(f);
		}
		
		Comparator< Fruit> color= (c1,c2)-> c1.getColor().compareTo(c2.getColor());
			
		
		ArrayList<Fruit> arrayList3= (ArrayList<Fruit>) arrayList.stream().sorted(color).collect(Collectors.toList());
		
		System.out.println("--------According to Color names-------");
		
		for(Fruit f1 : arrayList3)
		{
		System.out.println(f1);
		}
		
		Comparator<Fruit> p= (p1,p2) -> {
			if(p1.getPrice()>p2.getPrice())
			{
				return 1;
			}
			else if(p1.getPrice()<p2.getPrice())
			{
				return -1;
			}
			else
				return 0;
			
		};
		
		ArrayList<Fruit> arrayList4= (ArrayList<Fruit>) arrayList.stream().filter(r->r.getColor()=="Red").sorted(p).collect(Collectors.toList());
		
		System.out.println("------------According to red color and price in ascending order------------");
		for(Fruit f2 : arrayList4)
		{
		System.out.println(f2);
		}
	}
}
