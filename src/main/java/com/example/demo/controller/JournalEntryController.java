//package com.example.demo.controller;
//
//import com.example.demo.entity.JournalEntry;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import  java.util.List;
//import java.util.Map;
//@RestController
//@RequestMapping("/journal") // package of endpoints here starts from journal
//public class JournalEntryController {
//    // table for storing data as no db
//    private Map<Long,JournalEntry> journalEntries = new HashMap<>();
//
//    @GetMapping
//    public List<JournalEntry> getAll(){
//        return new ArrayList<>(journalEntries.values());
//    }
//
//    @PostMapping
//    public boolean createEntry(@RequestBody JournalEntry myEntry){
//        journalEntries.put(myEntry.getId(),myEntry);
//        return true;
//    }
//    @GetMapping("id/{myId}")
//    public Object getEntryById(@PathVariable Long myId){
//        return journalEntries.containsKey(myId)?journalEntries.get(myId):"NOT FOUND";
//    }
//
//    @DeleteMapping("id/{myId}")
//    public JournalEntry deleteJournalEntry(@PathVariable Long myId){
//        return journalEntries.remove(myId);
//    }
//
//    @PutMapping("id/{myId}")
//    public JournalEntry updateJournalEntry(@PathVariable Long myId, @RequestBody JournalEntry myEntry){
//        return journalEntries.put(myId,myEntry); // returns old value
//    }
//}
