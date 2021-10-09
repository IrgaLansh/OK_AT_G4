package BaseTask;

public class Mouse {

    String name;
    int age;

    public Mouse(String Name, int Age) {this.age = Age; this.name =Name;}

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}

    public void printMouseDetails(){
        System.out.println("Im mouse, my name is "+ name +" and Im "+ age +" years old.");
    }

}
