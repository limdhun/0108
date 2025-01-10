package org.example.homework;

import org.example.snakegame.Tile;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_Homework {
    public static void main(String[] args) {

        ArrayList<Question> questions = new ArrayList<>();
        for (int i = 0; i <= 15; i++){
            Question question = new Question(i);
            questions.add(question);
            //questions.add(new Question("~~~~")); 이렇게 해도 됨..
        }

        questions.get(0).setText("일을 하기는 하는데 뭘 하고 있는지 잘 모르겠다");
        questions.get(0).setYesIndex(1);
        questions.get(0).setNoIndex(3);

        questions.get(1).setText("일과 관련한 기록을 어떤 방식으로든 하고 있다");
        questions.get(1).setYesIndex(2);
        questions.get(1).setNoIndex(5);

        questions.get(2).setText("주변에 일 고민을 나눌 수 있는 사수나 동료가 없다");
        questions.get(2).setYesIndex(4);
        questions.get(2).setNoIndex(8);
        
        questions.get(3).setText("지나온 커리어가 나에게 어떤 의미인지 잘 알고 있다");
        questions.get(3).setYesIndex(6);
        questions.get(3).setNoIndex(4);

        questions.get(4).setText("지금 나에게 가장 필요한 건 일에 대한 피드백이다");
        questions.get(4).setYesIndex(8);
        questions.get(4).setNoIndex(7);

        questions.get(5).setText("일에서 실수가 잦은 게 고민이다");
        questions.get(5).setYesIndex(8);
        questions.get(5).setNoIndex(7);

        questions.get(6).setText("나의 커리어패스나 경험을 눈에 보이는 방식으로 한번 정리하고 싶다");
        questions.get(6).setYesIndex(9);
        questions.get(6).setNoIndex(7);

        questions.get(7).setText("사이드프로젝트에 대한 생각이 있다");
        questions.get(7).setYesIndex(15);
        questions.get(7).setNoIndex(10);

        questions.get(8).setText("분명히 했던 일인데 또 하려면 어떻게 했는지 기억이 잘 나지 않는다");
        questions.get(8).setYesIndex(11);
        questions.get(8).setNoIndex(9);

        questions.get(9).setText("내 강점을 잘 설명하고 싶다");
        questions.get(9).setYesIndex(12);
        questions.get(9).setNoIndex(10);

        questions.get(10).setText("긴 글을 쓰고 싶다는 마음이 늘 있다");
        questions.get(10).setYesIndex(13);
        questions.get(10).setNoIndex(11);

        questions.get(11).setText("내가 일에서 뭘 원하는지, 뭘 하고 싶지 않은지 알고 싶다");
        questions.get(11).setYesIndex(14);
        questions.get(11).setNoIndex(15);

        questions.get(12).setText("A 타입. 내가 일에서 뭘 원하는지, 내 강점은 무엇인지 스스로 이미 너무 잘 알고 있어요");
        questions.get(12).setYesIndex(-1);
        questions.get(12).setNoIndex(-1);

        questions.get(13).setText("B 타입. 일에 대해 뭔가 하고 싶은 이야기는 있는데, 그게 어떤 방식으로 쓰일 수 있을지 감이 잡히지 않죠");
        questions.get(13).setYesIndex(-1);
        questions.get(13).setNoIndex(-1);

        questions.get(14).setText("C 타입. 일을 하고 있지만 내가 뭘 배우고 있는지, 내가 어떻게 '일하는 나'를 만들어가고 있는지 아직은 의문인 당신");
        questions.get(14).setYesIndex(-1);
        questions.get(14).setNoIndex(-1);

        questions.get(15).setText("D 타입. 지금 하고 있는 일에서 크게 고민되는 게 없거나, 지금 하는 일에 지루함을 느끼는 상황인가요?");
        questions.get(15).setYesIndex(-1);
        questions.get(15).setNoIndex(-1);

        Scanner scanner = new Scanner(System.in);


        int current = 0;

        Question q = questions.get(current);
        while (true) {
            System.out.println(q.getText());
            System.out.println("YES 혹은 NO를 입력하세요");
            String str = scanner.nextLine();

            if (str.equals("YES")) {
                current = q.getYesIndex();
            } else if (str.equals("NO")) {
                current = q.getNoIndex();
            }
            q = questions.get(current);
            System.out.println("current = " + current + "\n");

            if (q.getYesIndex()==-1){
                System.out.println(q.getText());
                break;}
        }
        System.out.println("수고하셨습니다");
    }
}
