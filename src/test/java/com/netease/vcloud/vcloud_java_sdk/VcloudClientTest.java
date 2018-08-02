package com.netease.vcloud.vcloud_java_sdk;

import com.alibaba.fastjson.JSON;
import com.netease.vcloud.auth.BasicCredentials;
import com.netease.vcloud.auth.Credentials;
import com.netease.vcloud.client.VcloudClient;
import junit.framework.TestCase;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhoulipeng
 * @date 2018/7/26 15:36
 */
public class VcloudClientTest extends TestCase {
    public void testUpload() throws Exception{
        Credentials credentials=new BasicCredentials("856617a74bdaa9252d247a1957397465","a0ca04027922");
        VcloudClient vcloudClient=new VcloudClient(credentials);
        String filePath="C:\\Users\\zhoulipeng\\Desktop\\test\\中文.mp4";
        String fileName="中文.mp4";
        Long presetId=104277000L;
        Map<String,Object> initParamMap=new HashMap<String,Object>();
        initParamMap.put("originFileName",fileName);
        System.out.println(JSON.toJSONString(vcloudClient.uploadVideo(filePath,fileName,null,null,presetId,null,null,null,null,null)));
    }

    public void testDelete() throws Exception{
        String vid="1821030226";
        Credentials credentials=new BasicCredentials("856617a74bdaa9252d247a1957397465","a0ca04027922");
        VcloudClient vcloudClient=new VcloudClient(credentials);
        System.out.println(JSON.toJSONString(vcloudClient.deleteSingleVideo(vid)));
    }

    public void testQuery() throws Exception{
        String vid="1821007104";
        Credentials credentials=new BasicCredentials("856617a74bdaa9252d247a1957397465","a0ca04027922");
        VcloudClient vcloudClient=new VcloudClient(credentials);
        System.out.println(JSON.toJSONString(vcloudClient.querySingleVideo(vid)));
    }

    public void testTranscoding() throws Exception{
        Credentials credentials=new BasicCredentials("856617a74bdaa9252d247a1957397465","a0ca04027922");
        VcloudClient vcloudClient=new VcloudClient(credentials);
        System.out.println(JSON.toJSONString(vcloudClient.createTranscodingTemplate("测试模板",true,false)));
    }

    public void testGetAllTranscodingTemplate() throws Exception{
        Credentials credentials=new BasicCredentials("856617a74bdaa9252d247a1957397465","a0ca04027922");
        VcloudClient vcloudClient=new VcloudClient(credentials);
        System.out.println(JSON.toJSONString(vcloudClient.getAllTranscodingTemplate()));
    }

    public void testGetPresetIdIfExist() throws Exception{
        String presetName="测试模板";
        Credentials credentials=new BasicCredentials("856617a74bdaa9252d247a1957397465","a0ca04027922");
        VcloudClient vcloudClient=new VcloudClient(credentials);
        System.out.println(JSON.toJSONString(vcloudClient.getPresetIdIfExist(presetName)));
    }
}
