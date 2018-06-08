
public class LE_BubbleSort {
	
	public static int[] bubble(int[]sort){
		
		for(int i = 0;i<sort.length;i++){
			for(int j = 0;j<sort.length;j++){
				if(sort[i]<sort[j]){
					int help = 0;
					help = sort[i];
					sort[i] = sort[j];
					sort[j] = help;
				}
			}
		}
		return sort;
	}
	
	public static void main (String[]args){
		int[] sorted={5,7,4,6,9,1,2};
		
		sorted = bubble(sorted);
		
		for(int i=0;i<sorted.length;i++){
			
			System.out.println(sorted[i]);
			
		}
	}
}
