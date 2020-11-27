public class PlasmaRifle extends Weapon {
    @Override
    public void attack() {
        System.out.println("PIOU");
    }
    public PlasmaRifle() {
        super("PlasmaRifle", 5, 21, false);
    }
}
