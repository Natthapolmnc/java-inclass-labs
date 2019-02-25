import java.awt.geom.Point2D;
import java.awt.geom.Point2D.Double;


public class Line {
    private double m;
    private double b;
    private double x;
    
    public Line(double x, double y, double m){
        this.m=m;
        b=y-x*m;
        this.x=0;
    }
    public Line(double x1, double y1, double x2, double y2){
        this.m=(y2-y1)/(x2-x1);
        b=y1-x1*this.m;
        this.x=0;
    }
    public Line(double m, double b){
        this.m=m;
        this.b=b;
        this.x=0;
    }
    public Line(double a){
        m= 1.;
        b = 0.;
        x= a;
    }
    public boolean isParallel(Line a){
    return a.m-this.m<=Math.pow(10, -14);
}
    public boolean equals(Line a){
        return ((a.m-this.m<=Math.pow(10, -14))&&(a.b-this.b<=Math.pow(10, -14)));}
    public boolean isIntersect(Line a){
        return a.m!=this.m;
    }
    public Point2D.Double getIntersectionPoint(Line a){
        if (this.x != 0){
            double interX =this.x;
            double interY =this.x*a.m+a.b;
            Double newObj= new Double(interX, interY);
            return newObj;

        }else if ( a.x!=0){
            double interX =a.x;
            double interY =a.x*this.m+this.b;
            Double newObj= new Double(interX, interY);
            return newObj;
        }else{
            double x2=(this.b-a.b)/(a.m-this.m);
            double y2=(x2*a.m)+a.b;
            Double newObj= new Double(x2, y2);
            return newObj;
        }
    }
}
