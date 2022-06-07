package web418.project.ServiceHub.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web418.project.ServiceHub.model.PackageDetails;
import web418.project.ServiceHub.repository.PackageRepo;

@Service
public class PackageServiceImplement implements PackageService{
    @Autowired
    private PackageRepo packageRepo;
    @Override
    public PackageDetails savePackageDetails(PackageDetails packageDetails) {
        return packageRepo.save(packageDetails);
    }

    @Override
    public List<PackageDetails> getAllPackageDetails() {
        return packageRepo.findAll();
    }
}
