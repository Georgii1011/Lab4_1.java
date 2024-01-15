package items;

public enum Prepositions {
    A("а "),
    from("из "),
    in("в "),
    and("и "),
    Because("Поскольку "),
    More("ещё "),
    However("однако "),
    Zhe("же"),
    Already("уже "),
    Familiar_us("знакомый нам "),
    Not("не "),
    Butb("зато "),
    Dlya("для "),
    How("как "),
    To("то "),
    K("к "),
    Them("им "),
    Their_on("их на ");

    private final String prepositions;

    Prepositions(String prepositions){
        this.prepositions = prepositions;
    }

    public String getNouns(){
        return prepositions;
    }

    @Override
    public String toString(){
        return prepositions;
    }


}
