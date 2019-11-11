package com.tew.service.Impl;


import com.tew.dto.SchoolWishDTO;
import com.tew.dto.ThemeClazzJobDTO;
import com.tew.pojo.*;
import com.tew.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class InfoShowServiceImpl implements InfoShowService {
    @Autowired
    private PersonDAO personDAO;

    @Autowired
    private GetPostInService getPostInService;

    @Autowired
    private SchoolDirService schoolDirService;
    @Autowired
    private WishinService wishinService;

    @Override
    public List<Person> showByID(String IcNumber) {
        PersonExample personExample = new PersonExample();
        personExample.createCriteria().andIcNumberEqualTo(IcNumber);
        return personDAO.selectByExample(personExample);
    }

    @Override
    public List<Theme> showTheme() {
        return getPostInService.ShowAllTheme();
    }

    @Override
    public List<SchoolJob> showSchoolJob(Short themeid, Short schoolid) {
        return getPostInService.ShowSchoolByID(themeid,schoolid);
    }

    @Override
    public List<Job> showJob(Short themeid) {
        return getPostInService.ShowJobByThemeID(themeid);
    }

    @Override
    public List<SchoolJob> showJobList(String clazz, String post) {
        return getPostInService.showJobList(clazz,post);
    }

    @Override
    public ThemeClazzJobDTO showJobClazz(Short themeid) {
        Set<String> clazzlist=new HashSet<>();
        Set<String> joblist=new HashSet<>();
        Theme theme=getPostInService.showThemeByID(themeid);
        String schoolList=theme.getSchoolinid();
        String[] schoolidlist=schoolList.split(",");
        for(String item:schoolidlist){
            System.out.println("<><><><><><"+item);
            Short schoolid=Short.parseShort(item);
            School school=schoolDirService.selectByPrimaryKey(schoolid);
            clazzlist.add(school.getClazz()+"");
        }
        List<Job> jobLists=this.showJob(themeid);
        for (Job item:jobLists){
            joblist.add(item.getClazz()+":"+item.getPost());
        }
        return new ThemeClazzJobDTO(new ArrayList<>(clazzlist),new ArrayList<>(joblist));
    }

    @Override
    public List<SchoolWishDTO> showWishNet(Short themeid) {
        List<SchoolWishDTO> schoolWishDTOList=new ArrayList<>();
        WishExample wishExample=new WishExample();
        wishExample.createCriteria().andThemeidEqualTo(themeid);
        List<Wish> wishList=wishinService.selectByExample(wishExample);
        for(Wish item:wishList){
            PersonExample personExample=new PersonExample();
            personExample.createCriteria().andIdEqualTo(item.getId());
            Person person=personDAO.selectByExample(personExample).get(0);
            schoolWishDTOList.add(new SchoolWishDTO(person,item));
        }
        return schoolWishDTOList;
    }

    @Override
    public List<SchoolWishDTO> showWishNet(Short themeid, Short schoolid) {
        List<SchoolWishDTO> schoolWishDTOList=new ArrayList<>();
        WishExample wishExample=new WishExample();
        wishExample.createCriteria().andThemeidEqualTo(themeid).andSchoolidEqualTo(schoolid);
        List<Wish> wishList=wishinService.selectByExample(wishExample);
        for(Wish item:wishList){
            PersonExample personExample=new PersonExample();
            personExample.createCriteria().andIdEqualTo(item.getId());
            Person person=personDAO.selectByExample(personExample).get(0);
            schoolWishDTOList.add(new SchoolWishDTO(person,item));
        }
        return schoolWishDTOList;
    }
}
