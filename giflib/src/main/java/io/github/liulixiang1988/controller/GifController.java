package io.github.liulixiang1988.controller;

import io.github.liulixiang1988.data.GifRepository;
import io.github.liulixiang1988.model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;

@Controller //1. 标识控制器
public class GifController {

    @Autowired //依赖注入
    private GifRepository gifRepository;

    @RequestMapping("/") //2. 添加映射
    public String listGifs() {
        return "home"; //3. 返回模板名称
    }

    @RequestMapping("/gif")
    public String getDetails(ModelMap modelMap) {
        Gif gif = gifRepository.findByName("ben-and-mike");
        modelMap.put("gif", gif);
        return "gif-details";
    }
}
