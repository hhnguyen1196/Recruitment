package com.recruitment.repository.common;

import com.recruitment.config.exception.BusinessException;
import com.recruitment.util.DBUtils;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@Slf4j
@Getter
@RequiredArgsConstructor
public class CommonRepository {

    private final DataSource dataSource;

    private final MessageSource messageSource;

    public <T> List<T> findAll(T object, String query) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = dataSource.getConnection();
            statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();
            List<T> list = new ArrayList<>();
            while (resultSet.next()) {
                T data = DBUtils.passDataToObject(object, resultSet);
                list.add(data);
            }
            return list;
        } catch (Exception exception) {
            log.info(exception.getMessage());
            throw new BusinessException(getMessageSource());
        } finally {
            DBUtils.closeConnection(statement, connection);
        }
    }

    private String getMessageSource() {
        return messageSource
                .getMessage(HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase(), null, Locale.getDefault());
    }
    
}
