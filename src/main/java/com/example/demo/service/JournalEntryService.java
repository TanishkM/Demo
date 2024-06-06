package com.example.demo.service;

// written here are the main logic functions/methods for the endpoints

import com.example.demo.entity.JournalEntry;
import com.example.demo.repository.JournalEntryRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JournalEntryService {
    @Autowired
    private JournalEntryRepository journalEntryrepository;


    public void saveEntry(JournalEntry entry){
        journalEntryrepository.save(entry);

    }

    public List<JournalEntry> getAll(){
        return journalEntryrepository.findAll();
    }
    public Optional<JournalEntry> findById(ObjectId id){
        return journalEntryrepository.findById(id);
    }

    public void deleteById(ObjectId id){
        journalEntryrepository.deleteById(id);
    }
}
