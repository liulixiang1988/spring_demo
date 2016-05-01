package io.github.liulixiang1988.controller;

import io.github.liulixiang1988.model.Gif;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;

@Controller //1. 标识控制器
public class GifController {
    @RequestMapping("/") //2. 添加映射
    public String listGifs() {
        return "home"; //3. 返回模板名称
    }

    @RequestMapping("/gif")
    public String getDetails(ModelMap modelMap) {
        Gif gif = new Gif("android-explosion", LocalDate.of(2016, 5, 1), "刘理想", true);
        modelMap.put("gif", gif);
        return "gif-details";
    }
}
