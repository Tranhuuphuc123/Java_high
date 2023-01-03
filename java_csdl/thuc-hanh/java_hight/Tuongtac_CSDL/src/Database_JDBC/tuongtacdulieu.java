package Database_JDBC;
// xây dựng ứng dụng tương tác với cơ sở dữ liệu thông qua phung thức kết nối JDBC


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import com.mysql.jdbc.Driver;
import java.sql.DatabaseMetaData;

public class tuongtacdulieu {
    /*b1 tạo kết nối JDBC với sql*/
      //method kết nối
    public static Connection ketnoi(){
        Connection c = null;

        try{
            //đăng kí JDBC mySQL
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            //xác định link và thống số server
            String url = "jdbc:mysql://127.0.0.1:3306/quanlysinhvien?user=root&password=Huuphuc1995ct@";
            //tạo kết nối
            c=DriverManager.getConnection(url);

        }catch (SQLException e){
            //thực thi khối bắt được tạo tự động
            e.printStackTrace();
        }
        return  c;

    }


    // xây dựng method ngắt kết nối
    public static void ngatketnoi(Connection c){
        try {
            // !=null nghĩa là đối tượng còn tồn tại
            if(c!=null){
                c.close();
            }

        }catch (SQLException e){
            // thư thi khối bắt được tạo tự động
            e.printStackTrace();
        }
    }



}
