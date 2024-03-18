package com.example.demo_BIT.Controller;

import com.example.demo_BIT.Model.Comment;
import com.example.demo_BIT.Services.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CommentController {
/*
Get all comments
Get all comments by userId
Post a comment
reply to comment
 */
    @Autowired
    CommentService commentService;

    @PostMapping(value="/comment")
    public void postComment(@RequestBody Comment comment){
        this.commentService.addComment(comment);
    }

    @GetMapping(value="/getComment")
    public void getAllComments(){
        this.commentService.getAllComments();
    }
    @GetMapping(value="/getComment/{userID}")
    public void getUserComments(@RequestParam String userID){
        this.commentService.getComment(userID);
    }
    @PostMapping(value="replyComment")
    public void replyComment(@RequestBody Comment comment){
        this.commentService.replyComment(comment);
    }
}
