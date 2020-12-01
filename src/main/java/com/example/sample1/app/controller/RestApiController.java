package com.example.sample1.app.controller;

import com.example.sample1.app.resource.BirthStone;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/sample")
public class RestApiController {

    @RequestMapping(value = "/getBirthStone", method = RequestMethod.GET)
    @ResponseBody
    public BirthStone getBirthStone(){
        BirthStone birthStone = new BirthStone("2月", "アメジスト", "紫");
        return birthStone;
    }

}
