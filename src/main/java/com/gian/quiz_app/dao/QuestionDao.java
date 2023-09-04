package com.gian.quiz_app.dao;

import com.gian.quiz_app.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Repository
public interface QuestionDao extends JpaRepository<Question, Integer> {
    List<Question> findByCategory(String category);

//    @Query(
//            value = "SELECT * FROM question q Where q.category = :category ORDER BY RANDOM() LIMIT numQ",
//            nativeQuery = true
//    )
//    List<Question> findRandomQuestionsByCategory(@PathVariable String category, int numQ);
}
