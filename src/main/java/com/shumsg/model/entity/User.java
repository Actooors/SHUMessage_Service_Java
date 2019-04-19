package com.shumsg.model.entity;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Data
public class User {
    private String id;

    private String registerWay;

    private String nickname;

    private Integer editableNicknameTimes;

    private String studentCardId;

    private String normalLoginId;

    private String password;

    private String passwordSalt;

    private String actualName;

    private String department;

    private String phone;

    private String mail;

    private LocalDate birthday;

    private String gender;

    private String about;

    private String location;

    private String birthplace;

    private String school;

    private String job;

    private String identity;

    private Boolean invalid;

    private String avatar;

    private String background;

    private Integer consequentLoginDays;

    private LocalDateTime lastLoginTime;

    private Short pushInterval;

    private LocalDateTime lastPushTime;

    private Integer socialGroupNum;

    private Integer followingNum;

    private Integer followerNum;

    private Integer myGroupsNum;

    private LocalDateTime createTime;

    private LocalDateTime deleteTime;

}