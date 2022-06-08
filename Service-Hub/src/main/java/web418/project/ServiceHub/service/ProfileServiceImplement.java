package web418.project.ServiceHub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web418.project.ServiceHub.model.Packages;
import web418.project.ServiceHub.model.Profile;
import web418.project.ServiceHub.repository.ProfileRepo;

import java.util.List;
@Service
public class ProfileServiceImplement implements ProfileService {
    @Autowired
    ProfileRepo profileRepo;
    @Override
    public Profile saveProfileDetails(Profile profile){
            return  profileRepo.save(profile);
        }
    @Override
    public List<Profile> getAllProfileDetails(){
        return profileRepo.findAll();
    }
    }




