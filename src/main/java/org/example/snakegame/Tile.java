package org.example.snakegame;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString
@Setter
public class Tile {
    //보호가 아니라 convention.
    private int num;
    private String desc;
    private String type;
    private int moving;
    public Tile(int num) {
        this.num = num;
    }
}
