package com.friendship.dao;

import com.friendship.model.User;

public interface IUserDao {
    User selectUser(long id);
}