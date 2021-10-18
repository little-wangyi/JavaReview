package enumerous;

public class example1 {
    public static void main(String[] args) {
        System.out.println(Season.SPRING.toString());
        System.out.println(Season.SUMMER.toString());
    }
}

enum Season {
    SPRING("春天", "温暖"), SUMMER("夏天", "炎热");
    private String name;
    private String attribute;

    Season(String name, String attribute) {
        this.name = name;
        this.attribute = attribute;
    }

    public String getName() {
        return name;
    }

    public String getAttribute() {
        return attribute;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", attribute='" + attribute + '\'' +
                '}';
    }
};
