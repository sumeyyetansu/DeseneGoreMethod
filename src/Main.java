import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("N Sayısı : ");
        int N = scanner.nextInt();
        pattern(N ,N , N);
        }
    public static int pattern (int N, int tempNumber,int temp){
        if(N > 0 ){
            System.out.print(N + " ");
            return pattern(N - 5 , tempNumber -5 ,temp);


        }
        if(tempNumber <= temp){
            System.out.print(tempNumber + " ");
            return pattern(N, tempNumber + 5, temp);
        }
        return temp;
    }
}