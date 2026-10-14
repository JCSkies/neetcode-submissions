class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> list = new Stack<>();
        for(int i = 0; i < tokens.length; i++) {


            if (tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("/") || tokens[i].equals("*")) {
                int a = Integer.parseInt(list.pop()), b = Integer.parseInt(list.pop());
                if (tokens[i].equals("+")) {
                    a = a + b;
                }
                else if (tokens[i].equals("-")) {
                    a = b - a;
                }
                else if (tokens[i].equals("*")) {
                    a = a * b;
                }
                else {
                    a = b / a;
                }
                list.push(Integer.toString(a));
                
            }
            else {
                list.push(tokens[i]);   
            }
         
        }

        return Integer.parseInt(list.pop());
    }
}
