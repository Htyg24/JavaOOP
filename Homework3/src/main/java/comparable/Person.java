package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Person implements Comparable<Person> {

    private String name;
    private int age;
    private int weight;
    private int height;


    public Person(String name, int age, int weight, int height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }
    
    
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }


    @Override
    public int compareTo(Person o) {
        return this.name.compareTo(o.name);
    }


    public static void main(String[] args) {
        ArrayList<Person> pioples = new ArrayList<>();
        pioples.add(new Person("А", 15, 413, 13));
        pioples.add(new Person("Б", 14, 113, 318));
        pioples.add(new Person("В", 13, 133, 183));
        pioples.add(new Person("Г", 12, 14, 83));

        pioples.sort((o1, o2) -> Integer.compare(o1.age, o2.age));
        System.out.println(pioples);

        pioples.sort((o1, o2) -> Integer.compare(o1.weight, o2.weight));
        System.out.println(pioples);

        pioples.sort((o1, o2) -> Integer.compare(o1.height, o2.height));
        System.out.println(pioples);

        Collections.sort(pioples);
        System.out.println(pioples);
    }


}
