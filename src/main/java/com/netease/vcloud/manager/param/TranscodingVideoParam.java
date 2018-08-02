package com.netease.vcloud.manager.param;

/**
 * @author zhoulipeng
 * @date 2018/7/27 14:08
 */
public class TranscodingVideoParam {
    /** 输出参数中的响应码*/
    private Integer code;

    /** 输出参数中的错误信息*/
    private String msg;
    /** 输出参数中ret部分 */
    private TranscodingVideoRetParam ret;

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

    public TranscodingVideoRetParam getRet() {
        return ret;
    }

    public void setRet(TranscodingVideoRetParam ret) {
        this.ret = ret;
    }
}
