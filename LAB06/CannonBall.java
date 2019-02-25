public class CannonBall{
    private double initV;
    private double simS;
    private double simT;
    private int i;
    public static final double g=9.81;

    public CannonBall(double initV){
        this.initV=initV;
    }
    public void simulatedFlight(){
    i =0;
    double temp=initV;
    while (initV>0){
    i++;
    double deltaS=initV*0.01;
    simS+=deltaS;
    initV-=g*0.01;
    simT=(double) i/100;
    if (i%100==0){
        System.out.println("Distance on "+(int) (i/100)+"sec :"  +String.format("%.3f",simS));
    }
    if (initV<=0){
        System.out.println("finale distance:"+String.format("%.3f",simS)+"Total time: "+String.format("%.2f", simT));
    }}
    initV=temp;
}


    public String calculusFlight(double t) {
        return "Distance from calculus equation :"+ String.format("%.3f", ((-0.5*g*t*t)+(initV*t)));
        
    }
    public double getSimulatedTime(){
        return simT;
    }
    public double getSimulatedDistance(){
        return simS;
    }

}