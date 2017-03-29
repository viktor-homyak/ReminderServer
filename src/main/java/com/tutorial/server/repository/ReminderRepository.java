package com.tutorial.server.repository;

import com.tutorial.server.entity.Remind;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by hvity on 29.03.2017.
 * They say that it is an modern analog of DAO. Nice, hah?
 */
public interface ReminderRepository extends JpaRepository<Remind,Long> {
}
