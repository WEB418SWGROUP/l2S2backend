package web418.project.ServiceHub.service;

import web418.project.ServiceHub.model.Subscribe;

import java.util.List;

public interface SubscribeService {
    public Subscribe saveSubscribeDetails(Subscribe subscribe);
    public List<Subscribe> getAllSubscribeDetails();
    ;
}
