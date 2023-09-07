package version1;
public class MyPoint {
    private int x;
    private int y;

    
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public MyPoint(MyPoint coords) {
        this.x = coords.getX();
        this.y = coords.getY();
    }

    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getDistance(int x, int y){
        return Math.hypot(x - this.x, y - this.y);
    }

    public double getDistance(MyPoint coords){
        return Math.hypot(coords.getX() - this.x, coords.getY() - this.y);
    }

    public double getDistance(){
        return Math.hypot(x, y);
    }

    public void displayPoint(){
        System.out.printf("(%d,%d)\n",this.x,this.y);
    }

    public int getQuadrant(){
        return 0;
    }

    public double getAngle(){
        return Math.atan(y/x);
    }
    
    @Override
    public String toString() {
        return "("+x+","+y+")";
    }

    public static void main(String[] args) throws Exception {
        MyPoint coords1 = new MyPoint(10, 20);
        System.out.println(coords1.toString());
        coords1.displayPoint();
        System.out.println(Math.toDegrees(coords1.getAngle()));
        coords1.getQuadrant();
    }
}
