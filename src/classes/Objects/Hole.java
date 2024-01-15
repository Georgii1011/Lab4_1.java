package classes.Objects;

import classes.Entity.Entitites;
import interfaces.Hole_actions;

public class Hole extends Entitites implements Hole_actions {
    public Hole(String name){
        super(name);
    }

    @Override
    public String open(){return "открывшегося ";}

    public String toString(){
        return "отверстия, ";
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
