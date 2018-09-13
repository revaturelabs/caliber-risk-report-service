package com.revature.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.beans.Note;

/**
 * @author Mark Bedoya, David Martinez
 *
 */
public interface NoteRepository extends JpaRepository<Note, Integer>{

}
