package com.example.demo.controller;

import com.example.demo.entity.JournalEntry;
import com.example.demo.service.JournalEntryService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.time.LocalDateTime;
import java.util.List;




// contollers(only creates endpoint) --> services (logic) --> repository
@RestController
@RequestMapping("/journal") // package of endpoints here starts from journal
public class JournalEntryControllerv2 {
   @Autowired
   private JournalEntryService journalEntryService;


    @GetMapping
    public List<JournalEntry> getAll(){
        return journalEntryService.getAll();
    }

    @PostMapping
    public ResponseEntity<JournalEntry> createEntry(@RequestBody JournalEntry myEntry){
        try{
            myEntry.setDate(LocalDateTime.now());
            journalEntryService.saveEntry(myEntry);
            return new ResponseEntity<>(myEntry, HttpStatus.CREATED);
        }
        catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
    @GetMapping("id/{myId}")
    public JournalEntry getEntryById(@PathVariable ObjectId myId){
        return journalEntryService.findById(myId).orElse(null);
    }

    @DeleteMapping("id/{myId}")
    public boolean deleteJournalEntry(@PathVariable ObjectId myId){
        journalEntryService.deleteById(myId);
        return true;
    }

    @PutMapping("id/{myId}")
    public JournalEntry updateJournalEntry(@PathVariable ObjectId myId, @RequestBody JournalEntry newEntry){
        JournalEntry old = journalEntryService.findById(myId).orElse(null);
        if(old!=null){
            old.setTitle(newEntry.getTitle()!=null && !newEntry.getTitle().equals("")?newEntry.getTitle():old.getTitle());
            old.setContent(newEntry.getContent()!=null && !newEntry.getContent().equals("")?newEntry.getContent():old.getContent());
        }
        journalEntryService.saveEntry(old);
        return old;
    }
}
