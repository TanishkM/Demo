package com.example.demo.entity;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection="users") // tells that below in mapped with mongoDB collection
@Getter // lombok annotations
@Setter // lombok annotations
public class User {
    @Id
    private ObjectId id;

    @Indexed(unique = true)
    @NonNull
    private String username;
    @NonNull
    private  String password;

}
