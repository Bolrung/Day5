abstract class Unit implements Fighter {
    private String name;
    protected int hp;
    protected int ap;
    protected Fighter unit;
    protected boolean cac;
    public Fighter getTarget() {
        return (unit);
    }
    public String getName() {
        return (name);
    }
    public int getHp() {
        return (hp);
    }
    public int getAp() {
        return (ap);
    }
    protected Unit(String name, int hp, int ap) {
        name = name;
        hp = hp;
        ap = ap;
    }
    public void receiveDamage(int damage) {
        hp = hp - damage;
        if (hp < 0)
            hp = 0;
    }
    public boolean moveCloseTo(Fighter Unit) {
        if (hp <= 0)
            return false;
        if (Unit == null || this == Unit)
            return false;
        if (unit != Unit) {
            System.out.println(name + " is moving closer to " + Unit.getName() + ".");
            unit = Unit;
            return true;
        }
        return false;
    }
    public void recoverAP() {
        ap = ap + 7;
        if (ap > 50)
            ap = 50;
    }
}