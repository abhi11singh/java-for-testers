package com.serenitydojo.exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;

public class WordCounter {

    public int numberOfWordsIn(String value) {
        if(value==null){
            return 0;
        }
        return value.split("\\W").length;
    }

    public int numberOfWordsInFile(String fileName) throws IOException{
        try{
        String fileContents = Files.readString(Paths.get(fileName));
        int wordCount = numberOfWordsIn(fileContents);
        if (wordCount == 0){
            throw new FileHasNoWordException("No words found in the file " + fileName);
        }
        return wordCount;
        } catch (NoSuchFileException noSuchFile){
            throw new FileHasNoWordException("No words found in the non-existant file " + fileName);
        }
    }
}
