package web418.project.ServiceHub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import web418.project.ServiceHub.model.PackageDetails;
import web418.project.ServiceHub.service.PackageService;

import java.util.List;

@RestController
@RequestMapping("/packageDetails")
@CrossOrigin(origins = "http://localhost:3000")
public class PackageController {

    @Autowired
    private PackageService packageService;

    @PostMapping("/add")
    public String add(@RequestBody PackageDetails packageDetails){
        packageService.savePackageDetails(packageDetails);
        return "data added";

    }
    @GetMapping("/getAll")
    public List<PackageDetails> getAllPackageDetails(){
        return packageService.getAllPackageDetails();
    }
}
