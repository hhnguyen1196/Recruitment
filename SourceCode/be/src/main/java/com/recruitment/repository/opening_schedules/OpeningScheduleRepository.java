package com.recruitment.repository.opening_schedules;

import com.recruitment.api.opening_schedule.apiresponse.OpeningScheduleGetAllApiResponse;
import com.recruitment.entity.OpeningSchedule;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Repository for OpeningSchedule
 *
 * @author HaiNH
 */
public interface OpeningScheduleRepository {

    List<OpeningScheduleGetAllApiResponse> findAll();

    /**
     * Select OpeningScheduleEntity by id
     *
     * @param id Integer
     * @return Optional<OpeningScheduleEntity>
     */
    Optional<OpeningSchedule> findById(Integer id);

    /**
     * Insert OpeningScheduleEntity
     *
     * @param entity OpeningScheduleEntity
     * @return int
     */
    int insert(OpeningSchedule entity);

    /**
     * Update OpeningScheduleEntity
     *
     * @param entity OpeningScheduleEntity
     * @return int
     */
    int update(OpeningSchedule entity);

    /**
     * Delete OpeningScheduleEntity
     *
     * @param entity OpeningScheduleEntity
     * @return int
     */
    int delete(OpeningSchedule entity);

    /**
     * Insert list OpeningScheduleEntity
     *
     * @param entityList List<OpeningScheduleEntity>
     * @return int[]
     */
    int[] insert(List<OpeningSchedule> entityList);

    /**
     * Update list OpeningScheduleEntity
     *
     * @param entityList List<OpeningScheduleEntity>
     * @return int[]
     */
    int[] update(List<OpeningSchedule> entityList);

    /**
     * Delete list OpeningScheduleEntity
     *
     * @param entityList List<OpeningScheduleEntity>
     * @return int[]
     */
    int[] delete(List<OpeningSchedule> entityList);
}
