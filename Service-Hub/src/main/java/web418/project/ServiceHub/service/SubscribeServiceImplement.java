package web418.project.ServiceHub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web418.project.ServiceHub.model.PackageDetails;
import web418.project.ServiceHub.model.Subscribe;
import web418.project.ServiceHub.repository.SubscribeRepo;

import java.util.List;

@Service
public class SubscribeServiceImplement implements SubscribeService{

    @Autowired
    private SubscribeRepo subscribeRepo;

    @Override
    public Subscribe saveSubscribeDetails(Subscribe subscribe) {
        return subscribeRepo.save(subscribe);
    }

    @Override
    public List<Subscribe> getAllSubscribeDetails() {
        return subscribeRepo.findAll();
    }


}
