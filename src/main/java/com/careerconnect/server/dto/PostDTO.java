package com.careerconnect.server.dto;

import lombok.Data;

@Data
public class PostDTO {
    // for validating objects from the frontend
    /*
        const defaultObj = {
            profile:"",
            type:"",
            description:"",
            experience:"",
            technology: [],
            salary:""
        }
    */

    // keys should be same coming from frontend

    private String profile;

    private String type;

    private String description;

    private String experience;

    private String[] technology;

    private String salary;

    // this validates the type of parameters

    // The @Data of lombok will automatically give us the getters and setters

}
