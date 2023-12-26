package com.jiro.entities;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class PagedResponseEntity<E> extends SuccessResponseEntity<E> {
    Map<String,Integer> pagination = new HashMap<>();
    E otherData;

    public void setPagination(Integer totalPage,Integer currentPage){
        pagination.put("total_page",totalPage);
        pagination.put("current_page",currentPage);
    }

}
