public class Hero extends  Attacker{

    private int _experience;
    private String _name;


    public Hero(String name){
        _name = name;
        _health = 100;
    }


    public void attack(String target){
        _attack = target;
    }
}
