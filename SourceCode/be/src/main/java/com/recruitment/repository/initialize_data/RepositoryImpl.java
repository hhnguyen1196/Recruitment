package com.recruitment.repository.initialize_data;

import com.recruitment.model.*;
import com.recruitment.repository.common.CommonRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Slf4j
@Repository
public class RepositoryImpl extends CommonRepository implements InitializeDataRepository {

    public RepositoryImpl(DataSource dataSource, MessageSource messageSource) {
        super(dataSource, messageSource);
    }

    @Override
    public List<SchoolDTO> findAllSchool() {
        String findAllSchool = "SELECT school_id AS schoolId, name, code FROM master.school";
        return findAll(new SchoolDTO(), findAllSchool);
    }

    @Override
    public List<FacultyDTO> findAllFaculty() {
        String findAllFaculty = "SELECT faculty_id AS facultyId, name, code FROM master.faculty";
        return findAll(new FacultyDTO(), findAllFaculty);
    }

    @Override
    public List<LevelDTO> findAllLevel() {
        String findAllLevel = "SELECT level_id AS levelId, name, code FROM master.level";
        return findAll(new LevelDTO(), findAllLevel);
    }

    @Override
    public List<SkillDTO> findAllSkill() {
        String findAllSkill = "SELECT skill_id AS skillId, name, code FROM master.skill";
        return findAll(new SkillDTO(), findAllSkill);
    }

    @Override
    public List<ProvinceDTO> findAllProvince() {
        String findAllProvince = "SELECT province_id AS provinceId, name, code FROM master.province";
        return findAll(new ProvinceDTO(), findAllProvince);
    }

}
