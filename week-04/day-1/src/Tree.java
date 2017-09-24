public class Tree {

    String type;
    String leafcolor;
    Int age;
    String sex;

    public Tree (String type, String leafcolor, Int age, String sex);
        this.type = type;
        this.leafcolor = leafcolor;
        this.age = age;
        this.sex = sex;

    public void speak(){
        System.out.println ("Hi, my type is "+ type );
        System.out.println ("My leafcolor is "+ leafcolor );
        System.out.println ("I am "+ age + "years old" );
        System.out.println ("I am "+ sex );
    }
    public void grow(){

    }
}
