package Database;
// xây dựng method kết nối đến java và SQl theo phương thư của JDBC

import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.DatabaseMetaData;

public class JDBCUtil {
    // trong method kết nối nên dùng static

    // xây dựng phương thức kết nối java với sql với method Conection sẵn có trong java

    public static Connection ketnoi() {
        Connection c = null;
        // câu lệnh kết nối

        try {
            // đầu tiên đăng ký driver JDBC mysql với phương thức DriverManager
            DriverManager.registerDriver( new com.mysql.jdbc.Driver());

            //xác định đg link và thông số của server-gồm(localhost, port,tên data liên kết, username, passwork)
            String url = "jdbc:mysql://127.0.0.1:3306/?user=root&password=Huuphuc1995ct@";

            // tạo kết nối
            c=DriverManager.getConnection(url);

        }catch (SQLException e){
            //để thực hiện khối bắt được tạo tự động
            e.printStackTrace();
        }

        return c;
    }

    // xậy dựng phương thức ngắt kết nối JDBC giữa java với sql
    public  static void ngatketnoi(Connection c){
        try{
            // nếu đối tượng vẫn còn tồn tại th ngắt kết nối đóng close lại ngay
            if(c!=null){
                c.close();
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

    }


    // xây dựng method thấy được thông tin đã kết nối hay ngă kết nối
    public static void  inthongso(Connection c){
        try{
            // khác null tức nếu nó tồn tại
            if(c!=null) {
                // gọi pt DatabaseMetaData ra
                DatabaseMetaData mt = c.getMetaData();
                // dùng DatabaseMetadat để lấy tên hệ quản trị cơ sở dữ liệu
                System.out.println(mt.getDatabaseProductName());
                // dùng DatabaseMetadata để lấy version
                System.out.println(mt.getDatabaseProductVersion());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
