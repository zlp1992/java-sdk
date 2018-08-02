package com.netease.vcloud.manager.param;

/**
 * 获取视频文件信息
 * @author zhoulipeng
 * @date 2018/7/26 17:30
 */
public class QueryVideoInfoParam {
    /** 输出参数中的响应码*/
    private Integer code;

    /** 输出参数中的错误信息*/
    private String msg;
    /** 输出参数中ret部分 */
    private QueryVideoInfoRetParam ret;

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

    public QueryVideoInfoRetParam getRet() {
        return ret;
    }

    public void setRet(QueryVideoInfoRetParam ret) {
        this.ret = ret;
    }
}
