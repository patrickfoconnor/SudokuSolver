package com.oconnor.sudoku;

import com.oconnor.sudoku.models.Board;
import com.oconnor.sudoku.algorithms.SimpleBacktrackingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import java.awt.*;
import java.util.HashMap;
import java.util.Random;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SudukoSolverApplication implements CommandLineRunner {
    @Autowired
    SimpleBacktrackingService simpleBacktrackingService;

    public static void main(String[] args) {
        SpringApplication.run(SudukoSolverApplication.class, args);
    }


    public void run(String... args) {
        //TODO will be the location in which another service will translate board from img to 2d array
        // Create new empty board that will be solved
        //TODO temp board for use at some point probably switch to a 1d array for
        HashMap<Point,Integer> boardMap = getTestBoard();

        randomizeBoard(boardMap);

        Board board = new Board("easy", boardMap);

        simpleBacktrackingService.process(board);
    }

    private void randomizeBoard(HashMap<Point, Integer> boardMap) {
        for (Point point:boardMap.keySet()) {
            Random random = new Random();
            int randInt = random.nextInt(0,100);
            if (randInt < 10){
                boardMap.put(point, -1);
            }

        }

    }


    public HashMap<Point,Integer> getTestBoard(){
        HashMap<Point, Integer> boardMap = new HashMap<>();

        // Row 1
        boardMap.put(new Point(0,0), 8);
        boardMap.put(new Point(1,0), 3);
        boardMap.put(new Point(2,0), 5);
        boardMap.put(new Point(3,0), 4);
        boardMap.put(new Point(4,0), 1);
        boardMap.put(new Point(5,0), 6);
        boardMap.put(new Point(6,0), 6);
        boardMap.put(new Point(7,0), 9);
        boardMap.put(new Point(8,0), 7);

        // Row 2
        boardMap.put(new Point(0,1), 2);
        boardMap.put(new Point(1,1), 9);
        boardMap.put(new Point(2,1), 6);
        boardMap.put(new Point(3,1), 8);
        boardMap.put(new Point(4,1), 5);
        boardMap.put(new Point(5,1), 7);
        boardMap.put(new Point(6,1), 4);
        boardMap.put(new Point(7,1), 3);
        boardMap.put(new Point(8,1), 1);

        // Row 3
        boardMap.put(new Point(0,2), 4);
        boardMap.put(new Point(1,2), 1);
        boardMap.put(new Point(2,2), 7);
        boardMap.put(new Point(3,2), 2);
        boardMap.put(new Point(4,2), 9);
        boardMap.put(new Point(5,2), 3);
        boardMap.put(new Point(6,2), 6);
        boardMap.put(new Point(7,2), 5);
        boardMap.put(new Point(8,2), 8);

        // Row 4
        boardMap.put(new Point(0,3), 5);
        boardMap.put(new Point(1,3), 6);
        boardMap.put(new Point(2,3), 9);
        boardMap.put(new Point(3,3), 1);
        boardMap.put(new Point(4,3), 3);
        boardMap.put(new Point(5,3), 4);
        boardMap.put(new Point(6,3), 7);
        boardMap.put(new Point(7,3), 8);
        boardMap.put(new Point(8,3), 2);

        // Row 5
        boardMap.put(new Point(0,4), 1);
        boardMap.put(new Point(1,4), 2);
        boardMap.put(new Point(2,4), 3);
        boardMap.put(new Point(3,4), 6);
        boardMap.put(new Point(4,4), 7);
        boardMap.put(new Point(5,4), 8);
        boardMap.put(new Point(6,4), 5);
        boardMap.put(new Point(7,4), 4);
        boardMap.put(new Point(8,4), 2);

        // Row 6
        boardMap.put(new Point(0,5), 7);
        boardMap.put(new Point(1,5), 4);
        boardMap.put(new Point(2,5), 8);
        boardMap.put(new Point(3,5), 5);
        boardMap.put(new Point(4,5), 2);
        boardMap.put(new Point(5,5), 9);
        boardMap.put(new Point(6,5), 1);
        boardMap.put(new Point(7,5), 6);
        boardMap.put(new Point(8,5), 3);

        // Row 7
        boardMap.put(new Point(0,6), 6);
        boardMap.put(new Point(1,6), 5);
        boardMap.put(new Point(2,6), 2);
        boardMap.put(new Point(3,6), 7);
        boardMap.put(new Point(4,6), 8);
        boardMap.put(new Point(5,6), 1);
        boardMap.put(new Point(6,6), 3);
        boardMap.put(new Point(7,6), 9);
        boardMap.put(new Point(8,6), 4);

        // Row 8
        boardMap.put(new Point(0,7), 9);
        boardMap.put(new Point(1,7), 8);
        boardMap.put(new Point(2,7), 1);
        boardMap.put(new Point(3,7), 3);
        boardMap.put(new Point(4,7), 4);
        boardMap.put(new Point(5,7), 5);
        boardMap.put(new Point(6,7), 2);
        boardMap.put(new Point(7,7), 7);
        boardMap.put(new Point(8,7), 6);

        // Row 9
        boardMap.put(new Point(0,8), 3);
        boardMap.put(new Point(1,8), 7);
        boardMap.put(new Point(2,8), 4);
        boardMap.put(new Point(3,8), 9);
        boardMap.put(new Point(4,8), 6);
        boardMap.put(new Point(5,3), 2);
        boardMap.put(new Point(6,8), 8);
        boardMap.put(new Point(7,8), 1);
        boardMap.put(new Point(8,8), 5);

        return boardMap;
    }

}
