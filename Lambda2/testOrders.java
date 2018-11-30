package Lambda2;

import java.util.ArrayList;
import java.util.stream.Collectors;


	public class testOrders {
		   
		public static void main(String[] args) {
			
		Orders orders1=new Orders(9000, "ACCEPTED");
		Orders orders2=new Orders(10000,"COMPLETED");
		Orders orders3=new Orders(11000, "ACCEPTED");
		Orders orders4=new Orders(13000, "REJECTED");
	   
		ArrayList<Orders> arrayList=new ArrayList<Orders>();
		arrayList.add(orders1);
		arrayList.add(orders2);
		arrayList.add(orders3);
		arrayList.add(orders4);
		
		ArrayList<Orders> list= (ArrayList<Orders>) arrayList.stream().filter(i-> (i.getOrderBill()>=10000&&i.getOrderStatus()=="ACCEPTED")||i.getOrderBill()>=10000&&i.getOrderStatus()=="COMPLETED").collect(Collectors.toList());
		System.out.println(list);
		}
}
