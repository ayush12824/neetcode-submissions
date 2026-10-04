class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s=new Stack<>();
        int ans=0;
        for(int i=0;i<tokens.length;i++){
            String curr=tokens[i];
            if(curr.equals("+") || curr.equals("-") || curr.equals("*") || curr.equals("/")){
                int num1=s.pop();
                int num2=s.pop();
                if(curr.equals("+")){
                    ans=num1+num2;
                }else if(curr.equals("-")){
                    ans=num2-num1;
                }else if(curr.equals("*")){
                    ans=num1*num2;
                }else{
                    ans=(num2/num1);
                }
                s.push(ans);
            }else{
                s.push(Integer.parseInt(curr));
            }
        }

        return s.pop();
    }
}
