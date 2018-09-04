package com.revature.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.beans.Trainee;

@RestController
public class TraineeController {
	private List<Trainee> trainees;

	@GetMapping(value = "/trainee/{id}")
	public Trainee getTrainee(@PathVariable UUID id) {
		Trainee rc = null;
		for (Trainee c : trainees) {
			if (id == c.getTraineeId()) {
				rc = c;
			}
		}
		return rc;
	}
	
	@PostMapping(value= "/trainee")
	public ResponseEntity<Trainee> postTrainee(@RequestBody Trainee tr) {
		return ResponseEntity.ok(tr);
	}
}
