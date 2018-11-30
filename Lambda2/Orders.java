package Lambda2;

public class Orders {
	private int orderBill;
	private String orderStatus;
	
	
	public Orders(int orderBill,String orderStatus)
	{
		this.orderBill=orderBill;
		this.orderStatus=orderStatus;
	}

	public int getOrderBill() {
		return orderBill;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	@Override
	public String toString() {
		return "Orders [orderBill=" + orderBill + ", orderStatus="
				+ orderStatus + "]";
}
}