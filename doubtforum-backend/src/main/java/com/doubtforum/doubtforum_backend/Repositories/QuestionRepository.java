package com.doubtforum.doubtforum_backend.Repositories;

import com.doubtforum.doubtforum_backend.entity.Question;
import org.springframework.data.repository.CrudRepository;

public interface QuestionRepository extends CrudRepository<Question,Integer> {
}
