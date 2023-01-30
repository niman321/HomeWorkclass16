package Class16;

public class Task5 {

    boolean isPrime(int number) {

        if (number < 1) {
            return false;
        }

        for (int i = 2; i < number; i++) {

            if (number % 2 == 0) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        Task5 task5=new Task5();
        task5.isPrime(13);
        System.out.println(task5.isPrime(13));
    }
}
