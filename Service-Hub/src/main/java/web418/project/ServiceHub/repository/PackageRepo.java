package web418.project.ServiceHub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import web418.project.ServiceHub.model.Packages;

@Repository
public interface PackageRepo extends JpaRepository<Packages,Integer> {
}
