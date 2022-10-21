
import vip.epss.utils.DButil;
import java.sql.*;

public class Operator {
    public static void main(String[] args) {

    }
}
class Operatoradmin{
    private Connection conn = null;
    private Statement stat = null;
    private ResultSet rs = null;
    private PreparedStatement ps=null;

    public  Operatoradmin() throws SQLException{
        conn = DButil.getConn();
        stat = conn.createStatement();
    }
    public void closeRes(){
        DButil.close(null,stat,conn);
    }
}
