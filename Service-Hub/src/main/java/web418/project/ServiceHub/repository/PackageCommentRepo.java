package web418.project.ServiceHub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import web418.project.ServiceHub.model.PackageComment;

@Repository
public interface PackageCommentRepo extends JpaRepository<PackageComment, Integer> {

}
