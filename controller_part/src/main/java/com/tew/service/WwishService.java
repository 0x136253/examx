package com.tew.service;

import com.tew.dto.WishDTO;
import com.tew.pojo.Wish;

public interface WwishService {
    int deleteWish(String IcNumber,Short themeid);
    int insertWish(WishDTO record);
    Wish ShowWish(String IcNumber,Short themeid);
    int updateWish(WishDTO record);
}
