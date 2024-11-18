package com.victorpafaro.victorpafaro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.victorpafaro.victorpafaro.entities.Game;

public interface GameRepository extends JpaRepository<Game,Long>{

}
