package web418.project.ServiceHub.service;

import org.springframework.stereotype.Service;
import web418.project.ServiceHub.model.Packages;
import web418.project.ServiceHub.model.Profile;

import java.util.List;


public interface ProfileService {

    public Profile saveProfileDetails(Profile profile);
    public List<Profile> getAllProfileDetails();
}
