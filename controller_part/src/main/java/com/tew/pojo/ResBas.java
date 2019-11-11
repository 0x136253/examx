package com.tew.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table SYS.RES_BAS
 *
 * @mbg.generated do_not_delete_during_merge 2019-08-31 09:33:07
 */
public class ResBas implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS.RES_BAS.ID
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS.RES_BAS.NAME
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS.RES_BAS.SEX
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    private String sex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS.RES_BAS.URL
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    private String url;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS.RES_BAS.NATION
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    private String nation;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS.RES_BAS.NATIVE_PLACE
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    private String nativePlace;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS.RES_BAS.POLITICS_STATUS
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    private String politicsStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS.RES_BAS.BIRTH
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    private Date birth;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS.RES_BAS.TEL
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    private String tel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS.RES_BAS.EXP
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    private String exp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS.RES_BAS.MAIL
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    private String mail;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS.RES_BAS.EVALUATE
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    private String evaluate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table SYS.RES_BAS
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS.RES_BAS.ID
     *
     * @return the value of SYS.RES_BAS.ID
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS.RES_BAS.ID
     *
     * @param id the value for SYS.RES_BAS.ID
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS.RES_BAS.NAME
     *
     * @return the value of SYS.RES_BAS.NAME
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS.RES_BAS.NAME
     *
     * @param name the value for SYS.RES_BAS.NAME
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS.RES_BAS.SEX
     *
     * @return the value of SYS.RES_BAS.SEX
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS.RES_BAS.SEX
     *
     * @param sex the value for SYS.RES_BAS.SEX
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS.RES_BAS.URL
     *
     * @return the value of SYS.RES_BAS.URL
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS.RES_BAS.URL
     *
     * @param url the value for SYS.RES_BAS.URL
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS.RES_BAS.NATION
     *
     * @return the value of SYS.RES_BAS.NATION
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    public String getNation() {
        return nation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS.RES_BAS.NATION
     *
     * @param nation the value for SYS.RES_BAS.NATION
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    public void setNation(String nation) {
        this.nation = nation == null ? null : nation.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS.RES_BAS.NATIVE_PLACE
     *
     * @return the value of SYS.RES_BAS.NATIVE_PLACE
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    public String getNativePlace() {
        return nativePlace;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS.RES_BAS.NATIVE_PLACE
     *
     * @param nativePlace the value for SYS.RES_BAS.NATIVE_PLACE
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace == null ? null : nativePlace.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS.RES_BAS.POLITICS_STATUS
     *
     * @return the value of SYS.RES_BAS.POLITICS_STATUS
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    public String getPoliticsStatus() {
        return politicsStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS.RES_BAS.POLITICS_STATUS
     *
     * @param politicsStatus the value for SYS.RES_BAS.POLITICS_STATUS
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    public void setPoliticsStatus(String politicsStatus) {
        this.politicsStatus = politicsStatus == null ? null : politicsStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS.RES_BAS.BIRTH
     *
     * @return the value of SYS.RES_BAS.BIRTH
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    public Date getBirth() {
        return birth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS.RES_BAS.BIRTH
     *
     * @param birth the value for SYS.RES_BAS.BIRTH
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    public void setBirth(Date birth) {
        this.birth = birth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS.RES_BAS.TEL
     *
     * @return the value of SYS.RES_BAS.TEL
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    public String getTel() {
        return tel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS.RES_BAS.TEL
     *
     * @param tel the value for SYS.RES_BAS.TEL
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS.RES_BAS.EXP
     *
     * @return the value of SYS.RES_BAS.EXP
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    public String getExp() {
        return exp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS.RES_BAS.EXP
     *
     * @param exp the value for SYS.RES_BAS.EXP
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    public void setExp(String exp) {
        this.exp = exp == null ? null : exp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS.RES_BAS.MAIL
     *
     * @return the value of SYS.RES_BAS.MAIL
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    public String getMail() {
        return mail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS.RES_BAS.MAIL
     *
     * @param mail the value for SYS.RES_BAS.MAIL
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    public void setMail(String mail) {
        this.mail = mail == null ? null : mail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS.RES_BAS.EVALUATE
     *
     * @return the value of SYS.RES_BAS.EVALUATE
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    public String getEvaluate() {
        return evaluate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS.RES_BAS.EVALUATE
     *
     * @param evaluate the value for SYS.RES_BAS.EVALUATE
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    public void setEvaluate(String evaluate) {
        this.evaluate = evaluate == null ? null : evaluate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS.RES_BAS
     *
     * @mbg.generated 2019-08-31 09:33:07
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
        sb.append(", url=").append(url);
        sb.append(", nation=").append(nation);
        sb.append(", nativePlace=").append(nativePlace);
        sb.append(", politicsStatus=").append(politicsStatus);
        sb.append(", birth=").append(birth);
        sb.append(", tel=").append(tel);
        sb.append(", exp=").append(exp);
        sb.append(", mail=").append(mail);
        sb.append(", evaluate=").append(evaluate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}