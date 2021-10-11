package BaseTask;

public class Mouse {

    private String name;
    private int age;

    public Mouse(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printMouseDetails() {
        System.out.println("Im mouse, my name is " + getName() + " and Im " + getAge() + " years old.");
    }

}
