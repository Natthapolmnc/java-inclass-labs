public class MagicSquare{
    public int[][] set;
    private int n;
    public MagicSquare(int n){
        this.n=n;
        set=new int[n][n];
        int thenum=1;
        int i=4;
        int j=2;
        while(thenum<=Math.pow(n, 2)){
            set[i%5][j%5]=thenum;
            thenum++;
            if (set[(i+1)%5][(j+1)%5]!=0){
                i-=1;
                continue;
            }
            i+=1;
            j+=1;
        }
    }
    
    public String etring(){
        String ans="";
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                ans+=set[i][j];
                ans+=" ";
            }
            ans+="\n";
        }
        return ans;
    }

}
