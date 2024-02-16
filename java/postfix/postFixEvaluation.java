package postfix;

import java.util.Stack;

public class postFixEvaluation {
    public static int evaluatePostFix(String exp){
        Stack<Integer> st = new Stack();
        for(int i = 0; i < exp.length(); ++i){
            char c = exp.charAt(i);
            if(Character.isDigit(c))
                st.push(c - '0');
            else {
                int v1 = st.pop();
                int v2 = st.pop();
                switch(c){
                    case '+' :
                        st.push(v2+v1);
                        break;
                    case '-' :
                        st.push(v2-v1);
                        break;
                    case '*' :
                        st.push(v2*v1);
                        break;
                    case '/' :
                        st.push(v2/v1);
                        break;            
                }
            }    
        }return st.pop();
    }
    public static void main(String args[]){
        String exp = "124*3-";
       
        // Function call
        System.out.println("postfix evaluation: "+ evaluatePostFix(exp));
    }
}
