package recursion;
public class reverseString{
	public static String revString(String input){
		if(input.equals("")) {
			return "";
		}
		
		return revString (input.substring(1))+input.charAt(0);
	}
	
	public static String cleanSpace(String input) {
		return input.trim().replaceAll("\\s+"," ");
	}
public static void main (String [] args) {
	String input = "   hello    world   ";
	System.out.println("Given String input : "+input);
	input = cleanSpace(input);
	System.out.println("Revese String :"+revString(input));
	}
}