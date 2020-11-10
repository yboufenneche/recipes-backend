package com.recipes.errors;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
class IngredienteNotFoundAdvice {

  @ResponseBody
  @ExceptionHandler(IngredientNotFoundException.class)
  @ResponseStatus(HttpStatus.NOT_FOUND)
  String ingredientNotFoundHandler(IngredientNotFoundException ex) {
    return ex.getMessage();
  }
}