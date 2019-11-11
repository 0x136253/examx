package com.tew.service.Impl;

import com.tew.dto.WishDTO;
import com.tew.pojo.PersonExample;
import com.tew.pojo.Wish;
import com.tew.pojo.WishExample;
import com.tew.service.PersonDAO;
import com.tew.service.WishinService;
import com.tew.service.WwishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WwishServiceImpl implements WwishService {
    @Autowired
    private WishinService wishinService;
    @Autowired
    private PersonDAO personDAO;

    public WishExample Example_get(String IcNumber, Short themeid){
        PersonExample personExample = new PersonExample();
        personExample.createCriteria().andIcNumberEqualTo(IcNumber);
        String id= personDAO.selectByExample(personExample).get(0).getId();
        WishExample wishExample = new WishExample();
        wishExample.createCriteria().andThemeidEqualTo(themeid).andIdEqualTo(id);
        return wishExample;
    }
    @Override
    public int deleteWish(String IcNumber, Short themeid) {
        Wish wish=wishinService.selectByExample(Example_get(IcNumber,themeid)).get(0);
        wishinService.deleteByPrimaryKey(wish.getWishid());
        return 0;
    }

    @Override
    public int insertWish(WishDTO record) {
        return wishinService.insertSelective(record.wish_get());
    }

    @Override
    public Wish ShowWish(String IcNumber, Short themeid) {
        return wishinService.selectByExample(Example_get(IcNumber,themeid)).get(0);
    }

    @Override
    public int updateWish(WishDTO record) {
        return wishinService.updateByPrimaryKeySelective(record.wish_get());
    }
}
