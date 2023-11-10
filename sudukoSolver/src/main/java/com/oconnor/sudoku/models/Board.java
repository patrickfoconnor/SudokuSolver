package com.oconnor.sudoku.models;

import java.awt.*;
import java.util.HashMap;

public class Board {

    private String level;

    private HashMap<Point, Integer> board;

    public Board(String level, HashMap<Point, Integer> boardMap) {
        this.level = level;
        this.board = boardMap;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public HashMap<Point, Integer> getBoard() {
        return board;
    }

    public void setBoard(HashMap<Point, Integer> board) {
        this.board = board;
    }


}