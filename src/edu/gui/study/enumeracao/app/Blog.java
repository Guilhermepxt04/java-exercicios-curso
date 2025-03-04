package edu.gui.study.enumeracao.app;

import edu.gui.study.enumeracao.entities.Comment;
import edu.gui.study.enumeracao.entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Blog {

    public static void main(String [] args) throws ParseException {

        SimpleDateFormat momment = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String title = "Traveling to New Zealand";
        String content = "I'm going to visit this wonderful country!";
        Integer likes = 12;

        Post post = new Post(momment.parse("21/06/2018 13:05:44"),  title, content, likes);
        System.out.println(post);

        Comment comment = new Comment("Have a nice trip!");
        post.addComment(comment);
        comment = new Comment("Wow that's awesome!");
        post.addComment(comment);

        for (Comment c : post.getComments()) {
            System.out.println(c);
        }



    }

}
