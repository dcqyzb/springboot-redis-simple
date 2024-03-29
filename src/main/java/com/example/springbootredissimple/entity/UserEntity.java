package com.example.springbootredissimple.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Mr.Deng
 * @date 2019/7/31 17:58
 * <p>Copyright: Copyright (c) 2018</p>
 * <p>Company: mitesofor </p>
 */
public class UserEntity implements Serializable {

    private static final long serialVersionUID = 1814480580879090509L;
    private Long id;
    private String guid;
    private String name;
    private String age;
    private Date createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
