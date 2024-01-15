import classes.Entity.Dunno;
import classes.Entity.Friends;
import classes.Entity.Goat;
import classes.Objects.*;
import items.Nouns;
import items.Prepositions;

public class Main {
    public static void main(String[] args){
        Goat goat = new Goat("Козлик");
        Money money = new Money("монетки");
        Tongues tongues = new Tongues("язычки");
        Hole hole = new Hole("Отверстие");
        Wall wall = new Wall("Стена");
        Dunno dunno = new Dunno("Незнайка");
        TV tv = new TV("телевидение");
        Friends friends = new Friends("друзья");
        Handle handle = new Handle("рукоятка");
        Santik santik = new Santik("сантик");
        Television television = new Television("Телевизор");

        System.out.println(goat.pull_out() + money.toString() + goat.getName() + goat.put_on()+Prepositions.Their_on+"высунытые " + tongues.getName() + ". Один за другим " + tongues.getName() + tongues.disappeared() + tongues.swallowed() + money.getName()+", "+Prepositions.A+Prepositions.from+hole.toString() + hole.open()+Prepositions.in+wall.toString());
        System.out.println(tongues.jump()+Prepositions.How+Prepositions.from+ Nouns.gun+Prepositions.To+Nouns.what_bedsheet+Prepositions.To+Nouns.pillow+Prepositions.To+Nouns.blanket+goat.lay()+Nouns.bed+". "+goat.getName()+goat.come()+Prepositions.K+Nouns.other_shelf+Prepositions.and+goat.arrange_how());
        System.out.println(Nouns.bed + " " + Prepositions.Dlya+dunno.toString()+Prepositions.Because+friends.sleep()+Prepositions.More+friends.dont_want()+friends.getName()+friends.decidedto_watch()+tv.getName()+". "+goat.coming()+Prepositions.K+television.toString()+goat.getName()+" "+goat.turn()+handle.toString()+television.getName()+", "+Prepositions.However+Prepositions.Zhe+", "+Prepositions.Not);
        System.out.println(television.take_on()+Prepositions.Butb+tongues.up_leaned_out()+Prepositions.Already+Prepositions.Familiar_us+tongues.skl()+Prepositions.and+tongues.demond_what()+Nouns.five+santik.toString());
    }
}