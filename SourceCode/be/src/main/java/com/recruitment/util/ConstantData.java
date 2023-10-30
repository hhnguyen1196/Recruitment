package com.recruitment.util;

import com.recruitment.config.exception.BusinessException;
import com.recruitment.dto.master.FacultyDTO;
import com.recruitment.dto.master.LevelDTO;
import com.recruitment.dto.master.ProvinceDTO;
import com.recruitment.dto.master.SchoolDTO;
import com.recruitment.dto.master.SkillDTO;
import com.recruitment.repository.master.faculty.FacultyRepository;
import com.recruitment.repository.master.level.LevelRepository;
import com.recruitment.repository.master.province.ProvinceRepository;
import com.recruitment.repository.master.school.SchoolRepository;
import com.recruitment.repository.master.skill.SkillRepository;
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

  private final MessageSource messageSource;

  private final LevelRepository levelRepository;

  private final SkillRepository skillRepository;

  private final FacultyRepository facultyRepository;

  private final SchoolRepository schoolRepository;

  private final ProvinceRepository provinceRepository;

  @Override
  public void run(String... args) {
    levelList = levelRepository.findAllLevel();
    skillList = skillRepository.findAllSkill();
    facultyList = facultyRepository.findAllFaculty();
    schoolList = schoolRepository.findAllSchool();
    provinceList = provinceRepository.findAllProvince();
    if (Objects.isNull(facultyList) || Objects.isNull(levelList) || Objects.isNull(skillList)
        || Objects.isNull(provinceList) || Objects.isNull(schoolList)) {
      log.error(getMessage());
      throw new BusinessException(getMessage());
    }
  }

  public static List<LevelDTO> getAllLevel() {
    return levelList;
  }

  public static List<SkillDTO> getAllSkill() {
    return skillList;
  }

  public static List<FacultyDTO> getAllFaculty() {
    return facultyList;
  }

  public static List<SchoolDTO> getAllSchool() {
    return schoolList;
  }

  public static List<ProvinceDTO> getAllProvince() {
    return provinceList;
  }

  private String getMessage() {
    return messageSource
        .getMessage(HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase(), null, Locale.getDefault());
  }
}
