package com.recruitment.util;

import lombok.extern.slf4j.Slf4j;
import lombok.RequiredArgsConstructor;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Slf4j
@RequiredArgsConstructor
public class DBUtils {

    public static void closeConnection(PreparedStatement statement, Connection connection) {
        try {
            if (Objects.nonNull(statement)) {
                statement.close();
            }
        } catch (SQLException e) {
            log.error(e.getMessage(), e);
        }
        try {
            if (Objects.nonNull(connection)) {
                connection.close();
            }
        } catch (SQLException e) {
            log.error(e.getMessage(), e);
        }
    }

    public static <T> T passDataToObject(T object, ResultSet resultSet) {
        Field[] fields = object.getClass().getDeclaredFields();
        try {
            ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
            List<String> columnNames = new ArrayList<>();
            for (int i = 1; i <= resultSetMetaData.getColumnCount(); i++) {
                columnNames.add(resultSetMetaData.getColumnName(i));
            }
            for (Field field: fields) {
                field.setAccessible(true);
                if (columnNames.contains(field.getName().toLowerCase())) {
                    if (field.getType().equals(Long.class)) {
                        field.set(object, resultSet.getLong(field.getName()));
                    } else if (field.getType().equals(Integer.class)) {
                        field.set(object, resultSet.getInt(field.getName()));
                    } else if (field.getType().equals(String.class)) {
                        field.set(object, Objects.nonNull(resultSet.getString(field.getName()))
                                ? resultSet.getString(field.getName()) : null);
                    } else if (field.getType().equals(Double.class)) {
                        field.set(object, resultSet.getDouble(field.getName()));
                    } else if (field.getType().equals(Boolean.class)) {
                        field.set(object, resultSet.getBoolean(field.getName()));
                    } else if (field.getType().equals(BigDecimal.class)) {
                        field.set(object, resultSet.getBigDecimal(field.getName()));
                    } else if (field.getType().equals(LocalDate.class)) {
                        field.set(object, resultSet.getDate(field.getName()).toLocalDate());
                    } else if (field.getType().equals(LocalDateTime.class)) {
                        field.set(object, resultSet.getTimestamp(field.getName()).toLocalDateTime());
                    }
                }
            }
        } catch (Exception e) {
            log.error("Error when getting data column from db");
            throw new RuntimeException(e);
        }
        return object;
    }
}
