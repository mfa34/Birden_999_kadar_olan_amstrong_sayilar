import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for (int j=1 ; j <=999 ; j ++){

            int basNumber = 0;
            int tempNumber = j;
            int basValue;
            int result = 0;
            int basPow;

            while (tempNumber != 0) {
                tempNumber /= 10;
                basNumber++;
            }

            tempNumber = j;
            while (tempNumber != 0) {
                basValue = tempNumber % 10;
                // 1*1*1*1 = 1^4
                basPow = 1;
                for (int i = 1; i <= basNumber; i++) {
                    basPow *= basValue;
                }
                result += basPow;
                tempNumber /= 10;
            }

            if (result == j) {
                System.out.print(j+" , " );
            }
        }
    }
}



