package com.netease.vcloud.manager.param;

import java.util.List;

/**
 * @author zhoulipeng
 * @date 2018/7/27 15:52
 */
public class TranscodingTemplatePagingRetParam {
    /** 当前页*/
    private int currentPage;
    /** 一页的记录数目 */
    private int pageSize;
    /** 总页数 */
    private int pageNum;
    /** 获取视频转码模板列表的数目 */
    private int totalRecords;
    private List<TranscodingTemplateParam> list;


    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(int totalRecords) {
        this.totalRecords = totalRecords;
    }

    public List<TranscodingTemplateParam> getList() {
        return list;
    }

    public void setList(List<TranscodingTemplateParam> list) {
        this.list = list;
    }
}
