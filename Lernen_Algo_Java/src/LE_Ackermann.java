
public class LE_Ackermann {
	
	public static long ackermann(long x, long y){
		
		if(x==0){
			
			return y + 1;
		}else if(y==0){
			
			return ackermann(x-1,1);
			
		}else{
			
			return ackermann(x-1, ackermann(x,y-1));
			
		}
	}
	
	public static void main(String []args){
		
		int x=3,y=4;
		
		System.out.println("ackermann(" + x + "," + y + ")=" + ackermann(x,y));
		
	}

}
