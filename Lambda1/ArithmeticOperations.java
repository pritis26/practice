package Lambda1;



public class ArithmeticOperations {
	public static void main(String[] args) {
		
		
		Calculate add= (a,b) -> a+b;
		System.out.println(add.calculate(2, 4));
		
		Calculate sub= (a,b) -> a-b;
		System.out.println(sub.calculate(6, 2));
		
		Calculate mul= (a,b) -> a*b;
		System.out.println(mul.calculate(6, 2));
			
	    Calculate div= (a,b) -> a/b;
	    System.out.println(div.calculate(8, 2));
}
}