package com.careerconnect.server.controllers;

import com.careerconnect.server.constants.ApiConstants;
import com.careerconnect.server.dto.PostDTO;

import com.careerconnect.server.models.PostModel;
import com.careerconnect.server.services.PostService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
@CrossOrigin
public class PostController {

    //CORS is handled by @CrossOrigin

    /* @Autowired -> doesn't work with final fields */
    // therefore, @RequiredArgsConstructor
    //
    final PostService postService;

    @PostMapping(ApiConstants.SAVE_POST)
    public PostModel savePost(@Valid @RequestBody PostDTO postDTORequest){
        // handles post request from frontend - client
        // @Valid will validate the postDTORequest
        // Slf4j is used to handle logs

        log.info("Saving post ######");

        //now we need to save the object into the database
        // using a service layer -- controllers only handles the api requests

        return this.postService.savePost(postDTORequest);

    }

    @GetMapping(ApiConstants.GET_ALL_POSTS)
    public List<PostModel> getAllPosts(){

        log.info("Get all posts ######");

        return this.postService.getPosts();

    }

}
