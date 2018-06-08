
public class LE_SelectionSort {
	
	public static int [] select(int[]sort){
		
		
		for(int j =0;j<sort.length;j++){
			
			int help = 0;
			int swap = 0;
			int min = sort[j];

			for(int i =j;i<sort.length;i++){
				if(min>sort[i]){
					
					min = sort[i];
					swap = i;
									
				}
				
			}
			if(min!=sort[j]){
				help = sort[j];
				sort[j] = sort[swap];
				sort[swap] = help;
			}
		}
		return sort;
	}

	
	public static void main (String []args){
		
		int[] sort = {5,3,2,4,1};
		int[] res = new int [sort.length];
		
		
		res = select(sort);
	
		for(int i =0;i<res.length;i++){
			
			System.out.println(res[i]);
			
		}
		
	
	}
	
}
