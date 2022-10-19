package b2;

import java.util.Scanner;

public class chay {

    public static Phonenber phoneNber;

    public static void main(String[] args) {
        phoneNber = new Phonenber();
        System.out.println("Nhập vào dãy số kiểm tra: ");
        Scanner sc = new Scanner(System.in);
        String pnb = sc.nextLine();
        boolean isvalid = phoneNber.validate(pnb);
        if (isvalid)
            System.out.println("Số điện thoại hợp lệ!");
        else
            System.out.println("Số điện thoại không hợp lệ!");

    }
}
