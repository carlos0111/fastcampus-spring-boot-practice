package com.fastcampus.springbootpractice.logic;

import java.util.List;

public interface Sort<T extends Comparable<T>> {

    public List<T> sort(List<T> list);
}
