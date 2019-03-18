abstract class Character{
    private double Hp;
    private double maxHp;
    private double Dmg;
    private String name; 
    public void attack(Character Other){
        Other.hp-=dmg;
        if (Other.hp<0){
            Other=null;
            System.out.println(Other.name+"is fainted");
        }
    }
    public abstract String toString();
    public double getHp(){
        return Hp;
    }
    public double getMaxHp(){
        return maxHp;
    }
    public double GetDmg(){
        return Dmg;
    }
    public String GetName(){
        return name;
    }
    public void setHp(double Hp){
        this.Hp=Hp;
    }
    public void setMaxHp(double maxHp){
        this.maxHp=Hp;
    }
    public void setDmg(double Dmg){
        this.Dmg=Dmg;
    }
    public void setName(String name){
        this.name=name;
    }
}