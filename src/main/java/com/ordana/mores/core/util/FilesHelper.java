package com.ordana.mores.core.util;

import com.ordana.mores.Mores;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FilesHelper {

    public static void createFolderIfMissing(String name) {
        try {
            Files.createDirectories(Paths.get(name));
        } catch (IOException e) {
            Mores.LOGGER.warn("Could not create Folder: {}", name);
        }
    }

}
