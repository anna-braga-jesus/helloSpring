package com.tastecamp.api.dto;

import ch.qos.logback.classic.Level;

public record RecipieDTO(
    String name, 
    String ingredients, 
    String preparation, 
    int time, 
    Level level ) {
    
}
