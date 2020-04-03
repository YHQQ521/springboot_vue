package com.yhqq.server.mapper;

import com.yhqq.server.bean.User2;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface User2Mapper {
    List<User2> allUser();
}
