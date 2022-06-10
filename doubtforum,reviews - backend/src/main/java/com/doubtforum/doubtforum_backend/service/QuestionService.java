package com.doubtforum.doubtforum_backend.service;

import com.doubtforum.doubtforum_backend.Repositories.QuestionRepository;
import com.doubtforum.doubtforum_backend.entity.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionService {

    @Autowired(required=true)
    public QuestionRepository questionRepository;

    public Question saveQuestion(Question question){

        return  questionRepository.save(question);
    }
}
