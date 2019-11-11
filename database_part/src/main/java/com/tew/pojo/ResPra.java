package com.tew.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table SYS.RES_PRA
 *
 * @mbg.generated do_not_delete_during_merge 2019-08-31 09:33:07
 */
public class ResPra implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS.RES_PRA.ID_JOB
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    private Short idJob;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS.RES_PRA.ID
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS.RES_PRA.START_TIME
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    private Date startTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS.RES_PRA.END_TIME
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    private Date endTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS.RES_PRA.ADDRESS
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    private String address;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS.RES_PRA.POSITION
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    private String position;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS.RES_PRA.DESCRIPTION
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table SYS.RES_PRA
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS.RES_PRA.ID_JOB
     *
     * @return the value of SYS.RES_PRA.ID_JOB
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    public Short getIdJob() {
        return idJob;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS.RES_PRA.ID_JOB
     *
     * @param idJob the value for SYS.RES_PRA.ID_JOB
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    public void setIdJob(Short idJob) {
        this.idJob = idJob;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS.RES_PRA.ID
     *
     * @return the value of SYS.RES_PRA.ID
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS.RES_PRA.ID
     *
     * @param id the value for SYS.RES_PRA.ID
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS.RES_PRA.START_TIME
     *
     * @return the value of SYS.RES_PRA.START_TIME
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS.RES_PRA.START_TIME
     *
     * @param startTime the value for SYS.RES_PRA.START_TIME
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS.RES_PRA.END_TIME
     *
     * @return the value of SYS.RES_PRA.END_TIME
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS.RES_PRA.END_TIME
     *
     * @param endTime the value for SYS.RES_PRA.END_TIME
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS.RES_PRA.ADDRESS
     *
     * @return the value of SYS.RES_PRA.ADDRESS
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS.RES_PRA.ADDRESS
     *
     * @param address the value for SYS.RES_PRA.ADDRESS
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS.RES_PRA.POSITION
     *
     * @return the value of SYS.RES_PRA.POSITION
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    public String getPosition() {
        return position;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS.RES_PRA.POSITION
     *
     * @param position the value for SYS.RES_PRA.POSITION
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS.RES_PRA.DESCRIPTION
     *
     * @return the value of SYS.RES_PRA.DESCRIPTION
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS.RES_PRA.DESCRIPTION
     *
     * @param description the value for SYS.RES_PRA.DESCRIPTION
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS.RES_PRA
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", idJob=").append(idJob);
        sb.append(", id=").append(id);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", address=").append(address);
        sb.append(", position=").append(position);
        sb.append(", description=").append(description);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}