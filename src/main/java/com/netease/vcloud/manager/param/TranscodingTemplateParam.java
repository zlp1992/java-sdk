package com.netease.vcloud.manager.param;

/**
 * 转码模板
 * @author zhoulipeng
 * @date 2018/7/27 15:53
 */
public class TranscodingTemplateParam {
    /** 流畅Hls格式（1表示包含，0表示不包含） */
    private int sdHls;
    /** 是否允许被删除（默认模板不允许删除），1：允许，0：不允许 */
    private int isDel;
    /** 高清Hls格式（1表示包含，0表示不包含） */
    private int shdHls;
    /** 标清Hls格式（1表示包含，0表示不包含） */
    private int hdHls;
    /** 视频转码模板Id */
    private int presetId;
    /** 流畅Mp4格式（1表示包含，0表示不包含）*/
    private int sdMp4;
    /** 流畅Flv格式（1表示包含，0表示不包含） */
    private int sdFlv;
    /** 高清Mp4格式（1表示包含，0表示不包含） */
    private int shdMp4;
    /** 高清Flv格式（1表示包含，0表示不包含）*/
    private int shdFlv;
    /** 视频转码模板的名称 */
    private String presetName;
    /** 标清Flv格式（1表示包含，0表示不包含）*/
    private int hdFlv;
    /** 标清Mp4格式（1表示包含，0表示不包含）*/
    private int hdMp4;

    public int getSdHls() {
        return sdHls;
    }

    public void setSdHls(int sdHls) {
        this.sdHls = sdHls;
    }

    public int getIsDel() {
        return isDel;
    }

    public void setIsDel(int isDel) {
        this.isDel = isDel;
    }

    public int getShdHls() {
        return shdHls;
    }

    public void setShdHls(int shdHls) {
        this.shdHls = shdHls;
    }

    public int getHdHls() {
        return hdHls;
    }

    public void setHdHls(int hdHls) {
        this.hdHls = hdHls;
    }

    public int getPresetId() {
        return presetId;
    }

    public void setPresetId(int presetId) {
        this.presetId = presetId;
    }

    public int getSdMp4() {
        return sdMp4;
    }

    public void setSdMp4(int sdMp4) {
        this.sdMp4 = sdMp4;
    }

    public int getSdFlv() {
        return sdFlv;
    }

    public void setSdFlv(int sdFlv) {
        this.sdFlv = sdFlv;
    }

    public int getShdMp4() {
        return shdMp4;
    }

    public void setShdMp4(int shdMp4) {
        this.shdMp4 = shdMp4;
    }

    public int getShdFlv() {
        return shdFlv;
    }

    public void setShdFlv(int shdFlv) {
        this.shdFlv = shdFlv;
    }

    public String getPresetName() {
        return presetName;
    }

    public void setPresetName(String presetName) {
        this.presetName = presetName;
    }

    public int getHdFlv() {
        return hdFlv;
    }

    public void setHdFlv(int hdFlv) {
        this.hdFlv = hdFlv;
    }

    public int getHdMp4() {
        return hdMp4;
    }

    public void setHdMp4(int hdMp4) {
        this.hdMp4 = hdMp4;
    }
}
