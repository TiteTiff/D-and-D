package tiffanie.dnd.equipment;

abstract public class Equipment {
    private String type;
    private String name;
    private int effect;

    public Equipment(String type, String name, int effect) {
        this.type = type;
        this.name = name;
        this.effect = effect;
    }

    public String toString () {
        return "Equipment{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", effect=" + effect +
                '}';
    }
}
