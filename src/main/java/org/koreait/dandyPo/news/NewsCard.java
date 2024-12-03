package org.koreait.dandyPo.news;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class NewsCard {
    private String title;
    private String sub_title;
    private String imageUrl;
    private String pageUrl;

}
