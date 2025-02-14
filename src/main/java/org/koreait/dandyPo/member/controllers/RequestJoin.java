package org.koreait.dandyPo.member.controllers;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.koreait.dandyPo.member.constants.Gender;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
public class RequestJoin extends RequestAgree {

    @Email
    @NotBlank
    private String email; // 이메일

    @NotBlank
    private String name; // 회원명

    @NotBlank
    @Size(min = 8) // 비밀번호 8자리 이상
    private String password; // 비밀번호

    @NotBlank
    private String confirmPassword; // 비밀번호 확인

    @NotBlank
    private String nickName; // 닉네임

    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthDt; // 생년월일

    @NotNull
    private Gender gender; // 성별 - enum 상수 정의

    @NotBlank
    private String zipCode; // 우편번호

    @NotBlank
    private String address; // 주소
    private String addressSub; // 나머지 주소
}