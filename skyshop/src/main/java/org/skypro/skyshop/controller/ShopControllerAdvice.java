package org.skypro.skyshop.controller;

import org.skypro.skyshop.exception.NoSuchProductException;
import org.skypro.skyshop.exception.ShopError;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class ShopControllerAdvice {

    public ResponseEntity<ShopError> handleNoSuchProductException(IllegalArgumentException e) {
        return ResponseEntity.badRequest().body(new ShopError("400", "ПРОДУКТ НЕ НАЙДЕН"));
    }
}
