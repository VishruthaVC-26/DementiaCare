package com.example.expo2019.alzheimerapp.AppPeople;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface PeopleDao {

    @Query("select * from people")
    List<People> getAll();

    @Query("SELECT * FROM people WHERe name IN (:name)")
    List<People> getByName(String name);

    @Insert
    void insert(People people);


}
