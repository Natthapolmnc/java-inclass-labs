import java.util.Scanner;

public class Bridge{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String brigdeName=input.next();
        String AZ09="QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm012345789";
        int brigdeLenCount=0;
        int cnter=0;
        int AZcnter=0;
        while (brigdeLenCount!=brigdeName.length()) {
            if (brigdeName.charAt(cnter)==AZ09.charAt(AZcnter)){
                brigdeLenCount+=1;
                cnter+=1;
                AZcnter=0;
            }else if (AZcnter<AZ09.length()){
                AZcnter+=1;
            }else{
                System.out.println("INVALID INPUT");
            }
        input.close();
        }
    System.out.println("thx"); 
    }
}