/* Sina Khajehpour
CS 2263
Prof. Griffith
Description: read fata from json file and write data into json file format
using gson.
 */
package edu.isu.cs.cs2263;

import com.google.gson.*;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;


public class IOManager {
    //red a json file using gson
    public static Object readData(String file) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        Gson gson = new Gson();
        Object json = gson.fromJson(bufferedReader, Object.class);
        return json;
    }
    //write and data to the file by using json format
    public static String writeData(String file, List<Student> studentList) throws IOException {
        Path path = Paths.get(file);
        try (Writer wr = Files.newBufferedWriter(path, StandardCharsets.UTF_8)) {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            JsonElement tree = gson.toJsonTree(studentList);
            gson.toJson(tree, wr);
        } catch (IOException e) {
            return "File does not exist";
        }
        return "Students written to file";

    }


    public static void main(String[] args) throws IOException {
        String file = "C:\\CS2263\\hw02\\cs2263-hw02\\app\\src\\main\\java\\edu\\isu\\cs\\cs2263\\File";
    }
}




































































