package com.tew.dto;

public class UpdatepasswordDTO {
    private String IcNumber;
    private String oldpassword;
    private String newpassword;

    public UpdatepasswordDTO(String icNumber, String oldpassword, String newpassword) {
        IcNumber = icNumber;
        this.oldpassword = oldpassword;
        this.newpassword = newpassword;
    }

    public UpdatepasswordDTO() {
    }

    public String getIcNumber() {
        return IcNumber;
    }

    public void setIcNumber(String icNumber) {
        IcNumber = icNumber;
    }

    public String getOldpassword() {
        return oldpassword;
    }

    public void setOldpassword(String oldpassword) {
        this.oldpassword = oldpassword;
    }

    public String getNewpassword() {
        return newpassword;
    }

    public void setNewpassword(String newpassword) {
        this.newpassword = newpassword;
    }
}
