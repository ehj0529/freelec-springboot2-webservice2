package com.jojoldu.book.springboot.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor //선언된 모든 Final필드가 포함된 생성자를 생성해줍니다.
public class HelloResponseDto {
    private final String name;
    private final int amount;
}
