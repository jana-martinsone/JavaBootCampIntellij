package FirstActivity;

public class Students extends Person{

    private String schoolName;

    public Students() {
        this.schoolName = "Unknown";
    }

    public Students(String name, String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolName() {return schoolName;}
    public void setSchoolName (String schoolName){this.schoolName = schoolName;}

    public static void main(String[] args) {
        Students s =  new Students ();
        s.setSchoolName ("Yale");

        System.out.println("I study in" + " " + s.getSchoolName());
    }

}

