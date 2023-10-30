package com.recruitment.repository.client.opening_schedules;

import com.recruitment.entity.client.OpeningSchedule;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository for OpeningSchedule
 *
 * @author HaiNH
 */
@Repository
public interface OpeningScheduleRepository extends CrudRepository<OpeningSchedule, Long> {

}
