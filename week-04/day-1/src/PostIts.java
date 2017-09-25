import static java.awt.Color.*;

public class PostIts {
    public static void main(String[] args) {

        PostIt p1 = new PostIt ("orange", "Idea 1", "blue");
        PostIt p2 = new PostIt ("pink", "Awsome!", "black");
        PostIt p3 = new PostIt ("yellow", "Superb!", "green");

        p1.speak ();
        p2.speak ();
        p3.speak ();
    }
}
