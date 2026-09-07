package com.example.expo2019.alzheimerapp.HealthReminders;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface ReminderDao {

    @Query("select * from reminders")
    List<RemindersModel> getAll();

    @Insert
    void insert(RemindersModel remindersModel);

    @Delete
    public  void deletereminder(RemindersModel reminders);

    @Update
    public  void updateReminder(RemindersModel reminders);



}