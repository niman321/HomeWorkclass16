package Class16;

public class Palindrome1 {

    void isPalindrome(String str){
        StringBuilder st=new StringBuilder(str);
        st.reverse();
        String reversedStr=st.toString();
        if (str.equals(reversedStr)){
            System.out.println(str+" is palindrome");
        }else {
            System.out.println(str+" not is palindrome");
        }
    }
}
