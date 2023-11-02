package com.recruitment.repository.client.opening_schedules.post;

import com.recruitment.api.opening_schedule.post.apirequest.OpeningSchedulePostApiRequest;
import com.recruitment.config.exception.BusinessException;
import com.recruitment.util.DBUtil;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.sql.DataSource;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

@Slf4j
@Repository
@RequiredArgsConstructor
public class OpeningSchedulePostRepositoryImpl implements OpeningSchedulePostRepository {

  private final DataSource dataSource;

  private static final String ADMIN = "ADMIN";

  @Override
  public void insert(OpeningSchedulePostApiRequest request) {
    final String query = "INSERT INTO client.opening_schedule"
        + "(course_name, opening_day, schedule, time, number_of_student, province_id, created_at, "
        + "created_by, updated_at, updated_by) "
        + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    Connection connection = null;
    PreparedStatement statement = null;
    try {
      connection = dataSource.getConnection();
      statement = connection.prepareStatement(query);
      statement.setString(1, request.getCourseName());
      Date date =
          Objects.nonNull(request.getOpeningDay()) ? Date.valueOf(request.getOpeningDay()) : null;
      statement.setDate(2, date);
      statement.setString(3, request.getSchedule());
      statement.setInt(4, request.getTime());
      statement.setInt(5, request.getNumberOfStudent());
      statement.setInt(6, request.getProvinceId());
      statement.setTimestamp(7, Timestamp.valueOf(LocalDateTime.now()));
      statement.setString(8, ADMIN);
      statement.setTimestamp(9, Timestamp.valueOf(LocalDateTime.now()));
      statement.setString(10, ADMIN);
      statement.execute();
    } catch (Exception ex) {
      log.error(ex.getMessage(), ex);
      throw new BusinessException(HttpStatus.BAD_REQUEST, "Failed to connect to database");
    } finally {
      DBUtil.closeConnection(statement, connection);
    }
  }
}
