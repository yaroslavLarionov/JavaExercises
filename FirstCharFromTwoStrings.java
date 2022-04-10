
public class FirstCharFromTwoStrings {
	public static void main(String[] args) {
	       String res = mixString("abc", "xyzzzzz");
	        System.out.println(res);
	    }

	    public static String mixString(String a, String b) {
	       String newStr = "";
	      if (a.length() < b.length()) {
	         for (int i = 0; i < a.length(); i++) {
	           newStr = newStr + a.charAt(i) + b.charAt(i);
	         }
	         
	         return newStr + b.substring(a.length());
	      } else {
	    	  for (int i = 0; i < b.length(); i++) {
	    		  newStr = newStr + a.charAt(i) + b.charAt(i);
	    	  }
	    	  return newStr + a.substring(b.length());
	      }
	    }
	}