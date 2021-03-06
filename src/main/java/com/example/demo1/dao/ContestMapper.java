package com.example.demo1.dao;

import com.example.demo1.entity.Contest;
import com.example.demo1.entity.Question;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface ContestMapper {
    void insertContest(Contest contest);
    void deleteContest(int guid);
}
