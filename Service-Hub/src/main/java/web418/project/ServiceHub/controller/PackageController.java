package web418.project.ServiceHub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import web418.project.ServiceHub.model.Packages;
import web418.project.ServiceHub.repository.PackageRepo;
import web418.project.ServiceHub.service.PackageService;

import java.util.List;

@RestController
@RequestMapping("/packages")
@CrossOrigin(origins = "http://localhost:3000")
public class PackageController {

    @Autowired
    private PackageRepo packageRepo;

    @PostMapping("/add")
    public Packages add(@RequestBody Packages packages){
        return packageRepo.save(packages);
    }
    @GetMapping("/getAll")
    public List<Packages> getAllPackageDetails(){
        return packageRepo.findAll();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Packages> getEachPackageDetail(@PathVariable Integer id){
       Packages packages = packageRepo.findById(id).orElse(null);
       return ResponseEntity.ok(packages);
    }

    @PutMapping("{id}")
    public ResponseEntity<Packages> updatePackage(@PathVariable int id, @RequestBody Packages packageDetails){
        Packages updatedPackage = packageRepo.findById(id).orElse(null);
        updatedPackage.setPrice(packageDetails.getPrice());
        updatedPackage.setDescription(packageDetails.getDescription());
        packageRepo.save(updatedPackage);
        return ResponseEntity.ok(updatedPackage);
    }
}

//    @PostMapping("/add")
//    public String add(@RequestBody Packages packages){
//        packageService.savePackageDetails(packages);
//        return "data added";
//
//    }
//    @GetMapping("/getAll")
//    public List<Packages> getAllPackageDetails(){
//        return packageRepo.findAll();
//    }
//
////    @GetMapping("/{id}")
////    public PackageDetails getIndividualDetails(@PathVariable Integer id){
////        packageRepo.findById(id)
////    }
//    @GetMapping("/{id}")
//    public Packages getEachPackageDetails(@PathVariable Integer id){
//        return packageRepo.findById(id).orElse(null);
//    }

