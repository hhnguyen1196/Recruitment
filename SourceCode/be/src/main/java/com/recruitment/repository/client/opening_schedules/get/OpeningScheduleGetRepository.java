package com.recruitment.repository.client.opening_schedules.get;

import com.recruitment.dto.client.OpeningScheduleDTO;
import com.recruitment.entity.client.OpeningSchedule;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Repository for OpeningSchedule
 *
 * @author HaiNH
 */
@Repository
public interface OpeningScheduleGetRepository extends CrudRepository<OpeningSchedule, Long> {

  @Query("SELECT new com.recruitment.dto.client.OpeningScheduleDTO(os.openingScheduleId, "
      + "os.courseName, os.openingDay, os.schedule, os.time, os.numberOfStudent, p.name) "
      + "FROM OpeningSchedule os JOIN Province p ON os.provinceId = p.provinceId ")
  List<OpeningScheduleDTO> findAllOpeningSchedule();

  @Query("SELECT new com.recruitment.dto.client.OpeningScheduleDTO(os.openingScheduleId, "
      + "os.courseName, os.openingDay, os.schedule, os.time, os.numberOfStudent, p.name) "
      + "FROM OpeningSchedule os JOIN Province p ON os.provinceId = p.provinceId "
      + "WHERE os.openingScheduleId = :openingScheduleId")
  Optional<OpeningScheduleDTO> findOpeningScheduleById(@Param("openingScheduleId") Long id);
}
