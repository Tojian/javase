/*
 * Copyright (C) 2018 Tao Jian. All Rights Reserved.
 */
package com.javase.generic;

import java.io.Serializable;

/**
 * @description:
 * @author: taojian
 * @create: 2018-05-22 16:55
 **/
public class BaseResponse<T> implements Serializable {
    private static final long serialVersionUID = 4105682081252678513L;
    private HttpStatus status;
    private String message;
    private T data;

    public BaseResponse() {
    }

    public BaseResponse(HttpStatus status) {
        this();
        this.status = status;
    //    this.message = I18nContextHolder.getDefaultMessage(status);
    }

    public BaseResponse(HttpStatus status, T data) {
        this(status);
        this.data = data;
    }

    public BaseResponse(HttpStatus status, T data, String message) {
        this();
        this.status = status;
        this.data = data;
        this.message = message;
    }

    public HttpStatus getStatus() {
        return this.status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

   /* public <S extends BaseResponse<T>> S withStatus(HttpStatus status) {
        this.setStatus(status);
        return S;
    }

    public <S extends BaseResponse<T>> S withData(T data) {
        this.setData(data);
        return this;
    }

    public <S extends BaseResponse<T>> S withMessage(String message) {
        this.setMessage(message);
        return this;
    }*/
}
