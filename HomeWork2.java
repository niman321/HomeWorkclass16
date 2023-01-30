package Class16;

public class HomeWork2 {

  public   String reverseStr(String num){
        String re="";
        for (int i = num.length()-1; i >=0; i--) {
            re+=num.charAt(i);

        }
        return re;
    }

    public static void main(String[] args) {
        HomeWork2 task2=new HomeWork2();
        System.out.println(task2.reverseStr("nima"));
    }
}
