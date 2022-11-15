
public class Point{
    private int x;
    private int y;
    public static void point(){
        System.out.println("F");
    }
    public Point(int x, int y){
        this.x = x; 
        this.y = y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public double distance(){
        double distance = Math.sqrt((Math.pow(x,2)) + Math.pow(y, 2)); 
        return distance;

    }
    public double distance (int x1,int y1){
         x1 = x1 - x;
         y1 = y1 - y;
        double distance = Math.sqrt((Math.pow(x1,2)) + Math.pow(y1, 2)); 
        return distance;
    }
} 