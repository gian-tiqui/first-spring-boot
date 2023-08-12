package com.gian.quiz_app.dao;

import com.gian.quiz_app.controller.QuestionService;
import com.gian.quiz_app.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionDao extends JpaRepository<Question, Integer> {
    List<Question> findByCategory(String category);
}