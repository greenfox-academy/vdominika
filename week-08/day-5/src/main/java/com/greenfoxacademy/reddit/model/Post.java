package com.greenfoxacademy.reddit.model;

        import javax.persistence.Entity;
        import javax.persistence.GeneratedValue;
        import javax.persistence.GenerationType;
        import javax.persistence.Id;
        import java.time.LocalDate;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    public Long id;
    public int score;
    String content;
    public LocalDate date;

    public Post(String content) {
        this.content = content;
        this.date = LocalDate.now();
    }

    public Post() {
        this.date = LocalDate.now();
    }


    public void setId(Long id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

