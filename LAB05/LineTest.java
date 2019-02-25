
public class LineTest{
    public static void main(String[] args){
        Line l1 = new Line(3,5);
        Line l2 = new Line(5);
        System.out.println("Are the two lines equals?:"+l1.equals(l2));
        System.out.println("Are the two lines parallel?:"+l1.isParallel(l2));
        System.out.println("Do the two lines intersect?:"+l1.isIntersect(l2));
        System.out.println("Point of intersection: "+l1.getIntersectionPoint(l2));
    } 
}