package org.koreait.dandyPo.pokemon.api.entities;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.Map;

@Data
@JsonIgnoreProperties(ignoreUnknown = true) // 알려지지 않은 오류가 있을 시 무시 - 필요한 부분만 가져와 사용 가능!
public class SpritesOther {
    @JsonAlias("official-artwork") // JSON 형태로 가져올 때 별칭 설정 가능
    private Map<String, String> officialArtwork;
}
