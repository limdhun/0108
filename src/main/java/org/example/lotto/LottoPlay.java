package org.example.lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LottoPlay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<LottoBall> balls = new ArrayList<>();
        String str;
        int money;
        for (int i = 1; i <= 45; i++){
            balls.add(new LottoBall(i));
        }//이라고 한 후 shuffle

        System.out.println("금액을 입력하세요 (로또 : 1000원)");
        str = scanner.nextLine();
        money = Integer.parseInt(str);
        int count = money / 1000;
        //System.out.println(count);

        for(int i = 0; i < count; i++){
            System.out.println(i + 1 + " 번째 로또 번호");
            Collections.shuffle(balls);
            System.out.println(balls.subList(0,6));
        }




    }
}
