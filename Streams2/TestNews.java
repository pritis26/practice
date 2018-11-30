package Streams2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class TestNews {

	public static void main(String[] args) {
		
		News news1=new News(11, "Rahul", "Abhinav", "Excellent budgeted news");
		News news2=new News(11 ,"Adarsh","Abhinav","Very good");
		News news3=new News(13, "Aditya", "Rahul", "Excellent");
		News news4=new News(14 ,"Aditya","Abhinav","Bad budgeted");
		
		ArrayList<News> arrayList=new ArrayList<News>();
		arrayList.add(news1);
		arrayList.add(news2);
		arrayList.add(news3);
		arrayList.add(news4);
		
		/*ArrayList<Integer> arrayList2=new ArrayList<Integer>();
		
		int count=0;
		for(News n: arrayList)
		{
			
			if(news1.getNewsId()==news2.getNewsId())
			{
				count++;
			}
		//arrayList2.add((int) arrayList.stream().count());
		}
		System.out.println(count);
		*/
		
		Comparator<News> c=(i1,i2)->i1.getCommentByUser().compareTo(i2.getCommentByUser());
		
		
		ArrayList<News> arrayList2= (ArrayList<News>) arrayList.stream().sorted(c).collect(Collectors.toList());
		
		for(News n: arrayList2)
		{
			System.out.println(n.getCommentByUser()+"   "+n.getComment());
		}
		
		
		
	}
}
