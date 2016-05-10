package spring.mvc.bean;

/**
 * Created by maro on 10/05/16.
 */
public class DBLogJSON {

    private int IDLOG;
    private String LOGSTRING;

    public DBLogJSON() {
    }

    public DBLogJSON (int idLog, String logString) {
        this.IDLOG = idLog;
        this.LOGSTRING = logString;
    }

    public int getIDLOG() {
        return IDLOG;
    }

    public void setIDLOG(int iDLOG) {
        IDLOG = iDLOG;
    }

    public String getLOGSTRING() {
        return LOGSTRING;
    }

    public void setLOGSTRING(String lOGSTRING) {
        LOGSTRING = lOGSTRING;
    }
}
