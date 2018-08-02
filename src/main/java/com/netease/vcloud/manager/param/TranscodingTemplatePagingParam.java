package com.netease.vcloud.manager.param;

/**
 * 分页获取转码模板
 * @author zhoulipeng
 * @date 2018/7/27 15:50
 */
public class TranscodingTemplatePagingParam {
    /** 输出参数中的响应码*/
    private Integer code;

    /** 输出参数中的错误信息*/
    private String msg;

    /** 输出内容ret部分 */
    private TranscodingTemplatePagingRetParam ret;

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

    public TranscodingTemplatePagingRetParam getRet() {
        return ret;
    }

    public void setRet(TranscodingTemplatePagingRetParam ret) {
        this.ret = ret;
    }
}
