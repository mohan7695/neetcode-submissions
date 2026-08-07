class Solution {
    public int evalRPN(String[] tokens) {
  Stack<Integer> stack =new Stack<>();

  for(String ch : tokens){

        if(ch.equals("+")){
          
            int b=stack.pop();
              int a=stack.pop();
int d=b+a;
        stack.add(d);
            
        }
       else if(ch.equals("-")){
        
            int b=stack.pop();
                int a=stack.pop();
int d=a-b;
        stack.add(d);
            
        }else if(ch.equals("*")){
        
            int b=stack.pop();
                int a=stack.pop();
int d=b*a;
        stack.add(d);
            
        }else if(ch.equals("/")){
           
            int b=stack.pop();
             int a=stack.pop();
int d=a/b;
        stack.add(d);
            
        }
        else{
            int k=Integer.parseInt(ch);
            stack.add(k);
        }
  }
  return stack.peek();
    }
}
