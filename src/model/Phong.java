package model;

public class Phong {

    private String tenPhong;
    private int soChoNgoi;
    private String khu;
    private int tang;
    private int trangThai;

    public Phong() {
    }

    public Phong(String tenPhong, int soChoNgoi, String khu, int tang, int trangThai) {
        this.tenPhong = tenPhong;
        this.soChoNgoi = soChoNgoi;
        this.khu = khu;
        this.tang = tang;
        this.trangThai = trangThai;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public int getSoChoNgoi() {
        return soChoNgoi;
    }

    public void setSoChoNgoi(int soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }

    public String getKhu() {
        return khu;
    }

    public void setKhu(String khu) {
        this.khu = khu;
    }

    public int getTang() {
        return tang;
    }

    public void setTang(int tang) {
        this.tang = tang;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }
}
