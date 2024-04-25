package com.careerconnect.server.services;

import com.careerconnect.server.dto.PostDTO;
import com.careerconnect.server.models.PostModel;
import com.careerconnect.server.repo.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImp implements PostService{

    // interface cannot be instantiated
    // Autowired will help create the obj of interface -> PostRepo
    @Autowired
    PostRepo postRepo;

    // this payload will get saved into database here
    @Override
    public PostModel savePost(PostDTO postDTO) {
        // to call the dB
        PostModel model = new PostModel();

        model.setProfile(postDTO.getProfile());
        model.setType(postDTO.getType());
        model.setDescription(postDTO.getDescription());
        model.setExperience(postDTO.getExperience());
        model.setTechnology(postDTO.getTechnology());
        model.setSalary(postDTO.getSalary());

        return postRepo.save(model);

    }
}
