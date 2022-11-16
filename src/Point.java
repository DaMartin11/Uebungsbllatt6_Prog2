
public class Point{
    private int x;
    private int y;
    public Point (){
        
    }
    public Point (int x, int y){
        this.x = x; 
        this.y = y;
    }

    // Aufgabe 1.a

    public int getX (){
        return x;
    }

    // Aufgabe 1.b

    public int getY (){
        return y;
    }

    // Aufgabe 1.c

    public void setX (int x){
        this.x = x;
    }
    
    // Aufgabe 1.d

    public void setY (int y){
        this.y = y;
    }

    // Aufgabe 1.e

    public double distance (){
        double distance = Math.sqrt((Math.pow(x,2)) + Math.pow(y, 2)); 
        return distance;
    }

    // Aufgabe 1.f

    public double distance (int x1,int y1){
         x1 = x1 - x;
         y1 = y1 - y;
        double distance = Math.sqrt((Math.pow(x1,2)) + Math.pow(y1, 2)); 
        return distance;
    }

    // Aufgabe 1.g

    public double distance (Point point){
        int x1 = getX();
        int y1 = getY();
        int x2 = point.getX();
        int y2 = point.getY();
        double distance = Math.sqrt((Math.pow(x2, 2) - Math.pow(x1 , 2) + Math.pow(y2, 2) - Math.pow(y1,2)));
        return distance;
    }
} 