
public class LE_ggT {
	
	public static int ggt(int w1, int w2){
		int result = 0;
		
		do{
		
		if(w1 < w2){

			w2 = w2-w1;

		}else if(w2<w1){

			w1= w1- w2;
			
		}

		}while(w1!=w2);
		
		result = w1;
		return result;
		
	}
	
	
	public static void main(String[]args){
		
		System.out.println(ggt(12,90));
		
	}

}
