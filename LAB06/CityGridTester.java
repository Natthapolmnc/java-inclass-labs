public class CityGridTester{
    public static void main(String[] args) {
        CityGrid man=new CityGrid(100);
        int pace=0;
        int maxpace=0;
        int j=1;
        for(int i=1;i<=10000;i++){
            for(j=1;j<=1000&&man.isInCity();j++){
                man.walk();
                pace+=1;
                if (maxpace<j){
                    maxpace=j;
                }
            }
            man.reset();
        }
        System.out.println("Average number of steps that a person can take and is still in the city: "+ ((double)pace/10000));
        System.out.println("Maximum number of steps that a person can take and is still in the city: "+ maxpace);
        System.out.println(man.isInCity());
        System.out.println(pace);

    }
}