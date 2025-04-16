package project;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public abstract class Document {
    private String title;
    private LocalDateTime created;
    private String descriptive;
    private Object content;
    private String author;

    public void test() {
        System.out.println("blablablaa");
    }

    public static void documentProcessor(Document d) {
        System.out.println(d.title + " wordt geprocesst");
    }

    // Vervangen door Lombok:

//    public project.Document() {
//    }
//
//    public project.Document(String title, LocalDateTime created, String descriptive, Object content, String author) {
//        this.title = title;
//        this.created = created;
//        this.descriptive = descriptive;
//        this.content = content;
//        this.author = author;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public LocalDateTime getCreated() {
//        return created;
//    }
//
//    public void setCreated(LocalDateTime created) {
//        this.created = created;
//    }
//
//    public String getDescriptive() {
//        return descriptive;
//    }
//
//    public void setDescriptive(String descriptive) {
//        this.descriptive = descriptive;
//    }
//
//    public Object getContent() {
//        return content;
//    }
//
//    public void setContent(Object content) {
//        this.content = content;
//    }
//
//    public String getAuthor() {
//        return author;
//    }
//
//    public void setAuthor(String author) {
//        this.author = author;
//    }
}
