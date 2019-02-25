import java.util.ArrayList;

public class Purse {
    private ArrayList<String> purse=new ArrayList<>();
    public void addCoin(String coinName){
        this.purse.add(coinName);
    }
    public void transfer(Purse other){
        other.purse = new ArrayList<>(this.purse);
        this.purse.clear();
    }
     public boolean sameContents(Purse other){
             return (this.purse.equals(other.purse));
     }
     public boolean sameCoins(Purse other) {
         int quarter= 0;
         int dime=0;
         int nickel=0;
         int otherquarter=0;
         int otherdime=0;
         int othernickel=0;
             if (this.purse.size()==other.purse.size()){
                for(String i:this.purse){
                     if (i.equals("Quarter")){
                         quarter++;
                     }else if(i.equals("Dime")){
                         dime++;
                     }else if(i.equals("Nickel")){
                         nickel++;
                     }}
                for(String i:other.purse){
                    if (i.equals("Quarter")){
                        otherquarter++;
                    }else if(i.equals("Dime")){
                            otherdime++;
                    }else if(i.equals("Nickel")){
                        othernickel++;
                    }
                 }
             if ((quarter==otherquarter)&&(dime==otherdime)&&(nickel==othernickel)){
                 return true;
             }else {return false;}
             }else {return false;}
     }
     public String toString(){
         return ("Purse"+purse);
     }
}