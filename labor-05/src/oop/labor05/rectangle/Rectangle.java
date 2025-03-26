package oop.labor05.rectangle;

public class Rectangle {
    private int width,height;

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getArea(){
        return width*height;
    }

    public static int rectangeDiff(Rectangle r1,Rectangle r2){
        return Math.abs(r1.getArea()-r2.getArea());
    }
    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
