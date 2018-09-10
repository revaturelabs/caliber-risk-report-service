package com.revature.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.beans.Note;

public interface NoteRepository extends JpaRepository<Note, Integer>{

}
