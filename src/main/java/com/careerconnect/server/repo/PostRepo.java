package com.careerconnect.server.repo;

import com.careerconnect.server.models.PostModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepo extends MongoRepository<PostModel,String> {

}
