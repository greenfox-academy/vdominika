public class Student extends Person {

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

}
