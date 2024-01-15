package classes.Objects;

import classes.Entity.Entitites;
import interfaces.Tongues_actions;

public class Tongues extends Entitites implements Tongues_actions {
    public Tongues(String name){
        super(name);
    }

    @Override
    public String disappeared() {
        return " исчезали,";
    }

    @Override
    public String swallowed() {
        return " словно проглатывали ";
    }

    @Override
    public String jump() {
        return "выскакивали, ";
    }

    @Override
    public String up_leaned_out() {
        return "сверху высунулся ";
    }

    @Override
    public String skl() {
        return "язычок";
    }

    @Override
    public String demond_what(){
        return "потребовал плату сразу ";
    }

}
