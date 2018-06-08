
public class LE_Fibonacci {

	public static int fibo(int end){
		
		if(end ==1 || end == 2 ){
			
			end = 1;
			
			return end;
			
		}else{
			
			return fibo(end-1)+fibo(end-2);
			
		}
		
	}
	
	public static void main(String []args){
		
			System.out.println(fibo(3));
	
	}
}
