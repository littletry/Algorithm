package top.huangt.algorithm.algorithm.java8.test1;

/**
 * @Author: ht
 * @Date: 2018-12-04 17:00
 */
public class Apple {

    private String name;

    private String color;

    private int weight;

    Apple(String name, String color, int weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }

    static boolean isGreenApple(Apple apple) {
        return "green".equals(apple.getColor());
    }

    static boolean isHeavyApple(Apple apple) {
        return apple.getWeight() > 150;
    }
}
