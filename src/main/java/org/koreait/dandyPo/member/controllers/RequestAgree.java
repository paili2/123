package org.koreait.dandyPo.member.controllers;

import lombok.Data;

import java.util.List;

@Data
public class RequestAgree {
    // @AssertTrue
    private boolean requiredTerms1; // 필수 약관 동의 여부 / 필수는 반드시 모두 선택 - 갯수 체크만으로도 충분

    // @AssertTrue
    private boolean requiredTerms2;

    // @AssertTrue
    private boolean requiredTerms3;

    private List<String> optionalTerms; // 선택 약관 동의 여부 - 선택약관은 어떤 약관인지를 구분할 수 있어야 함
}
