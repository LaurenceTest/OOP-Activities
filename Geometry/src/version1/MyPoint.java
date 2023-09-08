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
        if(x == 0 && y == 0) return 0;
        if(y == 0) return 5;
        if(x == 0) return 6;
        if(x <= 0 && y >= 0) return 2;
        if(x <= 0 && y <= 0) return 3;
        if(x >= 0 && y <= 0) return 4;
        return 1;
    }

    public double getAngle(){
        double angle = Math.toDegrees(Math.atan(Math.abs(y)/Math.abs(x)));
        switch(getQuadrant()){
            case 0 :
                angle = 0;
                break;
            case 2 :
                angle = 90 + angle;
                break;
            case 3:
                angle = 180 + angle;
                break;
            case 4:
                angle = 360 - angle;
                break;
            case 5:
                angle = x > 0 ? 0 : 180;
                break;
            case 6:
                angle = y > 0 ? 90 : 270;
                break;
        }
        return angle;
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
