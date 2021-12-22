/*
 * MIT License

Copyright (c) 2019 simibubi

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
 *
 * https://github.com/Creators-of-Create/Create/blob/858fbd5c1a12f620fa83f69abff038d771681b8a/src/main/java/com/simibubi/create/foundation/utility/ShippedResourcePacks.java
 *
 */

package com.ordana.mores.core.util;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ShippedResourcePacks {

    public static void extractFiles(String... packs) {
        FilesHelper.createFolderIfMissing("resourcepacks");

        for (String name : packs) {
            InputStream folderInJar = ShippedResourcePacks.class.getResourceAsStream("/opt_in/" + name + ".zip");

            try {
                Files.copy(folderInJar, Paths.get("resourcepacks/" + name + ".zip"));
            } catch (FileAlreadyExistsException e) {
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                folderInJar.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}