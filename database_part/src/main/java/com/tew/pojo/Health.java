package com.tew.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table SYS.HEA_INFO
 *
 * @mbg.generated do_not_delete_during_merge 2019-10-01 16:21:29
 */
public class Health implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS.HEA_INFO.ID
     *
     * @mbg.generated 2019-10-01 16:21:29
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS.HEA_INFO.NAME
     *
     * @mbg.generated 2019-10-01 16:21:29
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS.HEA_INFO.SEX
     *
     * @mbg.generated 2019-10-01 16:21:29
     */
    private String sex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS.HEA_INFO.NATION
     *
     * @mbg.generated 2019-10-01 16:21:29
     */
    private String nation;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS.HEA_INFO.NATIVE_PLACE
     *
     * @mbg.generated 2019-10-01 16:21:29
     */
    private String nativePlace;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS.HEA_INFO.POLITICS_STATUS
     *
     * @mbg.generated 2019-10-01 16:21:29
     */
    private String politicsStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS.HEA_INFO.BIRTH
     *
     * @mbg.generated 2019-10-01 16:21:29
     */
    private Date birth;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS.HEA_INFO.HEART
     *
     * @mbg.generated 2019-10-01 16:21:29
     */
    private String heart;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS.HEA_INFO.BLOOD_PRE
     *
     * @mbg.generated 2019-10-01 16:21:29
     */
    private String bloodPre;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS.HEA_INFO.LIVER_SPLEER
     *
     * @mbg.generated 2019-10-01 16:21:29
     */
    private String liverSpleer;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS.HEA_INFO.COLOR
     *
     * @mbg.generated 2019-10-01 16:21:29
     */
    private String color;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS.HEA_INFO.SMELL
     *
     * @mbg.generated 2019-10-01 16:21:29
     */
    private String smell;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS.HEA_INFO.HEARING
     *
     * @mbg.generated 2019-10-01 16:21:29
     */
    private String hearing;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS.HEA_INFO.TIME
     *
     * @mbg.generated 2019-10-01 16:21:29
     */
    private Date time;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table SYS.HEA_INFO
     *
     * @mbg.generated 2019-10-01 16:21:29
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS.HEA_INFO.ID
     *
     * @return the value of SYS.HEA_INFO.ID
     *
     * @mbg.generated 2019-10-01 16:21:29
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS.HEA_INFO.ID
     *
     * @param id the value for SYS.HEA_INFO.ID
     *
     * @mbg.generated 2019-10-01 16:21:29
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS.HEA_INFO.NAME
     *
     * @return the value of SYS.HEA_INFO.NAME
     *
     * @mbg.generated 2019-10-01 16:21:29
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS.HEA_INFO.NAME
     *
     * @param name the value for SYS.HEA_INFO.NAME
     *
     * @mbg.generated 2019-10-01 16:21:29
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS.HEA_INFO.SEX
     *
     * @return the value of SYS.HEA_INFO.SEX
     *
     * @mbg.generated 2019-10-01 16:21:29
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS.HEA_INFO.SEX
     *
     * @param sex the value for SYS.HEA_INFO.SEX
     *
     * @mbg.generated 2019-10-01 16:21:29
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS.HEA_INFO.NATION
     *
     * @return the value of SYS.HEA_INFO.NATION
     *
     * @mbg.generated 2019-10-01 16:21:29
     */
    public String getNation() {
        return nation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS.HEA_INFO.NATION
     *
     * @param nation the value for SYS.HEA_INFO.NATION
     *
     * @mbg.generated 2019-10-01 16:21:29
     */
    public void setNation(String nation) {
        this.nation = nation == null ? null : nation.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS.HEA_INFO.NATIVE_PLACE
     *
     * @return the value of SYS.HEA_INFO.NATIVE_PLACE
     *
     * @mbg.generated 2019-10-01 16:21:29
     */
    public String getNativePlace() {
        return nativePlace;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS.HEA_INFO.NATIVE_PLACE
     *
     * @param nativePlace the value for SYS.HEA_INFO.NATIVE_PLACE
     *
     * @mbg.generated 2019-10-01 16:21:29
     */
    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace == null ? null : nativePlace.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS.HEA_INFO.POLITICS_STATUS
     *
     * @return the value of SYS.HEA_INFO.POLITICS_STATUS
     *
     * @mbg.generated 2019-10-01 16:21:29
     */
    public String getPoliticsStatus() {
        return politicsStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS.HEA_INFO.POLITICS_STATUS
     *
     * @param politicsStatus the value for SYS.HEA_INFO.POLITICS_STATUS
     *
     * @mbg.generated 2019-10-01 16:21:29
     */
    public void setPoliticsStatus(String politicsStatus) {
        this.politicsStatus = politicsStatus == null ? null : politicsStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS.HEA_INFO.BIRTH
     *
     * @return the value of SYS.HEA_INFO.BIRTH
     *
     * @mbg.generated 2019-10-01 16:21:29
     */
    public Date getBirth() {
        return birth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS.HEA_INFO.BIRTH
     *
     * @param birth the value for SYS.HEA_INFO.BIRTH
     *
     * @mbg.generated 2019-10-01 16:21:29
     */
    public void setBirth(Date birth) {
        this.birth = birth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS.HEA_INFO.HEART
     *
     * @return the value of SYS.HEA_INFO.HEART
     *
     * @mbg.generated 2019-10-01 16:21:29
     */
    public String getHeart() {
        return heart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS.HEA_INFO.HEART
     *
     * @param heart the value for SYS.HEA_INFO.HEART
     *
     * @mbg.generated 2019-10-01 16:21:29
     */
    public void setHeart(String heart) {
        this.heart = heart == null ? null : heart.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS.HEA_INFO.BLOOD_PRE
     *
     * @return the value of SYS.HEA_INFO.BLOOD_PRE
     *
     * @mbg.generated 2019-10-01 16:21:29
     */
    public String getBloodPre() {
        return bloodPre;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS.HEA_INFO.BLOOD_PRE
     *
     * @param bloodPre the value for SYS.HEA_INFO.BLOOD_PRE
     *
     * @mbg.generated 2019-10-01 16:21:29
     */
    public void setBloodPre(String bloodPre) {
        this.bloodPre = bloodPre == null ? null : bloodPre.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS.HEA_INFO.LIVER_SPLEER
     *
     * @return the value of SYS.HEA_INFO.LIVER_SPLEER
     *
     * @mbg.generated 2019-10-01 16:21:29
     */
    public String getLiverSpleer() {
        return liverSpleer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS.HEA_INFO.LIVER_SPLEER
     *
     * @param liverSpleer the value for SYS.HEA_INFO.LIVER_SPLEER
     *
     * @mbg.generated 2019-10-01 16:21:29
     */
    public void setLiverSpleer(String liverSpleer) {
        this.liverSpleer = liverSpleer == null ? null : liverSpleer.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS.HEA_INFO.COLOR
     *
     * @return the value of SYS.HEA_INFO.COLOR
     *
     * @mbg.generated 2019-10-01 16:21:29
     */
    public String getColor() {
        return color;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS.HEA_INFO.COLOR
     *
     * @param color the value for SYS.HEA_INFO.COLOR
     *
     * @mbg.generated 2019-10-01 16:21:29
     */
    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS.HEA_INFO.SMELL
     *
     * @return the value of SYS.HEA_INFO.SMELL
     *
     * @mbg.generated 2019-10-01 16:21:29
     */
    public String getSmell() {
        return smell;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS.HEA_INFO.SMELL
     *
     * @param smell the value for SYS.HEA_INFO.SMELL
     *
     * @mbg.generated 2019-10-01 16:21:29
     */
    public void setSmell(String smell) {
        this.smell = smell == null ? null : smell.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS.HEA_INFO.HEARING
     *
     * @return the value of SYS.HEA_INFO.HEARING
     *
     * @mbg.generated 2019-10-01 16:21:29
     */
    public String getHearing() {
        return hearing;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS.HEA_INFO.HEARING
     *
     * @param hearing the value for SYS.HEA_INFO.HEARING
     *
     * @mbg.generated 2019-10-01 16:21:29
     */
    public void setHearing(String hearing) {
        this.hearing = hearing == null ? null : hearing.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS.HEA_INFO.TIME
     *
     * @return the value of SYS.HEA_INFO.TIME
     *
     * @mbg.generated 2019-10-01 16:21:29
     */
    public Date getTime() {
        return time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS.HEA_INFO.TIME
     *
     * @param time the value for SYS.HEA_INFO.TIME
     *
     * @mbg.generated 2019-10-01 16:21:29
     */
    public void setTime(Date time) {
        this.time = time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS.HEA_INFO
     *
     * @mbg.generated 2019-10-01 16:21:29
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", sex=").append(sex);
        sb.append(", nation=").append(nation);
        sb.append(", nativePlace=").append(nativePlace);
        sb.append(", politicsStatus=").append(politicsStatus);
        sb.append(", birth=").append(birth);
        sb.append(", heart=").append(heart);
        sb.append(", bloodPre=").append(bloodPre);
        sb.append(", liverSpleer=").append(liverSpleer);
        sb.append(", color=").append(color);
        sb.append(", smell=").append(smell);
        sb.append(", hearing=").append(hearing);
        sb.append(", time=").append(time);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}