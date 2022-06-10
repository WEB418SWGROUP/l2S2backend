package com.doubtforum.doubtforum_backend.Repositories;

import com.doubtforum.doubtforum_backend.entity.CustomerDislikedComments;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface CustomerDislikedcommentsRepository extends CrudRepository<CustomerDislikedComments, Integer> {
    @Query(value = "SELECT * from customerdislikedcomments where customerId =?1", nativeQuery = true)
    public ArrayList<CustomerDislikedComments> getDisLikedCommentsBy(int customerId);
}
