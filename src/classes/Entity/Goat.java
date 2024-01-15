package classes.Entity;
import classes.Entity.Entitites;
import interfaces.Goat_actions;
public class Goat extends Entitites implements Goat_actions{
    public Goat(String name){
        super(name);
    }

    @Override
    public String pull_out(){
        return "Вытащив";
    }

    @Override
    public String put_on(){return " принялся класть ";}

    @Override
    public String lay(){return " Застелив ";}

    @Override
    public String come(){return " подошел";}

    @Override
    public String arrange_how(){return "устроил точно таким же путём";}

    @Override
    public String turn(){return "поверпнул ";}

    @Override
    public String coming(){return "Подойдя ";}

    @Override
    public String toString() {
        return getName();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
