class Warrior extends Player{
    Warrior(){
        super.setMaxHp(20);
        super.setDmg(5);
        super.setExp(0);
        super.setLevel(1);
        super.setHp(super.getHp());
    }
    public void UpdateLevel(){
        while (super.getExp()>(super.getLevel()*super.getLevel())){
            super.setExp(super.getExp()-(super.getLevel()*super.getLevel()));
            super.setLevel(super.getLevel()+1);
        }
        super.setDmg(super.getDmg()*super.getLevel());
        super.setHp(super.getMaxHp()+(super.getLevel()*15));
    }
}