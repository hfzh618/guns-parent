package com.stylefeng.guns.api.user;

/**
 * Created by hufangzhou on 2019/11/25.
 */
public class UserInfoModel {


    private Integer uuid;
    private String username;
    private String nickname;
    private String email;
    private String phone;
    private int sex;
    private String birthday;
    private String lifeState;
    private String biography;
    private String address;
    private String headAddress;
    private long beginTime;
    private long updateTime;

    public Integer getUuid() {
        return uuid;
    }

    public UserInfoModel setUuid(Integer uuid) {
        this.uuid = uuid;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public UserInfoModel setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getNickname() {
        return nickname;
    }

    public UserInfoModel setNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserInfoModel setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public UserInfoModel setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public int getSex() {
        return sex;
    }

    public UserInfoModel setSex(int sex) {
        this.sex = sex;
        return this;
    }

    public String getBirthday() {
        return birthday;
    }

    public UserInfoModel setBirthday(String birthday) {
        this.birthday = birthday;
        return this;
    }

    public String getLifeState() {
        return lifeState;
    }

    public UserInfoModel setLifeState(String lifeState) {
        this.lifeState = lifeState;
        return this;
    }

    public String getBiography() {
        return biography;
    }

    public UserInfoModel setBiography(String biography) {
        this.biography = biography;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public UserInfoModel setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getHeadAddress() {
        return headAddress;
    }

    public UserInfoModel setHeadAddress(String headAddress) {
        this.headAddress = headAddress;
        return this;
    }

    public long getBeginTime() {
        return beginTime;
    }

    public UserInfoModel setBeginTime(long beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    public long getUpdateTime() {
        return updateTime;
    }

    public UserInfoModel setUpdateTime(long updateTime) {
        this.updateTime = updateTime;
        return this;
    }
}
