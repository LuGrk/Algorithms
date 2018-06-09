
public class LE_Lauflaengenkompression {
	
	public static String RLE (String raw){
		
		int times =0;
		String result = "";
		char comp = (char) raw.charAt(1);

		for(int i = 0;i<raw.length();i++){
			
			if(comp==raw.charAt(i)){
				times++;
			}else{
				result += times;
				times = 1;
				comp = raw.charAt(i);
			}
		}
		result += times;
		
		return result;
	}

	public static void main (String[]args){
		
		String raw = "...cc...";
		
		System.out.println(RLE(raw));
	}
	
}
