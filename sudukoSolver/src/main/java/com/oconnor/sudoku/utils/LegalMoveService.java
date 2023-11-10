package com.oconnor.sudoku.utils;

import org.springframework.stereotype.Service;

import java.awt.*;

@Service
public class LegalMoveService {
    public Boolean legalColumnPlacement(Point point){
        return true;
    }
    public Boolean legalRowPlacement(Point point){
        return true;
    }
    public Boolean legalCellPlacement(Point point){
        return true;
    }
}
