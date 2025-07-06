// Checking balanced brackets

class Nineteen {
    public static void main(String[] args) {
        String str = "{{}[}";
        char ch = ' ';
        int count = 0;
        for(int i = 0;i<str.length();i++){
            ch = str.charAt(i);
            if(ch=='{' || ch=='[' || ch=='('){
                count++;
            }
            if(ch=='}' || ch==']' || ch==')'){
                count--;
            }
        }
        if(count == 0){
            System.out.print("Correct");
        } else {
            System.out.print("Not Correct");   
        }
    }
}
