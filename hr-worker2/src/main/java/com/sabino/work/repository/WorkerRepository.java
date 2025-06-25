package com.sabino.work.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sabino.work.entity.Worker;

public interface WorkerRepository  extends JpaRepository<Worker, Long>{

}
