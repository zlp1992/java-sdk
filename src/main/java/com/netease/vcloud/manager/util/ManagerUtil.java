package com.netease.vcloud.manager.util;

import com.alibaba.fastjson.JSON;
import com.netease.vcloud.VcloudException;
import com.netease.vcloud.config.Config;
import com.netease.vcloud.manager.param.*;
import com.netease.vcloud.util.HttpClientBuilder;
import com.netease.vcloud.util.HttpPostBuilder;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zhoulipeng
 * @date 2018/7/26 15:54
 */
public class ManagerUtil {
    /** 日志实例*/
    public static final Logger logger = Logger.getLogger(ManagerUtil.class);

    public DeleteSingleVideoParam deleteSingleVideo(Long vid) throws IOException, VcloudException{
        String url= Config.getDeleteSingleVideoURL();
        Map<String,Object> param=new HashMap<String,Object>();
        param.put("vid",vid);
        StringEntity entity=new StringEntity(JSON.toJSONString(param),"utf-8");
        		/* 得到Json数据 */
        DeleteSingleVideoParam initUploadVideoParam = jsonParamObjectBuilder(url, entity, DeleteSingleVideoParam.class);

        return initUploadVideoParam;
    }

    public QueryVideoInfoParam querySingelVideo(Long vid) throws IOException,VcloudException{
        String url= Config.getGetSingleVideoURL();
        Map<String,Object> param=new HashMap<String,Object>();
        param.put("vid",vid);
        StringEntity entity=new StringEntity(JSON.toJSONString(param),"utf-8");
        		/* 得到Json数据 */
        QueryVideoInfoParam initUploadVideoParam = jsonParamObjectBuilder(url, entity, QueryVideoInfoParam.class);

        return initUploadVideoParam;
    }

    public TranscodingVideoParam createTranscodingTemplate(String presetName, boolean hdMp4, boolean hdFlv) throws IOException,VcloudException{
        String url= Config.getCreatePresetURL();
        Map<String,Object> param=new HashMap<String,Object>();
        param.put("presetName",presetName);
        //不需要流畅MP4格式
        param.put("sdMp4",0);
        //标清MP4格式
        if(hdMp4){
            param.put("hdMp4",1);
        }else{
            param.put("hdMp4",0);
        }
        //不需要高清MP4格式
        param.put("shdMp4",0);
        //不需要流畅flv格式
        param.put("sdFlv",0);
        //标清flv格式
        if(hdFlv){
            param.put("hdFlv",1);
        }else{
            param.put("hdFlv",0);
        }
        //不需要高清flv格式
        param.put("shdFlv",0);
        //不需要流畅、标清以及高清Hls格式
        param.put("sdHls",0);
        param.put("hdHls",0);
        param.put("shdHls",0);
        StringEntity entity=new StringEntity(JSON.toJSONString(param),"utf-8");
        		/* 得到Json数据 */
        TranscodingVideoParam transcodingVideoParam = jsonParamObjectBuilder(url, entity, TranscodingVideoParam.class);

        return transcodingVideoParam;
    }

    /**
     * 分页查询视频转码模板
     * @param currentPage 获取视频转码模板列表分页后的索引
     * @param pageSize 获取视频转码模板列表一页的记录数，取值范围：[1,500]
     * */
    public TranscodingTemplatePagingParam pagingGetTranscodingTemplate(int currentPage,int pageSize)throws IOException,VcloudException{
        String url= Config.getGetPresetListURL();
        Map<String,Object> param=new HashMap<String,Object>();
        param.put("currentPage",currentPage);
        param.put("pageSize",pageSize);

        StringEntity entity=new StringEntity(JSON.toJSONString(param),"utf-8");
        		/* 得到Json数据 */
        TranscodingTemplatePagingParam transcodingTemplatePagingParama = jsonParamObjectBuilder(url, entity, TranscodingTemplatePagingParam.class);

        return transcodingTemplatePagingParama;
    }

    /**
     * <p>Title: jsonParamObjectBuilder</p>
     * <p>Description: 执行HttpPost请求 得到 json数据对应的参数封装类工具</p>
     * @param url            接口地址
     * @param params         请求的参数
     * @param clazz          对应待返回的参数封装类的class
     * @return object        对应待返回的参数封装类
     * @throws IOException
     * @throws VcloudException
     */
    private <T> T jsonParamObjectBuilder(String url, StringEntity params, Class <T> clazz) throws IOException, VcloudException{

        HttpClient httpClient = HttpClientBuilder.getHttpClient();
        HttpPost httpPost = HttpPostBuilder.getHttpPost(url);

        // 设置请求的参数
        httpPost.setEntity(params);
        // 执行请求
        HttpResponse response = httpClient.execute(httpPost);
        String stringBody = EntityUtils.toString(response.getEntity(), "utf-8");

        // 得到Json数据
        T object = null;
        try {
            object =  JSON.parseObject(stringBody, clazz);
        } catch (Exception e) {
            logger.error("[UploadUtil] json parse exception : "	+ e + ",msg : " + e.getMessage());
            throw new VcloudException("[UploadUtil] json parse exception", e);
        }

        return object;
    }
}
