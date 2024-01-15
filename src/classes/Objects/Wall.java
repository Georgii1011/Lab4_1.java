package classes.Objects;

import classes.Entity.Entitites;

public class Wall extends Entitites {
    public Wall(String name){
        super(name);
    }

    public String toString(){
        return "стене,";
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
}
