package JavaLesson1;

import java.util.Scanner;
//Bài 2: Tìm min, max của 3 số a,b,c (a,b,c nhập từ bàn phím)
//VD: a=3,b=6,c=1
//=> max = 6 và min=1
public class Max_min {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("Nhập a: ");
        int a= scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhập b: ");
        int b=scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhập c: ");
        int c=scanner.nextInt();
        scanner.nextLine();
            int maxNumber,minNumber;
            maxNumber=minNumber=a;
            if (b>maxNumber){

                maxNumber=b;
            }
            if (c>maxNumber){
                maxNumber=c;
            }
        System.out.println("maxNumber: "+maxNumber);

            if (b<minNumber){
                minNumber=b;
            }
            if (c<minNumber){
                minNumber=c;
            }
        System.out.println("minNumber: "+minNumber);
    }
}
