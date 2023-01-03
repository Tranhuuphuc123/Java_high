package Model;
// model xây dụng code cho bang sach

public class sach {
    private String id;
    private String tenSach;
    private float giaBan;
    private int namXuatBan;

    // khởi tạo contructor
    public sach(String id, String tenSach, float giaBan, int namXuatBan) {
        this.id = id;
        this.tenSach = tenSach;
        this.giaBan = giaBan;
        this.namXuatBan = namXuatBan;
    }

    // contructor tạo đối tượng không có tt gì để tự thiết lập mới ở get and set
    public sach(){

    }

    // get and set

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public float getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(float giaBan) {
        this.giaBan = giaBan;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }
}
