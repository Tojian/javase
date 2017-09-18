package offer;

public class ReplaceBlank {

	public static void main(String[] args) {
		String s="We are happy."; 
		System.out.println(replaceBlank(s)); 
	}
	
	
	public static String replaceBlank(String input){
		if(input==null){
			return null;
		}
		
		StringBuffer output=new StringBuffer();
		
		for(int i=0;i<input.length();i++){
			if(input.charAt(i)==' '){
				output.append("%");
				output.append("2");
				output.append("0");
			}
			else{
				output.append(String.valueOf(input.charAt(i)));
			}
		}
		return new String(output);
	}
}
