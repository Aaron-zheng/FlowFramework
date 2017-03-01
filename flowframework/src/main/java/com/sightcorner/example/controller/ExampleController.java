package com.sightcorner.example.controller;

import com.sightcorner.example.controller.vo.ResponseResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Aaron Zheng<br>
 * Created at 1/3/2017<br>
 * Purpose <br>
 * fucheng.zheng@gmail.com<br>
 * <p>
 * Hisotry
 * <p>
 * 1.0 1/3/2017
 */
@Controller
@RequestMapping(value = "/example")
public class ExampleController {

    @RequestMapping(value = "/helloWorld",
            method = RequestMethod.GET,
            produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public ResponseResult helloWorld() {
        return new ResponseResult();
    }
}
