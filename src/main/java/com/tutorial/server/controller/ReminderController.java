package com.tutorial.server.controller;

import com.tutorial.server.config.service.ReminderService;
import com.tutorial.server.entity.Remind;
import com.tutorial.server.repository.ReminderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by hvity on 20.03.2017.
 */
@RestController
public class ReminderController {

    @Autowired
    private ReminderService reminderService;


    @ResponseBody
    @RequestMapping(value ="/reminders", method = RequestMethod.GET)
    public  List<Remind> getAllReminders(){
        return  reminderService.getAll();
    }

    @ResponseBody
    @RequestMapping(value ="/reminders/{id}", method = RequestMethod.GET)
    public  Remind getReminder(@PathVariable("id") long reminderId){
        return  reminderService.getById(reminderId);
    }

    @ResponseBody
    @RequestMapping(value ="/reminders", method = RequestMethod.POST)
    public  Remind setReminder(@RequestBody Remind remind){
        return  reminderService.save(remind);
    }
    @ResponseBody
    @RequestMapping(value ="/reminders/{id}", method = RequestMethod.DELETE)
    public void removeReminder(@PathVariable("id") long reminderId){
        reminderService.remove(reminderId);
    }

}
