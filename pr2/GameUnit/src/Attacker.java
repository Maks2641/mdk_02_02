public class Attacker {

    public void set_health(int _health) {
        this._health = _health;
    }

    protected int _health;

    public void set_attack(String _attack) {
        this._attack = _attack;
    }

    protected String _attack;


    public void attack(String target){
        this._attack = target;
    }


    public  boolean is_alive(){

        if(_health == 0 | _health < 0)
            return false;
        else
            return true;
    }
}
