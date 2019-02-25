package com.company.blogpost;

public class Main {
    public static void main(String[] args) {
        BlogPost post1 = new BlogPost("Lorem Ipsum" ,"John Doe" , "2000.05.04." , "Lorem ipsum dolor sit amet.");
        post1.writeBlogPost();
        BlogPost post2 = new BlogPost("Wait but why" , "Tim Urban" , "2010.10.10." , "A popular long-form, stick-figure-illustrated blog about almost everything.");
        post2.writeBlogPost();
        BlogPost post3 = new BlogPost("One Engineer Is Trying to Get IBM to Reckon With Trump" , "William Turton" , "2017.03.28." , "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.");
        post3.writeBlogPost();
    }
}
