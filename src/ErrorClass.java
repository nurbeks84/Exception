import java.util.Scanner;

public class ErrorClass {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int counter = 0;
        for (int j = 0; j < 100; j++) {
            if (j+j==i){
                counter++;
            }

        }
        if (counter==0){
            throw new Error();
        }else
            System.out.println("ok!!!");



    }
}

