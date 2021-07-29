package com.example.demo.abc.controller;

import com.example.demo.abc.business.spec.HahaBusiness;
import com.example.demo.abc.domain.param.FindAllHahaParam;
import com.example.demo.abc.domain.vo.HahaVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Api(tags = "Haha管理")
@RestController
@Slf4j
public class HahaController {

    @Autowired
    HahaBusiness hahaBusiness;

    @ApiOperation(value = "查询Haha记录")
    @PostMapping(value = "/abc/hahas/list")
    public List<HahaVo> findAll(FindAllHahaParam param) {
        List<HahaVo> hahaVoList = new ArrayList<>();

        return hahaVoList;
    }
}
