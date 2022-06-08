package web418.project.ServiceHub.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import web418.project.ServiceHub.model.Packages;
import web418.project.ServiceHub.repository.PackageRepo;


//@Service
//public class PackageServiceImplement implements PackageService{
//    @Autowired
//    private PackageRepo packageRepo;
//
//    @Override
//    public Packages savePackageDetails(PackageDetails packageDetails){
//        return packageRepo.save(packageDetails);
//    }
//    @Override
//    public List<Packages> getAllPackageDetails(){
//        return packageRepo.findAll();
//    }
//}
@Service
public class PackageServiceImplement implements PackageService{
    @Autowired
    private PackageRepo packageRepo;

    @Override
    public Packages savePackageDetails(Packages packages){
        return  packageRepo.save(packages);
    }

    @Override
    public List<Packages> getAllPackageDetails(){
        return  packageRepo.findAll();
    }
    @Override
    public Packages getEachPackageDetail(@PathVariable Integer id){
        return packageRepo.findById(id).orElse(null);
    }
}

