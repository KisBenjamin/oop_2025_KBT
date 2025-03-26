package oop.labor05.rectangle;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Rectangle> rectangles = new ArrayList<>();
        for(int i=0;i<10;i++){
            rectangles.add(new Rectangle(i,i+1));
        }

        for(Rectangle r: rectangles){
            System.out.println(r);
        }

        Rectangle big = new Rectangle(0 ,0);
        for(Rectangle r:rectangles){
            if(r.getArea() > big.getArea()){
                big =r;
            }
        }
        System.out.println(big);
    }


}
