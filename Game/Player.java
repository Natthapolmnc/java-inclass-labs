abstract class Player extends Character{
    private int gainedExp;
    private int level;
    public int getExp(){
        return gainedExp;
    }
    public int getLevel(){
        return level;
    }
    public void setExp(int Exp){
        gainedExp=Exp;
    }
    public void setLevel(int level){
        this.level=level;
    }
    abstract public void UpdateLevel();
    
}