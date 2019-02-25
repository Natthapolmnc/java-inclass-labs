/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Zeller {
    private int dayOfMonth;
    private int month;
    private int year;
    private int weekday;
    public Zeller(int DoM,int M,int Y){
        dayOfMonth=DoM;
        if ((M==1)||M==2){
        month=M+12;
        year=Y-1;
    }else{
            month=M;
            year=Y;
        }



        
    }
    public enum Day{
         SUNDAY("Sunday"), MONDAY("Monday"), TUESDAY("Tuesday"), WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"), FRIDAY("Friday"), SATURDAY("Saturday"),DE("");String val="";
    private Day(String val){
        this.val=val;
    }
    public String toString(){
        return this.val;
    }
    }
    public Day getDayofweek(){
       int q=dayOfMonth;
       int m=month;
       double j=year/100;
       double k=year%100;
       weekday=(int) ((q+((26*(m+1))/10)+k+(k/4)+(j/4)+(5*j))%7);
        System.out.println(weekday);
       switch (weekday){
           case 0: return Day.SATURDAY;
           case 1: return Day.SUNDAY;
           case 2: return Day.MONDAY;
           case 3: return Day.TUESDAY;
           case 4: return Day.WEDNESDAY;
           case 5: return Day.THURSDAY;
           case 6: return Day.FRIDAY;
           default:
               return Day.DE;
      }
}

    
    }
