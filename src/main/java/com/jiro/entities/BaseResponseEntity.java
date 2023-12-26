package com.jiro.entities;import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter

@NoArgsConstructor
public class BaseResponseEntity {

    private String message;
    private boolean status;
}
