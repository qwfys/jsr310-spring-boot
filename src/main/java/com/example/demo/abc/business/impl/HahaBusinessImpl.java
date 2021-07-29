package com.example.demo.abc.business.impl;

import com.example.demo.abc.business.spec.HahaBusiness;
import com.example.demo.abc.domain.param.FindAllHahaParam;
import com.example.demo.abc.domain.vo.HahaVo;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class HahaBusinessImpl implements HahaBusiness {

    @Override
    public List<HahaVo> findAll(FindAllHahaParam param) {
        List<HahaVo> vos = new ArrayList<>();
        HahaVo vo = new HahaVo();
        vo.setId("1");
        vo.setUid("11");
        vo.setName("haha");
        vo.setCreateTime(LocalDateTime.now());
        vo.setUpdateTime(LocalDateTime.now());
        vo.setRemark("honghong");
        vos.add(vo);
        return vos;
    }
}
