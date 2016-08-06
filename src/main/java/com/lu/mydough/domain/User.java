package com.lu.mydough.domain;

/**
 * Created by Lu on 2016/7/28.
 */
public class User {

    public String userId;
    public String userName;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "id:" + userId +
                ", name:" + userName;
    }
}
