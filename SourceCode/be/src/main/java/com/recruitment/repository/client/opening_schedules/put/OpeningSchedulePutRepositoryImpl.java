package com.recruitment.repository.client.opening_schedules.put;

import com.recruitment.api.opening_schedule.put.apirequest.OpeningSchedulePutApiRequest;
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
public class OpeningSchedulePutRepositoryImpl implements OpeningSchedulePutRepository {

  private final DataSource dataSource;

  private static final String ADMIN = "ADMIN";

  @Override
  public void update(Long id, OpeningSchedulePutApiRequest request) {
    final String query = "UPDATE client.opening_schedule "
        + "SET course_name = ?, opening_day = ?, schedule = ?, time = ?, number_of_student = ?, "
        + "province_id = ?, updated_at = ?, updated_by = ? "
        + "WHERE opening_schedule_id = ?";
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
      statement.setLong(9, id);
      statement.execute();
    } catch (Exception ex) {
      log.error(ex.getMessage(), ex);
      throw new BusinessException(HttpStatus.BAD_REQUEST, "Failed to update to database");
    } finally {
      DBUtil.closeConnection(statement, connection);
    }
  }
}
