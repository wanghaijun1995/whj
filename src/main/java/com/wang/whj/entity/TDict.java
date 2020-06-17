package com.wang.whj.entity;

import java.io.Serializable;

/**
 * (TDict)实体类
 *
 * @author makejava
 * @since 2020-06-17 15:23:54
 */
public class TDict implements Serializable {
    private static final long serialVersionUID = 828503458914900630L;
    /**
    * 字典ID
    */
    private Long dictId;
    /**
    * 字典类型
    */
    private String type;
    /**
    * 字典编码
    */
    private String code;
    /**
    * 字典值
    */
    private String value;


    public Long getDictId() {
        return dictId;
    }

    public void setDictId(Long dictId) {
        this.dictId = dictId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}