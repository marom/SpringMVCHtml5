package spring.mvc.jdbc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.Map;

/**
 * Created by maro on 14/04/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:application-context.xml","classpath:mvc-config.xml"})
public class JDBCExampleTest {

    @Autowired
    private JDBCExample databaseJDBCService = null;

    @Autowired
    private JdbcTemplate jdbcTemplate = null;


    //TEST METHOD for Test Table inside HSQLDB
    @Test
    public void queryAllTestTableRecords() {
        List<Map<String, Object>> rows = jdbcTemplate.queryForList("SELECT * FROM TEST");
        for (Map<String, Object> row : rows) {
            System.out.println("TESTTABLE tectcolumn: " + row.get("TESTCOLUMN"));
        }
    }
}
