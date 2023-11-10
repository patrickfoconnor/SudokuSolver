package com.oconnor.sudoku.utils;

import ch.qos.logback.classic.Logger;

public class LoggingConfig {
    public static void setLoggingLevel(ch.qos.logback.classic.Level level) {
        ch.qos.logback.classic.Logger root = (ch.qos.logback.classic.Logger) org.slf4j.LoggerFactory.getLogger(Logger.ROOT_LOGGER_NAME);
        root.setLevel(level);
    }
}