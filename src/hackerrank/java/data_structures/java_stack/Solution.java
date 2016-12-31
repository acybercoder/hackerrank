package hackerrank.java.data_structures.java_stack;

import java.util.*;
class Solution{
	   
   public static void main(String []argh)
   {
	   
	   Scanner sc = new Scanner(System.in);
      
     while (sc.hasNext()) {
         String input=sc.next();
            //Complete the code
     boolean valid = true;
	 Stack<Character> st = new Stack<Character>(); 
	 for(char ch: input.toCharArray() ){
	 	 if(")}]".indexOf(ch)!=-1) {
	if(!st.isEmpty()) {
		String bracket = st.peek().toString()+ ch;
		if(bracket.equals("()") 
	 || bracket.equals("{}") 
	 || bracket.equals("[]")) {
				 st.pop();
				 continue;
	         }
		}
		 valid = false;
		 break;
	 }
	 if("[{(".indexOf(ch)!=-1) {
	 if(st.isEmpty()||"[{(".indexOf(st.peek())!=-1){
	 			st.push(ch);
	 			continue;
	 		 }
			 valid = false;
			 break;
	     }    
	 }
	 if(st.size()>0) valid = false;
	 System.out.println(valid);
	      }
	      sc.close();
   }
}

