package com.jiro.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class SuccessResponseEntity<T> extends BaseResponseEntity {
    private T data;

}
