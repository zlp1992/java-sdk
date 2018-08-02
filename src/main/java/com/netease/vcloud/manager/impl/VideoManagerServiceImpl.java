package com.netease.vcloud.manager.impl;

import com.netease.vcloud.VcloudException;
import com.netease.vcloud.manager.VideoManagerService;
import com.netease.vcloud.manager.param.*;
import com.netease.vcloud.manager.util.ManagerUtil;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author zhoulipeng
 * @date 2018/7/26 15:46
 */
public class VideoManagerServiceImpl implements VideoManagerService {
    public DeleteSingleVideoParam deleteSingleVideo(String vid) throws VcloudException,
            IOException {
        ManagerUtil managerUtil=new ManagerUtil();
        return managerUtil.deleteSingleVideo(Long.valueOf(vid));
    }

    public QueryVideoInfoParam querySingelVideo(String vid) throws VcloudException, IOException {
        ManagerUtil managerUtil=new ManagerUtil();
        return managerUtil.querySingelVideo(Long.valueOf(vid));
    }

    public TranscodingVideoParam createTranscodingTemplate(String presetName, boolean hdMp4, boolean hdFlv) throws VcloudException,IOException{
        ManagerUtil managerUtil=new ManagerUtil();
        return managerUtil.createTranscodingTemplate(presetName,hdMp4,hdFlv);
    }

    public List<TranscodingTemplateParam> getAllTranscodingTemplate()throws IOException,VcloudException {
        ManagerUtil managerUtil=new ManagerUtil();
        int currentPage=1;
        int pageSize=10;
        List<TranscodingTemplateParam> templateParamList = new ArrayList<TranscodingTemplateParam>();
        while(true) {
            TranscodingTemplatePagingParam pagingParam = managerUtil.pagingGetTranscodingTemplate(currentPage, pageSize);
            if (pagingParam.getCode() != 200) {
                throw new VcloudException("查询错误：" + pagingParam.getMsg());
            }
            TranscodingTemplatePagingRetParam retParam = pagingParam.getRet();
            templateParamList.addAll(retParam.getList());
            if(templateParamList.size()<retParam.getTotalRecords()){
                currentPage++;
            }else{
                break;
            }
        }

        return templateParamList;
    }

    public String getPresetIdIfExist(String presetName) throws IOException,VcloudException{
        List<TranscodingTemplateParam> templateParams=getAllTranscodingTemplate();
        if(templateParams==null || templateParams.size()==0){
            return null;
        }
        for(TranscodingTemplateParam templateParam:templateParams){
            if(presetName.equals(templateParam.getPresetName())){
                return String.valueOf(templateParam.getPresetId());
            }
        }
        return null;
    }
}
