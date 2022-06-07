package web418.project.ServiceHub.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import web418.project.ServiceHub.model.PackageDetails;
import web418.project.ServiceHub.model.Subscribe;
import web418.project.ServiceHub.service.SubscribeService;

import java.util.List;

@RestController
@RequestMapping("/subscribe")
@CrossOrigin(origins = "http://localhost:3000")
public class SubscribeController {

    @Autowired
    private SubscribeService subscribeService;

    @PostMapping("/addcard")
    public String add(@RequestBody Subscribe subscribe){
        subscribeService.saveSubscribeDetails(subscribe);
        return "detail added";

    }
    @GetMapping("/getAllSubscribeDetails")
    public List<Subscribe> getAllSubscribeDetails() {
        return subscribeService.getAllSubscribeDetails();
    }
}
