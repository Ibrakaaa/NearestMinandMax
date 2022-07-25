package Main;
import java.util.Scanner;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        int [] list = {4,5,8,9,-85,-96,-4,-63,-4,150,1};
        int min = list[0];
        int max = list[0];

        Scanner input = new Scanner(System.in);
        System.out.println(Arrays.toString(list));
        System.out.println("Lutfen Bir Sayi Giriniz: ");
        int number = input.nextInt();


        Arrays.sort(list);
        for (int i : list){
            if(i<number){
                min = i;

            }
            if (i>number){
                max = i;
                break;
            }

        }   System.out.println("Girilen Sayidan Kucukk En Yakin Sayi: "+ min);
            System.out.println("Girilen Sayidan Buyuk En Yakin Sayi: "+ max);








    }
}















