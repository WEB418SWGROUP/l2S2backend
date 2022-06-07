package web418.project.ServiceHub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web418.project.ServiceHub.model.PackageComment;
import web418.project.ServiceHub.repository.PackageCommentRepo;

import java.util.List;

@Service
public class PackageCommentServiceImplement implements PackageCommentService {
    @Autowired
    private PackageCommentRepo packageCommentRepo;

    @Override
    public PackageComment savePackageComments(PackageComment packageComment){
        return packageCommentRepo.save(packageComment);
    }
    @Override
    public List<PackageComment> getAllPackageComment(){
        return packageCommentRepo.findAll();
    };
}
