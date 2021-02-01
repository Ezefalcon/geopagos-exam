package com.geopagos.exam.service.exceptions;

public class ServiceException extends IllegalArgumentException {
    public ServiceException(String s) {
        super(s);
    }
}
