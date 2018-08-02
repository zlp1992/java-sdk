package com.netease.vcloud.manager.param;

/**
 * @author zhoulipeng
 * @date 2018/7/26 15:55
 */
public class DeleteSingleVideoParam {
    /** 输出参数中的响应码*/
    private Integer code;

    /** 输出参数中的错误信息*/
    private String msg;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
