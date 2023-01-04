package texter;
// vai trò texter kiểm định sản phẩm

import Controller.sachDAO;
import Model.sach;

import java.sql.SQLException;

public class Kiemdinh {
    public static void main(String[] args) throws SQLException {

       //cách thêm từng hàng cột của bảng sach

        /*
        sach sach1 = new sach("ms01","lập trình java",50000,2020);
        sach sach2 = new sach("ms02","lập trình c#",40000,1993);

        // tiến hánh update sach
        sachDAO.getInstance().insert(sach1);
        sachDAO.getInstance().insert(sach2);
        */





        // tiến hành thêm hàng ngàn dòng dữ liệu cho bảng sách thì ntn?- sử dụng vòng lặp
        for(int i=0; i<100; i++){
            sach sach1 = new sach("ms01","lập trình java",50000,2020);
            sachDAO.getInstance().insert(sach1);
        }


    }
}
