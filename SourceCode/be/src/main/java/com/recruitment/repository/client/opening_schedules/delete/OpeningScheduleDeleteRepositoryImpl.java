package com.recruitment.repository.client.opening_schedules.delete;

import com.recruitment.config.exception.BusinessException;
import com.recruitment.util.DBUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.sql.DataSource;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

@Slf4j
@Repository
@RequiredArgsConstructor
public class OpeningScheduleDeleteRepositoryImpl implements OpeningScheduleDeleteRepository {

  private final DataSource dataSource;

  final String query = "DELETE FROM client.opening_schedule "
      + "WHERE opening_schedule_id = ?";

  @Override
  public void delete(Long id) {
    Connection connection = null;
    PreparedStatement statement = null;
    try {
      connection = dataSource.getConnection();
      statement = connection.prepareStatement(query);
      statement.setLong(1, id);
      statement.execute();
    } catch (Exception ex) {
      log.error(ex.getMessage(), ex);
      throw new BusinessException(HttpStatus.BAD_REQUEST, "Failed to delete to database");
    } finally {
      DBUtil.closeConnection(statement, connection);
    }
  }
}