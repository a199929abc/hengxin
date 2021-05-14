package com.fengxin.mapper;

import com.fengxin.pojo.Users;
import com.fengxin.pojo.vo.FriendRequestVO;
import com.fengxin.utils.MyMapper;

import java.util.List;


public interface UsersMapperCustom extends MyMapper<Users> {


    public List<FriendRequestVO> queryFriendRequestList(String acceptUserId);
}