package com.isliudong.springforvue2.dto;

import java.util.List;

/**
 * @program: springforvue2
 * @description:
 * @author: 闲乘月
 * @create: 2020-07-10 16:06
 **/
public class PageDTO<T> {
    List<T> data;
    Integer page;
    Integer total;
    Integer pageSize;



    public PageDTO(List<T> data, Integer page, Integer total, Integer pageSize) {
        this.data = data;
        this.page = page;
        this.total = total;
        this.pageSize=pageSize;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
}
