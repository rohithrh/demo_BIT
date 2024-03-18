package com.example.demo_BIT.Services;

import com.example.demo_BIT.Model.Comment;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.stream.Collectors;

@Service
public class CommentService {
    ArrayList<Comment> al=new ArrayList<>();

    public void addComment(Comment c){
        al.add(c);
    }
    public ArrayList<Comment> getAllComments(){
        return this.al;
    }
    public ArrayList<Comment> getComment(String userId){
        return (ArrayList<Comment>) this.al.stream().filter(e-> e.userID.equals(userId)).collect(Collectors.toList());
    }
    public void replyComment(Comment comment){
        al.stream().filter(e->e.commentID.equals(comment.commentID)).map(e->e.replies.add(comment));
    }

}
