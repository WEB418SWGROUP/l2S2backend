package web418.project.ServiceHub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import web418.project.ServiceHub.model.PackageComment;
import web418.project.ServiceHub.service.PackageCommentService;

import java.util.List;

@RestController
@RequestMapping("/packageComments")
@CrossOrigin
public class PackageCommentController {
    @Autowired
    private PackageCommentService packageCommentService;

    @PostMapping("/addComment")
    public String add(@RequestBody PackageComment packageComment){
        packageCommentService.savePackageComments(packageComment);
        return "comment added";
        }
    @GetMapping("/getComment")
    public List<PackageComment> getAllPackageComment()
    {
        return packageCommentService.getAllPackageComment();
    }
}



