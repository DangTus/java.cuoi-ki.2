package model;

public class ThoiKhoaBieu {

    private int maTKB;
    private int thu;
    private int tuTiet;
    private int denTiet;
    private String lopHP;
    private String phong;

    public ThoiKhoaBieu() {
    }

    public ThoiKhoaBieu(int maTKB, int thu, int tuTiet, int denTiet, String lopHP, String phong) {
        this.maTKB = maTKB;
        this.thu = thu;
        this.tuTiet = tuTiet;
        this.denTiet = denTiet;
        this.lopHP = lopHP;
        this.phong = phong;
    }

    public int getMaTKB() {
        return maTKB;
    }

    public void setMaTKB(int maTKB) {
        this.maTKB = maTKB;
    }

    public int getThu() {
        return thu;
    }

    public void setThu(int thu) {
        this.thu = thu;
    }

    public int getTuTiet() {
        return tuTiet;
    }

    public void setTuTiet(int tuTiet) {
        this.tuTiet = tuTiet;
    }

    public int getDenTiet() {
        return denTiet;
    }

    public void setDenTiet(int denTiet) {
        this.denTiet = denTiet;
    }

    public String getLopHP() {
        return lopHP;
    }

    public void setLopHP(String lopHP) {
        this.lopHP = lopHP;
    }

    public String getPhong() {
        return phong;
    }

    public void setPhong(String phong) {
        this.phong = phong;
    }
}
