package com.ll;

import java.util.Scanner;

public class App {
    void run() {
        System.out.println("== 명언 앱 ==");

        while (true) {
            System.out.println("명령)");

            Scanner scanner = new Scanner(System.in);
            String cmd = scanner.nextLine();


            if (cmd.equals("종료")) {
                break;
            } else if (cmd.equals("등록")) {
                System.out.print("명언 : ");
                scanner.nextLine();
                System.out.print("작가 : ");
                scanner.nextLine();
            }

            System.out.printf("%s\n", cmd);


        }
    }

}