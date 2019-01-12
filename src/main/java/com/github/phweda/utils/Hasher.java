/*
 * MAME FILE MANAGER - MAME resources management tool
 * Copyright (c) 2011 - 2018.  Author phweda : phweda1@yahoo.com
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.github.phweda.utils;

/**
 * Created by IntelliJ IDEA.
 * User: phweda
 * Date: 3/27/2017
 * Time: 5:06 PM
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Create and verify File Hashes
 */
@SuppressWarnings("unused")
public class Hasher {
    private static MessageDigest sha256Digest;
    private static MessageDigest sha1Digest;

    private static final int BUFFER_SIZE = 1048576;// 2^20

    private Hasher() {
    }

    static {
        try {
            sha256Digest = MessageDigest.getInstance("SHA-256");
            sha1Digest = MessageDigest.getInstance("SHA-1");
            if (sha256Digest == null || sha1Digest == null) {
                System.out.println("Message Digest is null");
            }
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

    /**
     * Hashes files with SHA256 algorithm
     *
     * @param file File to be hashed
     * @return Hexadecimal string of the file hash
     */
    public static String getSHA256(File file) {
        try (FileInputStream inputStream = new FileInputStream(file)) {

            byte[] bytesBuffer = new byte[BUFFER_SIZE];
            int bytesRead;

            while ((bytesRead = inputStream.read(bytesBuffer)) != -1) {
                sha256Digest.update(bytesBuffer, 0, bytesRead);
            }

            byte[] hashedBytes = sha256Digest.digest();
            // Clear digest for next usage
            sha256Digest.reset();
            return byteArrayToHex(hashedBytes);
        } catch (IOException ex) {
            ex.printStackTrace();
            return "HASHING ERROR SHA256";
        }
    }

    /**
     * Hashes files with SHA1 algorithm
     *
     * @param file File to be hashed
     * @return Hexadecimal string of the file hash
     */
    public static String getSHA1(File file) {
        if (!file.exists()) {
            return "File not found";
        }
        try (FileInputStream inputStream = new FileInputStream(file)) {

            byte[] bytesBuffer = new byte[BUFFER_SIZE];
            int bytesRead;

            while ((bytesRead = inputStream.read(bytesBuffer)) != -1) {
                sha1Digest.update(bytesBuffer, 0, bytesRead);
            }

            byte[] hashedBytes = sha1Digest.digest();
            // Clear digest for next usage
            sha1Digest.reset();
            return byteArrayToHex(hashedBytes);
        } catch (IOException ex) {
            ex.printStackTrace();
            return "HASHING ERROR SHA1";
        }
    }

    private static String byteArrayToHex(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (byte aByte : bytes) {
            sb.append(Integer.toString((aByte & 0xff) + 0x100, 16)
                    .substring(1));
        }
        return sb.toString();
    }
}
