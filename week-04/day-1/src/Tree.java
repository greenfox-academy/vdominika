public class Tree {

    String type;
    String leafcolor;
    int age;
    String sex;

    public Tree (String type, String leafcolor, int age, String sex) {
        this.type = type;
        this.leafcolor = leafcolor;
        this.age = age;
        this.sex = sex;

    }

    public Tree (){
        this.type = "";
        this.leafcolor = "";
        this.age = 0;
        this.sex = "";
    }

    public void speak(){
        System.out.println ("Hi, my type is "+ type );
        System.out.println ("My leafcolor is "+ leafcolor );
        System.out.println ("I am "+ age + "years old" );
        System.out.println ("I am "+ sex );
    }
    public void grow(){

    }
}
