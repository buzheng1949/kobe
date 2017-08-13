package com.tuan.query;

/**
 * Created by buzheng on 17/8/13.
 * 基础查询类
 */
public class BaseQuery {
    /**
     * 通过ID查询
     */
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    private Integer page;

    private Integer pageSize;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
