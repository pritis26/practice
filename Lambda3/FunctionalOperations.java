package Lambda3;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalOperations {
   
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		Predicate<Integer> predict= p-> (p>20);
		System.out.println(predict.test(num));
		
		Function<Integer,Integer> cal=f->(f+20);
		System.out.println(cal.apply(num));
		
		Consumer<Integer> consume= i -> {
			if(num>50)
			{
				System.out.println("num is greater than 50");
			}
			else
			{
				System.out.println("num is less than 50");
			}
		};
		
		consume.accept(num);
		
		Supplier<String> supplier= ()-> new String("Hello");
		System.out.println(supplier.get());
		
	}
}
