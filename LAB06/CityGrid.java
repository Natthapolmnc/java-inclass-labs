import java.util.Random;
public class CityGrid{
    private int xCoor;
    private int yCoor;
    private int gridSize;

    public CityGrid(int gS){
        gridSize=gS;
        xCoor=(int) Math.sqrt(gridSize)/2;
        yCoor=xCoor;
    }
    public void walk(){
        Random rand =new Random();
        int randint=rand.nextInt(4);
        if (randint==0){
            xCoor++;
        }else if(randint==1){
            yCoor++;
        }else if(randint==2){
            xCoor--;
        }else if(randint==3){
            yCoor--;
        }
    }
    public boolean isInCity(){
        return ((((xCoor*yCoor)<gridSize)&&((xCoor*yCoor)>=0)) &&xCoor>0&&yCoor>0);
    }
    public void reset(){
        xCoor=(int) Math.sqrt(gridSize)/2;
        yCoor=xCoor;
    }
}