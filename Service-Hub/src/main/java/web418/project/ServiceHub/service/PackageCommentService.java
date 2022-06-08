package web418.project.ServiceHub.service;

import org.springframework.stereotype.Service;
import web418.project.ServiceHub.model.PackageComment;


import java.util.List;

@Service
public interface PackageCommentService {

    public PackageComment savePackageComments(PackageComment packageComment);
    public List<PackageComment> getAllPackageComment();
}
