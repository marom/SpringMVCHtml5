package spring.mvc.bean;

import java.util.List;

/**
 * Created by maro on 14/04/16.
 */
public class DBLogs {

    private List<DBLog> logList;

    public List<DBLog> getLogList() {
        return logList;
    }

    public void setLogList(List<DBLog> logList) {
        this.logList = logList;
    }
}
