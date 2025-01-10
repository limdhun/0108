package org.example.homework;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Question {
    private int num;
    private String text;
    private int yesIndex;
    private int noIndex;

    public Question(int num){
        this.num = num;
    }

}
