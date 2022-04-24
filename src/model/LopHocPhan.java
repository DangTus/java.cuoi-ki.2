package model;

public class LopHocPhan {

    private String maLHP;
    private int soLuongSV;
    private int hocKi;

    public LopHocPhan() {
    }

    public LopHocPhan(String maLHP, int soLuongSV, int hocKi) {
        this.maLHP = maLHP;
        this.soLuongSV = soLuongSV;
        this.hocKi = hocKi;
    }

    public String getMaLHP() {
        return maLHP;
    }

    public void setMaLHP(String maLHP) {
        this.maLHP = maLHP;
    }

    public int getSoLuongSV() {
        return soLuongSV;
    }

    public void setSoLuongSV(int soLuongSV) {
        this.soLuongSV = soLuongSV;
    }

    public int getHocKi() {
        return hocKi;
    }

    public void setHocKi(int hocKi) {
        this.hocKi = hocKi;
    }
}
