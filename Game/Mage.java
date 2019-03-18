class Mage extends Player{
    Mage(){
        super.setMaxHp(10);
        super.setDmg(15);
        super.setExp(0);
        super.setLevel(1);
        super.setHp(super.getHp());
    }
    public void UpdateLevel(){
        while (super.getExp()>(super.getLevel()*super.getLevel())){
            super.setExp(super.getExp()-(super.getLevel()*super.getLevel()));
            super.setLevel(super.getLevel()+1);
        }
        super.setDmg(super.getDmg()*(super.getLevel()+4));
        super.setHp(super.getMaxHp()+(super.getLevel()*5));
    }
}