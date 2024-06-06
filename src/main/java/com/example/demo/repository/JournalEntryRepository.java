package com.example.demo.repository;
import com.example.demo.entity.JournalEntry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

// mongo repository for journal entry with id in string format
public interface JournalEntryRepository extends MongoRepository<JournalEntry, ObjectId>{
    // functions are provided by the super class here
}
