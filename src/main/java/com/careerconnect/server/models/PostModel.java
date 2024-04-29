package com.careerconnect.server.models;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

// for Sql dB -> we use @Entity
// Mongodb -> Collections : dB
//

@Document(collection = "posts")
@Data
public class PostModel {

    @NotNull
    @NotEmpty
    private String profile;

    @NotNull
    private String type;

    @NotNull
    private String description;

    @NotNull
    private String experience;

    @NotNull
    private String[] technology;

    @NotNull
    private String salary;

    // when it got saved into database
    @NotNull
    @CreatedDate
    private Date createdAt;

    // to save the obj into dB
    // we need a model object
    // since PostDTO is the object coming from frontend which gets validated
    // but if we want to add any extra field into that to save into dB
    // we use the Model

}
