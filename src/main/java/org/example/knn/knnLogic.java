package org.example.knn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class knnLogic {

    public static double calcDistance(Point p1, Point p2){
        double result;
        result = Math.sqrt(Math.pow(p1.xpos - p2.xpos, 2)+Math.pow(p1.ypos - p2.ypos, 2));
        return result;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Point> points = new ArrayList<>();
        for (int i = 1; i <= 6; i++){
            points.add(new Point("Z",(int)(Math.random()*10),(int)(Math.random()*10)));
        }
        for (int i = 1; i <= 6; i++){
            points.add(new Point("J",(int)(Math.random()*10),(int)(Math.random()*10)));
        }

        System.out.println(points.size());
        System.out.println("x, y 좌표를 한 번씩 입력하세요");
        Point pn = new Point("", Integer.parseInt(scanner.nextLine()),Integer.parseInt(scanner.nextLine()));
        /// ////////////////////////////////////////////////

        double[] distances = new double[points.size()];
        for (int i = 0 ; i < points.size(); i++){
            distances[i]=calcDistance( points.get(i), pn );
        }

        for(int i=0; i<points.size(); i++) {
            System.out.println(points.get(i));
            System.out.println(distances[i]);
        }

        Arrays.sort(distances);
        int countJ = 0;
        int countZ = 0;
        for (int i = 0; i < 3; i++) {
            Point near = points.get(i); // Access original points
            if (near.type.equals("J")) {
                countJ++;
            } else if (near.type.equals("Z")) {
                countZ++;
            }
        }

        // Assign type to pn based on majority
        if (countJ > countZ) {
            pn.type = "J";
        } else {
            pn.type = "Z";
        }


        System.out.println("내가 입력한 점은\n"+pn);//@ToString을 Point에 추가했음




    }
}
