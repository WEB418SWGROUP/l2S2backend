package web418.project.ServiceHub.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import web418.project.ServiceHub.model.Profile;
import web418.project.ServiceHub.service.ProfileService;

import java.util.List;

@RestController
@RequestMapping("/profiles")
@CrossOrigin(origins = "http://localhost:3000")
public class ProfileController {
    @Autowired
    private ProfileService profileService;

    @PostMapping("/addprofile")
    public String add(@RequestBody Profile profile){
        profileService.saveProfileDetails(profile);
        return "profile added";
    }
    @GetMapping("/getProfile")
    public List<Profile> getAllProfileDetails(){
        return profileService.getAllProfileDetails();
    }


}
