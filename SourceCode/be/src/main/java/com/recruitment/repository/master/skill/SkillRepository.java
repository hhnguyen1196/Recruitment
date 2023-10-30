package com.recruitment.repository.master.skill;

import com.recruitment.dto.master.SkillDTO;
import com.recruitment.entity.master.Skill;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillRepository extends CrudRepository<Skill, Integer> {

  @Query(value = "SELECT new com.recruitment.dto.master.SkillDTO(skillId, name, code) FROM Skill")
  List<SkillDTO> findAllSkill();
}
