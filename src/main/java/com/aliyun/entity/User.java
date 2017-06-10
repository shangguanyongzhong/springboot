package com.aliyun.entity;

import org.apache.ibatis.jdbc.SQL;

import java.util.Date;
import java.util.Map;

/**
 * Created by sg on 2017/3/15.
 */
public class User {
    private int sid;
    private String sname;
    private String gender;
    private Date birthday;
    private  String address;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String test(Map<String,Object> param){

        return new SQL(){{

            SELECT("name");
            FROM("student");
            if(param.get("name")!=null){
                WHERE("");
            }
            WHERE("");


        }}.toString();
    }



}
