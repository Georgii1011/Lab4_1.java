package classes.Objects;

import classes.Entity.Entitites;

public class Money extends Entitites {
    public Money(String name){
        super(name);
    }
    @Override
    public String toString() {
        return " горсть монеток. ";
    }
}
