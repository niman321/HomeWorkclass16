package Class16;

import Class15.Homework;

public class HomeWork1 {
   int nima(int [] array){
       int sum=0;
       for (int i = 0; i < array.length; i++) {
           sum+=array[i];

       }
       return sum;
   }

    public static void main(String[] args) {
        HomeWork1 home=new HomeWork1();
        int [] array={10,20,30};
        System.out.println(home.nima(array));
    }








}
