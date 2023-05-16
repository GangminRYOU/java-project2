package com.example.makeparser;

import java.io.*;
import java.nio.charset.Charset;
import java.util.LinkedList;
import java.util.List;

public class InputStreamLineReaders implements LineReaders{

    String fileName;
    Charset charset;
    public InputStreamLineReaders(){}
    public InputStreamLineReaders(String fileName, Charset charset){
        this.fileName = fileName;
        this.charset = charset;
    }
    @Override
    public List<String> getLines(String fileName) {
        List<String> lines = new LinkedList<>();
        try(BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)))) {
            String line;
            while((line = br.readLine()) != null){
                lines.add(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return lines;
    }
}
