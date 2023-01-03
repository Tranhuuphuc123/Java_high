package texter;
// vài trò texter kiểm định ứng dụng

import Database.JDBCUtil;

import java.sql.Connection;
import java.sql.SQLException;

public class Kiemdinh {
    public static void main(String[] args) {
            Connection kiemtra = JDBCUtil.ketnoi();
            System.out.println(kiemtra);

            // lấy thông tin chi tiết
            JDBCUtil.inthongso(kiemtra);

            // ngắt kết nối
           JDBCUtil.ngatketnoi(kiemtra);



        }
    }

