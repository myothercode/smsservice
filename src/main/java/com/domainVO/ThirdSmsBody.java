package com.domainVO;

/**
 * Created with IntelliJ IDEA.
 * User: wula
 * Date: 13-10-10
 * Time: 下午10:57
 * To change this template use File | Settings | File Templates.
 */
public class ThirdSmsBody {
    private String phoneNo;
    private String msg;
    private String serviceId;
    private String reserve;
    private Long userId;
    private String sernum;
    private String passWord;

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getReserve() {
        return reserve;
    }

    public void setReserve(String reserve) {
        this.reserve = reserve;
    }

    public String getSernum() {
        return sernum;
    }

    public void setSernum(String sernum) {
        this.sernum = sernum;
    }
}
