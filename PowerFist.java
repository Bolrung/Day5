public class PowerFist extends Weapon{

    @Override
    public void attack(){

        System.out.println("SBAM");
    }
    public PowerFist(){
        super("PowerFist",8,80,true);
    }
}