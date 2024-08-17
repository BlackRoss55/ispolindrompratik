import java.util.Scanner;

public class Main {

    static boolean isPolindrom(int number){
        int temp=number, lastnumber=1,reversednumber=0;
        while(lastnumber!=0){
            lastnumber = temp % 10;
            temp = temp /10;
            reversednumber = (reversednumber * 10) + lastnumber;
        }
        reversednumber=reversednumber/10;
        return number == reversednumber;
    }
    public static void main(String[] args){

        int sayi=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        sayi = sc.nextInt();
        boolean a = isPolindrom(sayi);
        if(a){
            System.out.print("Girilen sayı polindromdur");
        }
        else{
            System.out.print("Girilen sayı polindrom sayı değildir");
        }

    }
}