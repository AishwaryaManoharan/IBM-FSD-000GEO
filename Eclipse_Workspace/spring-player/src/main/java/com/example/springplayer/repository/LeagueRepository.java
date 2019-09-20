package com.example.springplayer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.springplayer.model.League;

public interface LeagueRepository extends JpaRepository<League,Integer> {

}
