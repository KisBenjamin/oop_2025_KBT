package oop.labor05.point;

public class Point {
    private int x;
    private int y;
    private static final Point ORIGIN = new Point(0,0);

    public Point (int x,int y){
        this.x=x;
        this.y=y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public static double Distance(Point a, Point b){
        return Math.sqrt(Math.pow(a.x-b.x,2) + Math.pow(a.y-b.y,2));
    }

    public double distanceFromOrigin(){
        return Distance(this,ORIGIN);
    }


    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
