package io.github.liulixiang1988.data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import io.github.liulixiang1988.model.Gif;
import org.springframework.stereotype.Component;

@Component //声明组件,用于依赖注入
public class GifRepository {
    private static final List<Gif> ALL_GIFS = Arrays.asList(
            new Gif("android-explosion", 1, LocalDate.of(2016, 5, 1), "刘理想", true),
            new Gif("ben-and-mike", 2, LocalDate.of(2016, 4, 10), "刘理想", true),
            new Gif("book-dominos", 3, LocalDate.of(2016, 4, 1), "刘理想", true),
            new Gif("compiler-bot", 3, LocalDate.of(2016, 4, 12), "刘理想", true),
            new Gif("cowboy-coder", 1, LocalDate.of(2016, 4, 13), "刘理想", false),
            new Gif("infinite-andrew", 2, LocalDate.of(2016, 4, 15), "刘理想", true)
    );

    public Gif findByName(String name) {
        for (Gif gif : ALL_GIFS) {
            if (gif.getName().equals(name)) {
                return gif;
            }
        }
        return null;
    }

    public List<Gif> getAllGifs() {
        return ALL_GIFS;
    }

    public List<Gif> findByCategoryId(int id) {
        List<Gif> gifs = new ArrayList<Gif>();
        for (Gif gif : ALL_GIFS) {
            if (gif.getCategoryId() == id) {
                gifs.add(gif);
            }
        }
        return gifs;
    }
}
