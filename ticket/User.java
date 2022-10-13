package redbus.ticket;

import java.util.List;

public class User {
    private String name;
    private long cno;
    private String gender;
    private String address;
    private String kyc;

    public User(String name, long cno, String gender, String address, String kyc) {
        this.name = name;
        this.cno = cno;
        this.gender = gender;
        this.address = address;
        this.kyc = kyc;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCno() {
        return cno;
    }

    public void setCno(long cno) {
        this.cno = cno;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getKyc() {
        return kyc;
    }

    public void setKyc(String kyc) {
        this.kyc = kyc;
    }

    public void userDetails(){
        System.out.println("Name :"+name+"\nContact No :"+cno+"\nGender :"+gender+"\nKyc :"+kyc);
    }

}
