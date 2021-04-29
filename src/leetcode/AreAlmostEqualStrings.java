package leetcode;

public class AreAlmostEqualStrings {
    public static boolean areAlmostEqual(String s1, String s2) {

    	for(int i = 0; i < s1.length(); i++) {
    		if(s1.charAt(i) != s2.charAt(i)) {
    			if(i == s1.length() - 1) 
    				return false; // last element, so no swapping possible
    			
    			String remainingS1 = s1.substring(i+1);
    			String remainingS2 = s2.substring(i+1);
    			

    			
    			int offset = -1; //remainingS2.indexOf(s1.charAt(i));
    	    	for(int j = 0; j < remainingS1.length(); j++) {
    	    		if(remainingS1.charAt(j) != remainingS2.charAt(j)) {
    	    			offset = j;    	    			
    	    		}
    	    	}
                if(offset == -1) return false;
    			
    			char[] s2Arr = s2.toCharArray();
    			char temp = s2Arr[i+offset+1];
    			s2Arr[i+offset+1] = s2.charAt(i);
    			s2Arr[i] = temp;
    			
    			String newS2 = String.valueOf(s2Arr);

    			return newS2.equals(s1);    			
    		}
    	}
    	
    	return true;
    }
    
	public static void main(String[] args) {
		System.out.println();
		System.out.println("Result:" +areAlmostEqual("caa",
				"aaz"));
	}
}


