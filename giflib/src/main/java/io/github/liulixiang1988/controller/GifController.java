package io.github.liulixiang1988.controller;

import io.github.liulixiang1988.data.GifRepository;
import io.github.liulixiang1988.model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller //1. 标识控制器
public class GifController {

    @Autowired //依赖注入
    private GifRepository gifRepository;

    @RequestMapping("/") //2. 添加映射
    public String listGifs(ModelMap modelMap) {
        List<Gif> allGifs = gifRepository.getAllGifs();
        modelMap.put("gifs", allGifs);
        return "home"; //3. 返回模板名称
    }

    @RequestMapping("/gif/{name}")
    public String getDetails(@PathVariable String name, ModelMap modelMap) {
        Gif gif = gifRepository.findByName(name);
        modelMap.put("gif", gif);
        return "gif-details";
    }
}
