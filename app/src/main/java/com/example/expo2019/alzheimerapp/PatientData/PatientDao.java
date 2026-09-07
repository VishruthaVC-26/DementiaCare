package com.example.expo2019.alzheimerapp.PatientData;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface PatientDao {

    @Query("select * from patient")
    List<Patient> getAll();

    @Insert
    void insert(Patient patient);

    @Update
    void update(Patient patient);


}