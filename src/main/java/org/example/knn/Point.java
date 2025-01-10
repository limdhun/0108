package org.example.knn;

import lombok.ToString;

@ToString
public class Point {

    public String type; //J/Z
    public int xpos;
    public int ypos;

    public Point(String type, int xpos, int ypos) {
        this.type = type;
        this.xpos = xpos;
        this.ypos = ypos;
    }

    public Point(int xpos, int ypos) {
        this.xpos = xpos;
        this.ypos = ypos;
    }


}
