package web418.project.ServiceHub.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import web418.project.ServiceHub.model.Subscribe;

@Repository
public interface SubscribeRepo extends JpaRepository<Subscribe,Integer>{
}
