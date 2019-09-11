package com.example.springh2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springh2.model.Publisher;
@Repository
public interface PublisherRepository extends JpaRepository<Publisher, Long> {

}
