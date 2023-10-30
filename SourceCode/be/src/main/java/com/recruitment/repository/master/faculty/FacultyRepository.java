package com.recruitment.repository.master.faculty;

import com.recruitment.dto.master.FacultyDTO;
import com.recruitment.entity.master.Faculty;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FacultyRepository extends CrudRepository<Faculty, Integer> {

  @Query("SELECT new com.recruitment.dto.master.FacultyDTO(facultyId, code, name) FROM Faculty")
  List<FacultyDTO> findAllFaculty();
}
