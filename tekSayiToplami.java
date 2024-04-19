import java.util.*;
public class tekSayiToplami {
    public static void main(String[] args) {
        int number, total = 0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Sayı giriniz: ");
            number = input.nextInt();
            if (number % 2 == 1) {
                total += number;
            }
        }while ( number > 0);

        System.out.println("Toplam : " + total);

    }
    }

