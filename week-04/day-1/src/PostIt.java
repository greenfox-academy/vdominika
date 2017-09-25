import java.awt.*;

public class PostIt {
    String backgroundColor;
    String text;
    String textColor;

    public PostIt (String backgroundColor, String text, String textColor){
        this.backgroundColor = backgroundColor;
        this.text = text;
        this.textColor = textColor;
    }

    public void speak (){
        System.out.println ("Hi, I am a "+ backgroundColor + "-backgrounded, " + textColor + "-colored big big big " + text);
    }
}
