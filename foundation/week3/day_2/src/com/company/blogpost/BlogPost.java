package com.company.blogpost;

public class BlogPost {
    String title;
    String authorName;
    String publicationDate;
    String text;
    public BlogPost (String title, String authorName, String publicationDate, String text ) {
        this.title = title + "\n";
        this.authorName = "Author of post: " + authorName ;
        this.publicationDate = "\n" + publicationDate;
        this.text = "\n" + text + "\n";
    }
    public void writeBlogPost (){
        System.out.println( title + authorName + publicationDate + text);
    }
}

