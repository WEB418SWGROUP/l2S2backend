package web418.project.ServiceHub.service;

import web418.project.ServiceHub.model.PackageDetails;

import java.util.List;

public interface PackageService {
    public PackageDetails savePackageDetails(PackageDetails packageDetails);
    public List<PackageDetails> getAllPackageDetails();


}
