package FirstActivity;

public class Employee extends Person {

    private String name;
    private int age;
    private String jobTitle;
    private String company;
    private double salary;

    public Employee() {
        this.name = "Unknown";
        this.age = 0;
        this.jobTitle = "Unknown";
        this.company = "Unknown";
        this.salary = 0;
    }

    public Employee(String name, int age, String jobTitle, String company, double salary) {
        this.name = name;
        this.age = age;
        this.jobTitle = jobTitle;
        this.company = company;
        this.salary = salary;
    }

    public String getName () {return name;}
    public void setName (String name){this.name = name;}
    public int getAge () {return age;}
    public void setAge (int age){this.age = age;}
    public String getJobTitle () {return jobTitle;}
    public void setJobTitle (String jobTitle){this.jobTitle = jobTitle;}
    public String getCompany () {return company;}
    public void setCompany (String company){this.company = company;}
    public double getSalary () {return salary;}
    public void setSalary (double salary){this.salary = salary;}

    public static void main(String[] args) {
        Employee e =  new Employee ();
        e.setName("Elon Musk");
        e.setAge(49);
        e.setCompany("Tesla");
        e.setJobTitle("CEO");

        System.out.println("My name is" + " " + e.getName() + " " + "and I am" + " " + e.getAge() +","
                + "I work as" + " " + e.getJobTitle() + " " + "in" + " " + e.getCompany());
    }

    }





