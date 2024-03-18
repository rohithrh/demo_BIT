package com.example.demo_BIT.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comment {

    public  Integer commentID;
    public  Integer userID;
    public  String commentMessage;
    public  ArrayList<Comment> replies;
}
