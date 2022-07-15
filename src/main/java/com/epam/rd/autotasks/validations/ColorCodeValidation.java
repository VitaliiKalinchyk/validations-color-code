package com.epam.rd.autotasks.validations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ColorCodeValidation {
    public static boolean validateColorCode(String color) {
        return color != null && (color.matches("^#[\\da-fA-F]{6}") || color.matches("^#[\\da-fA-F]{3}"));
    }
}





