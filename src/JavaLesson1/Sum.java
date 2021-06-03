package JavaLesson1;

import java.util.Scanner;

//bài 1: Tính tổng các chữ số của số n (n nhập từ bàn phím)
//VD: n=12345 => tong=15
public class Sum {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        int m=n;
        int sum = 0;
        System.out.print("sum= ");
        while (n > 0) {
            System.out.print(n%10+" + ");
            sum += n % 10;
            n /= 10;
        }
        System.out.println("\b\b");
        System.out.println("\nTổng số nguyên " + m + " là: " + sum);


    }
}
