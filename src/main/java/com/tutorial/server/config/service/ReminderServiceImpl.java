package com.tutorial.server.config.service;

import com.tutorial.server.entity.Remind;
import com.tutorial.server.repository.ReminderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by hvity on 29.03.2017.
 */

@Service
public class ReminderServiceImpl implements ReminderService {

   @Autowired
   private ReminderRepository repository;

    @Override
    public List<Remind> getAll() {
        return repository.findAll();
    }

    @Override
    public Remind getById(long reminderId) {
        return repository.findOne(reminderId);
    }

    @Override
    public Remind save(Remind remind) {
        return repository.saveAndFlush(remind);
    }

    @Override
    public void remove(long reminderId) {
           repository.delete(reminderId);
    }
}
