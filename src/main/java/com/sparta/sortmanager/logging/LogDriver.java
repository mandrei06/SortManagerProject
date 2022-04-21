package com.sparta.sortmanager.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogDriver {

    public static Logger logger= LogManager.getLogger("SortManagerLogger");
    public static void main(String[] args) {

        logger.info("This is an info message");

    }
}
