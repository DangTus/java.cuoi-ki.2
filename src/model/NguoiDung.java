package model;

public class NguoiDung {
    private String taiKhoan;
    private String matKhau;
    private String tenND;

    public NguoiDung() {
    }

    public NguoiDung(String taiKhoan, String matKhau, String tenND) {
        this.taiKhoan = taiKhoan;
        this.matKhau = matKhau;
        this.tenND = tenND;
    }

    public String getTaiKhoan() {
        return taiKhoan;
    }

    public void setTaiKhoan(String taiKhoan) {
        this.taiKhoan = taiKhoan;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getTenND() {
        return tenND;
    }

    public void setTenND(String tenND) {
        this.tenND = tenND;
    }
}
