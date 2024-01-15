package classes.Entity;

import interfaces.Friends_actions;
import interfaces.Sleep;

public class Friends extends Entitites implements Friends_actions, Sleep {
    public Friends(String name){
        super(name);
    }

    @Override
    public String sleep() {
        return "спать ";
    }

    @Override
    public String decidedto_watch() {
        return " решили посмотреть ";
    }

    @Override
    public String dont_want() {
        return "не хотелось, ";
    }


}
