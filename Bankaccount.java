public class Bankaccount{
    private double Balan;
    public Bankaccount(){
        Balan=0;
    }
    public void deposite(double x) {
        Balan+=x;
    }
    public void withdraw(double y){
        Balan-=y;
    }
    public double getBalance(){
        return Balan;
    }

        
   }
