package b1;

import java.util.Scanner;

public class chay {
    public static ClassExamplee classExamplee;

    public static void main(String[] args) {
        classExamplee = new ClassExamplee();
        System.out.println("Nhập vào 1 dãy để kiểm tra: ");
        Scanner sc = new Scanner(System.in);
        String acc = sc.nextLine();
        boolean isvalid = classExamplee.validate(acc);
        if (isvalid)
            System.out.println("Đúng định dạng");
        else
            System.out.println("Sai định dạng");
    }
}
