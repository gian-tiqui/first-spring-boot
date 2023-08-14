package com.gian.quiz_app.dao;

import com.gian.quiz_app.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizDao extends JpaRepository<Quiz, Integer> {


}
