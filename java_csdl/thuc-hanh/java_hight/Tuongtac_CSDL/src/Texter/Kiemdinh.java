package Texter;
// kiểm định ứng dụng


import Database_JDBC.tuongtacdulieu;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;

public class Kiemdinh {
    public static void main(String[] args) {
        try {
            // b1 xây dựng kết nối với JDBC SQL
            Connection kiemtra = tuongtacdulieu.ketnoi();
            System.out.println(kiemtra);


            /*b2_tạo đối tượng statement*/
            // lấy đối tượng statement ra
            Statement st = kiemtra.createStatement();


            /*b3 thực thi statement: một câu lệnh SQL*/
            // tiến hành thêm nội dung cho bảng sinh vien

            String sql= "insert into sinhvien(stt, name, gioitinh)"+
                    "VALUES (3,\"NguyenvanTo\", \"name\")";

             //-->tiến hành update lại câu lệnh thêm sql bên java vào statement
            int check = st.executeUpdate(sql);





            /*b4 thông báo: xử lý kết quả trả về*/
            System.out.println(" số dòng thay đổi: "+ check);
            // nếu check >0 thì đã có ít nhất 1 dong thay đổi
            if(check>0){
                System.out.println("thêm dữ liệu thành công");
            }else{
                System.out.println(" thêm dữ liệu thất bại");
            }

            // b5 tiến hành ngắt kết nối
            tuongtacdulieu.ngatketnoi(kiemtra);
        }catch (SQLException e){
            // thực thi khôi lệnh bắt được tạo tự động
            e.printStackTrace();
        }

    }
}
