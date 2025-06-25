package com.sabino.work.Resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sabino.work.entity.Worker;
import com.sabino.work.repository.WorkerRepository;
@RestController
@RequestMapping(value = "/workers")
public class WorkerResource {
	
	@Autowired
	private WorkerRepository workerRepo;
	
	@GetMapping
	public ResponseEntity<List<Worker>> findAll() {
		List<Worker> list = workerRepo.findAll();
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Optional<Worker>> findById(@PathVariable Long id) {
		Optional<Worker> obj = workerRepo.findById(id);
		return ResponseEntity.ok(obj);
	}
	

}
