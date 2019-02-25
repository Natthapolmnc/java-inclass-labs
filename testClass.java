
public class testClass{
    public static void main(String[] args) {
        Bankaccount Steves= new Bankaccount();
        Steves.deposite(5000);
        Steves.withdraw(500);
        System.out.println(Steves.getBalance());
        
    }
}