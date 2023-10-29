package com.recruitment.util;

import com.recruitment.config.exception.BusinessException;
import com.recruitment.model.*;
import com.recruitment.repository.initialize_data.InitializeDataRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Locale;
import java.util.Objects;

@Slf4j
@Component
@RequiredArgsConstructor
public class ConstantData implements CommandLineRunner {

    private static List<FacultyDTO> facultyList;

    private static List<LevelDTO> levelList;

    private static List<SkillDTO> skillList;

    private static List<ProvinceDTO> provinceList;

    private static List<SchoolDTO> schoolList;

    private final InitializeDataRepository repository;

    private final MessageSource messageSource;

    @Override
    public void run(String... args) {
        facultyList = repository.findAllFaculty();
        levelList = repository.findAllLevel();
        skillList = repository.findAllSkill();
        provinceList = repository.findAllProvince();
        schoolList = repository.findAllSchool();
        if (Objects.isNull(facultyList) || Objects.isNull(levelList) || Objects.isNull(skillList)
        || Objects.isNull(provinceList) || Objects.isNull(schoolList)) {
            log.error(getMessage());
            throw new BusinessException(getMessage());
        }
    }

    public static List<FacultyDTO> getAllFaculty() {
        return facultyList;
    }

    public static List<LevelDTO> getAllLevel() {
        return levelList;
    }

    public static List<SkillDTO> getAllSkill() {
        return skillList;
    }

    public static List<ProvinceDTO> getAllProvince() {
        return provinceList;
    }

    public static List<SchoolDTO> getAllSchool() {
        return schoolList;
    }

    private String getMessage() {
        return messageSource
                .getMessage(HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase(), null, Locale.getDefault());
    }

}
