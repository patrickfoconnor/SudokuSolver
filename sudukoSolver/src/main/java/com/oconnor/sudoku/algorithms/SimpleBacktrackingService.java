package com.oconnor.sudoku.algorithms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import com.oconnor.sudoku.models.Board;

/**
 * The backtracking class is using a Depth-first search algorithm. This algorithm is quite simple in theory
 * It starts and guesses randomly a number for the empty cell. It continues moving forward until it finds out it's an
 * incorrect solution. When it hits a dead end, it starts all over from cell 0,0 and starts guessing again until
 * it finds a solution. With each iteration the available numbers that it can use to guess
 */
@Service("SimpleBacktrackingService")
public class SimpleBacktrackingService {
    private final Logger logger = LoggerFactory.getLogger(SimpleBacktrackingService.class);

    public void process(Board board) {
        logger.info("Enter Impl");
    }

}
