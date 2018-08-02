package com.netease.vcloud.manager;

import com.netease.vcloud.VcloudException;
import com.netease.vcloud.manager.param.DeleteSingleVideoParam;
import com.netease.vcloud.manager.param.QueryVideoInfoParam;
import com.netease.vcloud.manager.param.TranscodingTemplateParam;
import com.netease.vcloud.manager.param.TranscodingVideoParam;

import java.io.IOException;
import java.util.List;

/**
 * 视频管理服务接口
 * @author zhoulipeng
 * @date 2018/7/26 15:25
 */
public interface VideoManagerService {
    /**
     * 删除单个视频源
     * @param vid 视频唯一标识
     * */
    DeleteSingleVideoParam deleteSingleVideo(String vid)throws VcloudException,
            IOException;

    /**
     * 获取视频信息
     * */
    QueryVideoInfoParam querySingelVideo(String vid) throws VcloudException,IOException;

    /**
     * 创建视频转码模板
     * */
    TranscodingVideoParam createTranscodingTemplate(String presetName, boolean hdMp4, boolean hdFlv)throws VcloudException,IOException;

    /**
     * 获取所有视频转码模板
     * */
    List<TranscodingTemplateParam> getAllTranscodingTemplate() throws IOException,VcloudException;
    /**
     * 如果对应名称的视频转码模板存在的话则返回此模板的id
     * @param presetName 转码模板名称
     * @return 如果存在则返回模板id,否则返回<code>null</code>
     * */
    String getPresetIdIfExist(String presetName) throws IOException,VcloudException;
}
