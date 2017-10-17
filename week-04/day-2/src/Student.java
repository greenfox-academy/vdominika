import java.lang.Cloneable;

public class Student extends Person implements Cloneable {

    String previousOrganization;
    int skippedDays;
    int numberOfDays;

    public void getGoal(){
        System.out.println ("Be a junior software developer" );
    }

    @Override
    public void introduce(){
        System.out.println ("Hi, I'm " + name +", a "+age+" year old "+gender+" from "+previousOrganization+" who skipped "+skippedDays+" days from the course already." );
    }
    public void skipDays (int numberOfdays){
        skippedDays++;
    }
    public Student (){
        super("Jane Doe", 30, "female");
        this.previousOrganization = "The school of Life";
    }
    public Student(String name, int age, String gender, String previousOrganization){
        skippedDays = 0;
    }

    public Student clone() {
        return new Student (this.name, this.age, this.gender, this.previousOrganization)
    }

    public static void main(String[] args) {
        Student john = new Student("John Doe", 20, "male", "BME");
        Student johnTheClone = john.clone();
    }

}
