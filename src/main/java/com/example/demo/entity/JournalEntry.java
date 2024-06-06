package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Date;

@Document // tells that below in mapped with mongoDB collection
@Getter // lombok annotations
@Setter // lombok annotations
public class JournalEntry {
    @Id // sets the primary key
    private ObjectId id;

    private String title;
    private String content;
    private LocalDateTime date;
}
