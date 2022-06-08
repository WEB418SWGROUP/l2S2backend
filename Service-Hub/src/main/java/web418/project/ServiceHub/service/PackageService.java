package web418.project.ServiceHub.service;

import org.springframework.web.bind.annotation.PathVariable;
import web418.project.ServiceHub.model.Packages;

import java.util.List;

public interface PackageService {
    public Packages savePackageDetails(Packages packages);
    public List<Packages> getAllPackageDetails();
    public Packages getEachPackageDetail(@PathVariable Integer id);


}
