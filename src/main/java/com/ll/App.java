package com.ll;

import java.util.Scanner;

public class App {
    void run() {
        System.out.println("== 명언 앱 ==");
        System.out.print("등록)");

        Scanner scanner = new Scanner(System.in);
        String cmd = scanner.nextLine();

        System.out.printf("%s\n", cmd);
    }
}