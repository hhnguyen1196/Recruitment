package com.recruitment.repository.master.school;

import com.recruitment.dto.master.SchoolDTO;
import com.recruitment.entity.master.School;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolRepository extends CrudRepository<School, Integer> {

  @Query("SELECT new com.recruitment.dto.master.SchoolDTO(schoolId, code, name) FROM School")
  List<SchoolDTO> findAllSchool();
}
