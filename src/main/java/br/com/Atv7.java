package br.com;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class Atv7{
    public static void main( String[] args )
    {
        List<String> lines = null;
Path inputPath = Paths.get("meuarquivo.txt");
Path outputPath = Paths.get("meuarquivo_ordenado.txt");

try {
    lines = Files.readAllLines(inputPath, Charset.forName("UTF-8"));
} catch (IOException e) {
    System.out.println("An error occurred while reading the input file.");
    e.printStackTrace();
    return;
}

Collections.sort(lines, String.CASE_INSENSITIVE_ORDER);

try {
    Files.write(outputPath, lines);
} catch (IOException e) {
    System.out.println("An error occurred while writing to the output file.");
    e.printStackTrace();
}
    }
}