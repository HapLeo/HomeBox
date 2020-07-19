package com.hapleow.homeboxcodge.controller;

import com.hapleow.homeboxcodge.dto.CodgeDto;
import com.hapleow.homeboxcodge.service.ICodgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wuyulin
 * @date 2020/7/15
 */
@RestController
@RequestMapping("/codge")
public class CodgeController {

    @Autowired
    private ICodgeService codgeService;


    @RequestMapping("/execute")
    public Object execute(CodgeDto codgeDto) {
        return codgeService.execute(codgeDto);
    }
}
