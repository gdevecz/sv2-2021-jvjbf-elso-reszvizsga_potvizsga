package teahouse;

public enum Sort {

    BLACK_TEA("élénkítő hatású"),
    GREEN_TEA("méregtelenít"),
    ROOIBOS("tele van antioxidánsokkal"),
    HERBAL_TEA("sok különféle gyógyhatása van"),
    FRUIT_TEA("finom, édes ízű");

    private final String effect;

    Sort(String effect) {
        this.effect = effect;
    }

    public String additionalInfo(){
        return effect;
    }
}
