package spring.mvc.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

/**
 * Created by maro on 14/04/16.
 */
@Repository
public class JDBCExample {

    private JdbcTemplate jdbcTemplate = null;

    @Autowired
    public JDBCExample(DataSource dataSource) {
        this.jdbcTemplate = (new JdbcTemplate(dataSource));
    }
}
