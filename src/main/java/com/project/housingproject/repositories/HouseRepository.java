package com.project.housingproject.repositories;

import com.project.housingproject.entities.HouseEntity;
import com.project.housingproject.viewInfo.HouseBriefView;
import com.project.housingproject.viewInfo.HouseDetailView;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface HouseRepository extends JpaRepository<HouseEntity,Long> {
    HouseEntity findByHid(int hId);
    Page<HouseEntity> findByEid(int Eid, Pageable pageable);
    Page<HouseEntity> findByAid(int Aid,Pageable pageable);
    Page<HouseEntity> findByHpriceBetween(int minimum,int maximum,Pageable pageable);
    Page<HouseEntity> findByHnameContains(String name,Pageable pageable);
    Page<HouseEntity> findByHaddressContains(String address,Pageable pageable);
    Page<HouseEntity> findByHsquareBetween(int minimum,int maximum,Pageable pageable);
    Page<HouseEntity> findByHverifystatus(byte hVerifyStatus, Pageable pageable);
    @Query(value = "select new com.project.housingproject.viewInfo.HouseBriefView(h.hid,h.hname,h.haddress,h.hsquare,h.hprice,h.hbreifinfo,h.himage,a.aid,a.aname,a.aavatar) from AgentEntity a inner join HouseEntity h on h.aid=a.aid where h.hvalidstatus=1 and h.hverifystatus=1")
    Page<HouseBriefView> homepageFind(Pageable pageable);
    @Query(value = "select new com.project.housingproject.viewInfo.HouseBriefView(h.hid,h.hname,h.haddress,h.hsquare,h.hprice,h.hbreifinfo,h.himage,a.aid,a.aname,a.aavatar) from AgentEntity a inner join HouseEntity h on h.aid=a.aid where h.hvalidstatus=1 and h.hverifystatus=1")
    Page<HouseBriefView> housepageFind(Pageable pageable);
    @Query(value = "select new com.project.housingproject.viewInfo.HouseDetailView(h.hid,h.hname,h.haddress,h.hsquare,h.hprice,h.hbreifinfo,h.himage,h.hinfo,a.aid,a.aname,a.aavatar,e.eid,e.ename,e.eavgprice,e.eimage,e.ebriefinfo) from AgentEntity a inner join HouseEntity h on h.aid=a.aid inner join EstateEntity e on h.eid=e.eid where h.hid=?1")
    HouseDetailView houseDetailFind(int hId);
    Page<HouseEntity> findByHnameContainsAndHaddressContainsAndHpriceBetweenAndHsquareBetweenAndHvalidstatusAndHverifystatus(String name, String address, Number priceMin, Number priceMax, Number squareMin, Number squareMax, Byte valid,Byte verify,Pageable pageable);
}
