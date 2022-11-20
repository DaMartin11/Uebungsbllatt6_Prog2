
public class Calculator {
private Floor floor;
private Carpet carpet;

public Calculator (Floor floor, Carpet carpet){
    this.floor = floor;
    this.carpet = carpet;
}
public double getTotalCost(){
    double totalCost = floor.getArea(getTotalCost(), getTotalCost())* carpet.getCost();
    return totalCost;

}


    /*Carpet carpet =  new Carpet(3.5);
    Floor floor = new Floor(2.75,4.0);
public Calculator(floor,carpet){
    this.carpet = carpet;
    this.floor = floor;
   }
   public  {
    
   }*/


}
