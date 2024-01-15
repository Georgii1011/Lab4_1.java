package classes.Objects;

import classes.Entity.Entitites;
import interfaces.Not_take_on;

public class Television extends Entitites implements Not_take_on {
    public Television(String name){super(name);}

    public String toString(){
        return "телевизору, ";
    }

    public String take_on(){return "включился, ";}
}
