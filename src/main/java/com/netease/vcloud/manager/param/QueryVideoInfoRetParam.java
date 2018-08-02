package com.netease.vcloud.manager.param;

/**
 * @author zhoulipeng
 * @date 2018/7/26 18:02
 */
public class QueryVideoInfoRetParam {
    /** 视频名称 */
    private String videoName;
    /** 视频id */
    private String vid;
    /** 视频状态，10表示初始，20表示失败，30表示处理中，40表示成功，50表示屏蔽*/
    private int status;
    /** 视频封面截图URL地址 */
    private String snapshotUrl;
    /** 原始视频的播放地址 */
    private String origUrl;
    /** 原始视频的下载地址*/
    private String downloadOrigUrl;
    /** 原始视频文件大小（单位：字节）*/
    private Long initialSize;
    /** 标清mp4视频格式文件播放地址 */
    private String hdMp4Url;
    /** 高清mp4视频格式文件播放地址*/
    private String shdMp4Url;

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }

    public String getVid() {
        return vid;
    }

    public void setVid(String vid) {
        this.vid = vid;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getSnapshotUrl() {
        return snapshotUrl;
    }

    public void setSnapshotUrl(String snapshotUrl) {
        this.snapshotUrl = snapshotUrl;
    }

    public String getOrigUrl() {
        return origUrl;
    }

    public void setOrigUrl(String origUrl) {
        this.origUrl = origUrl;
    }

    public String getDownloadOrigUrl() {
        return downloadOrigUrl;
    }

    public void setDownloadOrigUrl(String downloadOrigUrl) {
        this.downloadOrigUrl = downloadOrigUrl;
    }

    public Long getInitialSize() {
        return initialSize;
    }

    public void setInitialSize(Long initialSize) {
        this.initialSize = initialSize;
    }

    public String getHdMp4Url() {
        return hdMp4Url;
    }

    public void setHdMp4Url(String hdMp4Url) {
        this.hdMp4Url = hdMp4Url;
    }

    public String getShdMp4Url() {
        return shdMp4Url;
    }

    public void setShdMp4Url(String shdMp4Url) {
        this.shdMp4Url = shdMp4Url;
    }
}
