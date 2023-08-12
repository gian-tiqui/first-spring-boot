package com.gian.quiz_app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer qid;
    private String question;
    private Integer opt1;
    private Integer opt2;
    private Integer correctAns;
    private String category;
    private String difficulty;

}
