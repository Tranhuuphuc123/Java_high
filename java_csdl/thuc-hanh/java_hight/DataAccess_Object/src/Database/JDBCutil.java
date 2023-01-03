package Database;
// xây dựng ưng dụng liên kết JDBC và ta vụ statement

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCutil {

    // method tiến hành kết nối SQL với pt JDBC
    public static Connection ketnoi() {
        Connection c = null;

        try{
            // đăng ký jdbc với Driver
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());

            //xác định thông số(đg link, url của sql vs jdbc
            String url=("jdbc:mysql://127.0.0.1:3306/nhasach?user=root&password=Huuphuc1995ct@");

            // tạo kết nối
            c= DriverManager.getConnection(url);

        }catch (SQLException e){
            // thực tri khối bắt được tạo tự động
            e.printStackTrace();
        }
        return c;
    }

    // xây Dựng method ngatketnoi
    public static void ngatketnoi(Connection c){
        try{
            // nghĩa là nó đôi tượng đó cò tồn tại
            if(c!=null){
                c.close();
            }
        }catch (SQLException e){
            // thực hiện khối bắt được tạo tự động
            e.printStackTrace();
        }
    }
}
