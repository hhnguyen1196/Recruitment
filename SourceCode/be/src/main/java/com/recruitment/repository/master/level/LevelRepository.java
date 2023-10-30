package com.recruitment.repository.master.level;

import com.recruitment.dto.master.LevelDTO;
import com.recruitment.entity.master.Level;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LevelRepository extends CrudRepository<Level, Integer> {

  @Query("SELECT new com.recruitment.dto.master.LevelDTO(levelId, name, code) FROM Level")
  List<LevelDTO> findAllLevel();
}
