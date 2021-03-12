package com.rest.sarafan.controller;

import com.rest.sarafan.repository.InMemoryDB;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController // @Controller + @ResponseBody
@RequestMapping()
public class MessageController {

    @GetMapping("")
    public String startPage() {
        return "Hello World! This is Starting Page";
    }

    @GetMapping("/list")
    public List<Map<String, String>> showList() {
        return InMemoryDB.getMessages();
    }

    @GetMapping("{index}")
    public Map<String, String> showListItemByIndex(@PathVariable int index) {
        return InMemoryDB.showListItemByIndex(index);
    }

    @PostMapping // creating new item
    public void create(@RequestBody Map<String, String> message) {
        InMemoryDB.saveMessage(message);
    }

    @DeleteMapping("{index}") // delete item by index
    public void delete(@PathVariable int index) {
        InMemoryDB.deleteMessage(index);
    }

    @DeleteMapping()
    public void deleteAll() {
        InMemoryDB.deleteAllMessage();
    }

}
