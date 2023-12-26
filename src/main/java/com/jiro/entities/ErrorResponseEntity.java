package com.jiro.entities;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Map;


@Getter
@Setter
@NoArgsConstructor
public class ErrorResponseEntity<T> extends BaseResponseEntity {

    Map<String,String> errors;
}
