

public class Animal {

    private boolean fur;
    private int legs;
    private int height;
    private String name;
    private int age;

    public Animal(String name, int age, boolean fur, int legs, int height){
        this.name = name;
        this.age = age;
        this.fur = fur;
        this.legs = legs;
        this.height = height;
    }

    public void speak(){
        System.out.printf("Hello my name is %s, and my age is %d, I am %d tall and have %d legs... oh and is it %b that I have fur",
                name,
                age,
                height,
                legs,
                fur);
    }
}
