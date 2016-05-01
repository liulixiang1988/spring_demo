package io.github.liulixiang1988.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //1. 标识控制器
public class GifController {
    @RequestMapping("/") //2. 添加映射
    public String listGifs() {
        return "home"; //3. 返回模板名称
    }
}
