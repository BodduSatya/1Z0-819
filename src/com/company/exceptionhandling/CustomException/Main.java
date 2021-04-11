package com.company.exceptionhandling.CustomException;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws CannotSwimException {
//        throw new CannotSwimException();
//        throw new CannotSwimException("broken fin");
        throw new CannotSwimException(new FileNotFoundException("Cannot find shark file"));
    }
}
