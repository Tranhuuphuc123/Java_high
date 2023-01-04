package Controller;
/* DAO: viết tắt DatabaseAcessObject giúp tạo những phương thức
* lấy các đối tượng sách, hay gọi chuyên nghiệp là đối tượng truy xuất dữ liệu
* giúp ta thêm insert đưcọ dữ liệu update được dữ liệu và delete xóa dữ liệu
* */


import java.sql.SQLException;
import java.util.ArrayList;

//<T> là một generic- tiềm hiểu bài  cấu trúc dữ liệu với generic
public interface DAO<T>{
    public int insert(T t) throws SQLException;

    public int update(T t);

    public int delete(T t);

    public ArrayList<T> selectAll();

    public T selectById(T t);

    // lấy theo điều kiện
    public ArrayList<T> selectByCondition(String condition);
}
