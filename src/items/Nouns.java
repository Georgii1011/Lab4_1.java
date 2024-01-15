package items;

public enum Nouns {
    what_bedsheet("аккуратно сложенная простыня, "),
    pillow("подушка, "),
    bed("постель"),
    blanket("одеяло."),
    other_shelf("другой полке "),
    gun("автомата, "),
    five("пять ");

    private final String nouns;

    Nouns(String nouns){
        this.nouns = nouns;
    }

    public String getNouns(){
        return nouns;
    }

    @Override
    public String toString(){
        return nouns;
    }
}
