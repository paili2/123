package org.koreait.dandyPo.global.libs;

import org.springframework.stereotype.Component;

@Component
public class NewsUtils {

    public String template(String path){
            return "/front/"+path;
        }

}
