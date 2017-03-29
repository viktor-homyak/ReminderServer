package com.tutorial.server.config.service;

import com.tutorial.server.entity.Remind;

import java.util.List;

/**
 * Created by hvity on 29.03.2017.
 */
public interface ReminderService {
    List<Remind> getAll();

    Remind getById(long reminderId);

    Remind save(Remind remind);

    void remove(long reminderId);
}
