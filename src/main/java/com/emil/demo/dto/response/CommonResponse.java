package com.emil.demo.dto.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CommonResponse<T> {
    private String status;
    private String message;
    private T data;
}
