public class PurseTester{
    public static void main(String[] args) {
        Purse kaii=new Purse();
        Purse kaii2=new Purse();
        kaii.addCoin("Dime");
        kaii.addCoin("Quarter");
        kaii2.addCoin("Quarter");
        kaii2.addCoin("Dime");
        System.out.println("Is kaii sameContents kaii2"+kaii.sameContents(kaii2));
        kaii.addCoin("Dime");
        kaii2.addCoin("Dime");
        System.out.println("Is kaii sameCoins kaii2"+kaii.sameCoins(kaii2));
        System.out.println(kaii);
        System.out.println("kaii2 is: "+kaii2);
        kaii.transfer(kaii2);
        System.out.println("Now kaii2 is"+kaii2);
    }
}