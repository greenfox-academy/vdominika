import java.text.SimpleDateFormat;

public class BlogPost {
    String authorName;
    String title;
    String text;
    String publicationDate;

    public BlogPost(String authorName, String title, String text, String publicationDate){
        this.authorName = authorName;
        this.title = title;
        this.text = text;
        this.publicationDate = publicationDate;
    }

    public void printOut (){
        System.out.println ("Hi, this is the "+ title + "titled " + text + " by " + authorName + " what was published on " + publicationDate);
    }
}
