
public class LE_Soundex {
	
	
	public static int [] table = new int[]{0,1,2,3,0,1,2,0,0,2,2,4,5,5,0,1,2,6,2,3,0,1,0,2,0,2};
	
	public static void main(String[] args) {
		
		System.out.println(soundex("Paul"));
			
	}
	
	
	public static String soundex(String word){
		
		String sndx ="";	
		
		word = word.toUpperCase();
		
		sndx += word.substring(0,1).toUpperCase();
		
		for (int i=1;i<word.length();i++){
						
			int value = (int) word.charAt(i)-65; 
			
			for(int j = 0;j<table.length;j++){
				
				if(table[value]!= 0){
					
					sndx+=table[value];
					break;
					
				}
			}
		}
		
		while(sndx.length()<4){
			sndx+=0;
		}
						
		return sndx;
	}


}
