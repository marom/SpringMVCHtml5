package spring.mvc.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import spring.mvc.bean.DBLog;
import spring.mvc.bean.DBLogs;
import spring.mvc.service.DBLogService;

import java.util.List;

/**
 * Created by maro on 10/05/16.
 */
@Controller
public class RestController {

    @Autowired
    private DBLogService dbLogService;

    @RequestMapping(value = "/getAllDBLogsXML", method = RequestMethod.GET, produces="application/xml")
    public @ResponseBody DBLogs getAllDBLogsXML() {

        List<DBLog> dbLogList = null;
        try {
            dbLogList = dbLogService.queryAllDBLogs();
        } catch (Exception e) {
            e.printStackTrace();
        }

        DBLogs dbLogs = new DBLogs();
        dbLogs.setLogList(dbLogList);
        return dbLogs;
    }
//
//    @RequestMapping(value = "/getAllDBLogsJSON", method = RequestMethod.GET)
//    public @ResponseBody DBLogsJSON getAllDBLogsJSON() {
//
//        List<DBLogJSON> dbLogsJSONList = null;
//        try {
//            dbLogsJSONList = dbLogService.queryAllDBLogsJSON();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        System.out.println(dbLogsJSONList);
//        DBLogsJSON dbLogsJSON = new DBLogsJSON();
//        dbLogsJSON.setLogList(dbLogsJSONList);
//        return dbLogsJSON;
//    }
}
