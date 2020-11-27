public abstract class Weapon {

    protected String name;
    protected int apcost;
    protected int damage;
    protected boolean melee;

    protected Weapon(String name, int apcost, int damage, boolean melee) {
        this.name = name;
        this.apcost = apcost;
        this.damage = damage;
        this.melee = melee;
    }

    public String getName() {
        return this.name;
    }

    public int getApcost() {
        return this.apcost;
    }

    public int getDamage() {
        return this.damage;
    }

    public boolean isMelee() {
        return this.melee;
    }

    public abstract void attack();
}