package Class16;

public class Task7 {
    int sumArr(int[] arr){
        int sum=0;
        for (int num:arr){
            sum+=num;
        }
        return sum;

    }

    public static void main(String[] args) {

        int [] arr={10,20,30,40,50,};
        Task7 task7=new Task7();
        System.out.println(task7.sumArr(arr));

    }




}
