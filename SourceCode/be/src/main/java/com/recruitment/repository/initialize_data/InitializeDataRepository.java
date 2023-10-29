package com.recruitment.repository.initialize_data;

import com.recruitment.model.*;

import java.util.List;

public interface InitializeDataRepository {

    List<FacultyDTO> findAllFaculty();

    List<LevelDTO> findAllLevel();

    List<SkillDTO> findAllSkill();

    List<SchoolDTO> findAllSchool();

    List<ProvinceDTO> findAllProvince();

}
