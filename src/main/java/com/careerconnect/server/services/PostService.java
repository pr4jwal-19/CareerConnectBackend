package com.careerconnect.server.services;

import com.careerconnect.server.dto.PostDTO;
import com.careerconnect.server.models.PostModel;

public interface PostService {
    // this class gives you methods which returns you a client obj
    // defines a service which provides with client

    // to save the payload into the database we created a service
    // which takes the payload coming to Controller from client
    // returns an obj of client
    public PostModel savePost(PostDTO postDTO);
}
