package com.recruitment.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Objects;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DBUtil {

  public static void closeConnection(PreparedStatement statement, Connection connection) {
    try {
      if (Objects.nonNull(statement)) {
        statement.close();
      }
    } catch (Exception ex) {
      log.error(ex.getMessage(), ex);
    }
    try {
      if (Objects.nonNull(connection)) {
        connection.close();
      }
    } catch (Exception ex) {
      log.error(ex.getMessage(), ex);
    }
  }
}