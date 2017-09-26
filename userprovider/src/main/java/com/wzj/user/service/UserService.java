package com.wzj.user.service;

import com.wzj.base.data.service.impl.BaseServiceImpl;
import com.wzj.user.model.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserService extends BaseServiceImpl<User, Long> {
}
