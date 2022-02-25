package com.folegini.mcjava.exceptions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StandardError {

    private Integer status;

    private String error;

    private Long timeStamp;

    public StandardError(Integer status, String error, Long timeStamp) {
        this.status = status;
        this.error = error;
        this.timeStamp = timeStamp;
    }
}
