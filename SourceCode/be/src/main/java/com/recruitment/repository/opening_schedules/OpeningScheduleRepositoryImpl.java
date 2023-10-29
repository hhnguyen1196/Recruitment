package com.recruitment.repository.opening_schedules;

import com.recruitment.api.opening_schedule.apiresponse.OpeningScheduleGetAllApiResponse;
import com.recruitment.entity.OpeningSchedule;
import com.recruitment.repository.common.CommonRepository;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;
import java.util.Optional;

@Repository
public class OpeningScheduleRepositoryImpl extends CommonRepository implements OpeningScheduleRepository  {

    public OpeningScheduleRepositoryImpl(DataSource dataSource, MessageSource messageSource) {
        super(dataSource, messageSource);
    }

    @Override
    public List<OpeningScheduleGetAllApiResponse> findAll() {
        String query = "SELECT opening_schedule_id AS openingScheduleId, course_name AS courseName, " +
                "opening_day AS openingDay, schedule, time, number_of_student AS numberOfStudent, provinceName ";
        return findAll(new OpeningScheduleGetAllApiResponse(), query);
    }

    @Override
    public Optional<OpeningSchedule> findById(Integer id) {
        return Optional.empty();
    }

    @Override
    public int insert(OpeningSchedule entity) {
        return 0;
    }

    @Override
    public int update(OpeningSchedule entity) {
        return 0;
    }

    @Override
    public int delete(OpeningSchedule entity) {
        return 0;
    }

    @Override
    public int[] insert(List<OpeningSchedule> entityList) {
        return new int[0];
    }

    @Override
    public int[] update(List<OpeningSchedule> entityList) {
        return new int[0];
    }

    @Override
    public int[] delete(List<OpeningSchedule> entityList) {
        return new int[0];
    }

}
