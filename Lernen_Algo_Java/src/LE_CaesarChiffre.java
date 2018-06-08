
public class LE_CaesarChiffre {

	public static String code(int k, String n){
		String code = "";
		char cHelp = 0;
		
		
		for(int i=0;i<n.length();i++){
			
			cHelp = (char)n.charAt(i);
			
			cHelp = (char) (cHelp+k);
			
			code += cHelp;
									
		}
		return code;
	}
	
	public static void main(String []args){
		
		System.out.println(code(1,"ABC"));

	}
	
	
}
