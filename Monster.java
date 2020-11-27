abstract class Monster extends Unit {
    protected int damage = 0;
    protected int apcost = 0;

    protected Monster(String Name, int Hp, int Ap) {
        super(Name, Hp, Ap);
    }

    public int getDamage() {
        return this.damage;
    }

    public int getApcost() {
        return this.apcost;
    }

    public boolean equip(Weapon weapon) {
        if(this.getHp() == 0)
            return false;
        System.out.println("Monsters are proud and fight with their own bodies.");
        return false;
    }

    public boolean attack(Fighter fighter) {
        if(this.getHp() == 0)
            return false;
        if (this.unit != fighter){
            System.out.println(this.getName() + ": I'm too far away from " + fighter.getName());
        return false;
        }
        else
           if (ap >= apcost){
                ap = ap - apcost;
                System.out.println(this.getName() + " attacks" + fighter.getName()); 
                return true;
            }
            else
                return false;

        }
}

