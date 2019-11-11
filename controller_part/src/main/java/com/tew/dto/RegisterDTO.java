package com.tew.dto;

import com.tew.pojo.Person;
import com.tew.pojo.User;

import java.util.Date;

public class RegisterDTO {
   // private String id;
    private String name;
    private String sex;
    private String nation;
    private String nativePlace;
    private String politicsStatus;
    private String icNumber;
    private String tel;
    private String eduBg;
    private String role;
    private String schoolName;
    private Date birth;
    private String mail;
  //  private Short schoolid;
    private String password;

    public Person person_get(){
        Person person = new Person();
     //   person.setId(id);
        person.setName(name);
        person.setSex(sex);
        person.setNation(nation);
        person.setNativePlace(nativePlace);
        person.setPoliticsStatus(politicsStatus);
        person.setIcNumber(icNumber);
        person.setTel(tel);
        person.setMail(mail);
        person.setEduBg(eduBg);
        person.setRole(role);
        person.setSchoolName(schoolName);
        person.setBirth(birth);
     //   person.setSchoolid(schoolid);
        return  person;
    }

    public User user_get(){
        User user = new User();
        user.setIcNumber(icNumber);
        user.setRole(role);
        user.setPassword(password);
    //    user.setId(id);
        user.setTel(tel);
        return user;
    }

    @Override
    public String toString() {
        return "RegisterDTO{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", nation='" + nation + '\'' +
                ", nativePlace='" + nativePlace + '\'' +
                ", politicsStatus='" + politicsStatus + '\'' +
                ", icNumber='" + icNumber + '\'' +
                ", tel='" + tel + '\'' +
                ", eduBg='" + eduBg + '\'' +
                ", role='" + role + '\'' +
                ", schoolName='" + schoolName + '\'' +
                ", birth=" + birth +
                ", mail='" + mail + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getNativePlace() {
        return nativePlace;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
    }

    public String getPoliticsStatus() {
        return politicsStatus;
    }

    public void setPoliticsStatus(String politicsStatus) {
        this.politicsStatus = politicsStatus;
    }

    public String getIcNumber() {
        return icNumber;
    }

    public void setIcNumber(String icNumber) {
        this.icNumber = icNumber;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEduBg() {
        return eduBg;
    }

    public void setEduBg(String eduBg) {
        this.eduBg = eduBg;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public RegisterDTO() {
    }

    public RegisterDTO(String name, String sex, String nation, String nativePlace, String politicsStatus, String icNumber, String tel, String eduBg, String role, String schoolName, Date birth, String mail, String password) {
        this.name = name;
        this.sex = sex;
        this.nation = nation;
        this.nativePlace = nativePlace;
        this.politicsStatus = politicsStatus;
        this.icNumber = icNumber;
        this.tel = tel;
        this.eduBg = eduBg;
        this.role = role;
        this.schoolName = schoolName;
        this.birth = birth;
        this.mail = mail;
        this.password = password;
    }
}
