package FirstActivity;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person() {
        this.firstName = "Unknown";
        this.lastName = "Unknown";
        this.age = 0;
    }

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {return firstName;}
    public void setFirstName(String firstName) {this.firstName = firstName;}
    public String getLastName() {return lastName;}
    public void setLastName(String lastName) {this.lastName = lastName;}
    public int getAge() {return age;}

    public void setAge(int age) {this.age = age;}

    public static void main(String[] args) {

        Person p = new Person();
        p.setFirstName("Bill");
        p.setLastName("Gates");
        p.setAge(65);

        System.out.println("My name is" + " " + p.getFirstName() + " " + p.getLastName() + " " + "and I am" + " " + p.getAge() + " " + " " + "years old");


    }
}

