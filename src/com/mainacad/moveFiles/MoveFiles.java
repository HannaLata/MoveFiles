package com.mainacad.moveFiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.logging.Logger;


public class MoveFiles {

    private static final Logger LOGGER = Logger.getLogger(MoveFiles.class.getName());

    public static void main(String[] args) {

        try {
            Path sourcePath = Paths.get("src/com/mainacad/moveFiles/cat.jpg"),
                    destinationPath = Paths.get("src/cat.jpg");
            Files.move(sourcePath, destinationPath, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException exception) {
            LOGGER.severe("Input/Output error");
        }

    }
    }