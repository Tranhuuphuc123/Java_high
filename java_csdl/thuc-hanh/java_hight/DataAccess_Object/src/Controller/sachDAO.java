package Controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Database.JDBCutil;
import Model.sach;
public class sachDAO implements DAO<sach> {

    public static sachDAO getInstance(){
        return  new sachDAO();
    }

    @Override
    public int insert(sach t) throws SQLException {
        try{
            // bước 1 tạo kết nối csdl
            Connection kt = JDBCutil.ketnoi();

            // bước 2 tạo ra đối tượng statement
            Statement st = kt.createStatement();

            //b3 thực thi câu lệnh sql
            String sql = "insert into sach(ID,tensach,giaban,namxuatban)"+
                    "values('"+t.getId()+"','"+t.getTenSach()+"','"+t.getGiaBan()+"','"+t.getNamXuatBan()+"')";

            //update câu lệnh sql vào statement
            int check = st.executeUpdate(sql);

            //b4 thông báo xử lý kết quả
            System.out.println(" bạn đã thực thi " + sql);
            System.out.println(" có " + check +" dòng bị thay đổi ");

            // close kết nối jdbc
            JDBCutil.ngatketnoi(kt);

        }catch (SQLException e){
            // thực thi khối lệnh bắt được tạo tự động
            e.printStackTrace();
        }


        return 0;
    }



    @Override
    public int update(sach t) {
        return 0;
    }

    @Override
    public int delete(sach t) {
        return 0;
    }

    @Override
    public ArrayList<sach> selectAll() {
        return null;
    }

    @Override
    public sach selectById(sach t) {
        return null;
    }

    @Override
    public ArrayList<sach> selectByCondition(String condition) {
        return null;
    }
}
