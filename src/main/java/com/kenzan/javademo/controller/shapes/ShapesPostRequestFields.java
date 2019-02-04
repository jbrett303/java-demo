package com.kenzan.javademo.controller.shapes;

import javax.validation.constraints.NotBlank;


class ShapesPostRequestFields{
    @NotBlank(message = "Name cannot be null")
    String name;
}