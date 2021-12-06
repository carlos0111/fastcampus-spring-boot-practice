package com.fastcampus.springbootpractice.service;

import com.fastcampus.springbootpractice.logic.Sort;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SortService {
    private final Sort<String> sort;

    public SortService(@Qualifier("bubbleSort") Sort<String> sort) {
        this.sort = sort;
    }

    public List<String> doSort(List<String> list) {
        // Sort<String> sort = new JavaSort<>();
        return sort.sort(list);
    }
}
