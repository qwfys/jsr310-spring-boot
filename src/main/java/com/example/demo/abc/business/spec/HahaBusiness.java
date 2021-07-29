package com.example.demo.abc.business.spec;

import com.example.demo.abc.domain.param.FindAllHahaParam;
import com.example.demo.abc.domain.vo.HahaVo;

import java.util.List;

public interface HahaBusiness {
    List<HahaVo> findAll(FindAllHahaParam param);
}
