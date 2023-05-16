package com.example.makeparser;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReadFileEx {
    LineReaders lr;
    Charset charset;
    public ReadFileEx(LineReaders lr){
        this.lr = lr;
    }

    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
       ReadFileEx rfe = new ReadFileEx(new InputStreamLineReaders());
       List<String> result = rfe.lr.getLines("C:/Users/dbrkd/Downloads/hospital_info_0920_utf8/hospital_info_0920_utf8.csv");
       long end = System.currentTimeMillis();
       List<Hospital> hospitals = rfe.parseHospitals(result);
       for(Hospital h : hospitals){
           System.out.printf("%s %s %s", h.getName(),h.getWebSiteAddr(), h.getAddress().getFullAddr());
           System.out.println();
       }
      System.out.println(end - start);
    }
    public Hospital parse(String str){
        System.out.println(str);
        Pattern p = Pattern.compile("http?s:[\\w|\\/|\\\\.]+,$");
        String webAddr;
        try {
            Matcher m = p.matcher(str);
            webAddr = m.group();
        }catch(IllegalStateException e){
            webAddr = "";
        }
        String[] splitted = str.split(",");
        System.out.println();
        System.out.println(Arrays.toString(splitted));
        Address address = new Address(splitted[10], splitted[5], splitted[7]);
        Hospital hospital = new Hospital(splitted[1], webAddr, address);
        return hospital;
    }
    public List<Hospital> parseHospitals(List<String> lines){
        List<Hospital> hospitals = new ArrayList<>();
        for(String line : lines){
            hospitals.add(parse(line));
        }
        return hospitals;
    }
}
