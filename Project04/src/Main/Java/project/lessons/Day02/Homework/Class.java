package project.lessons.Day02.Homework;

class TheClass {

    private String name = "Vasya";
    private int age = 14;

    //public TheClass(String name, int age){ System.out.println(age+name);}


    public TheClass(){ System.out.println(age+name);}

    public static void main(String[] args) {


        // \u000d
        // System.out.println(a);
        System.out.println('a');
        System.out.println(1);

        TheClass theClass = new TheClass();
        theClass.theMethod();
        new TheClass().theMethod();
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

    public void theMethod(){
        System.out.println("gfjhndflkjhn");



    }

}
