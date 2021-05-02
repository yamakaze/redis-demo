package com.jean.river.redisdemo.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: JeanRiver
 * @Description:
 * @Date Created at 17:25 2021/5/2
 * @Modified By:
 */
@Data
public class UserEntity implements Serializable {

    private static final long serialVersionUID = 5237730257103305078L;

    private Long id;
    private String userName;
    private String userSex;
}
