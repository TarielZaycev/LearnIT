package com.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.io.File;
import java.io.IOException;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
//        File directory = new File("D:\\Projects_dop");
//        Arrays.stream(directory.listFiles()).forEach(f -> System.out.println(f.getAbsolutePath()));


//        for(File arr: directory.listFiles()){
//            System.out.println(arr.getAbsolutePath());
//        }

        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
        Map<String, Object> jsonMap = mapper.readValue(new File("D:\\Projects_dop\\правило_абонентская_плата.yml"), Map.class);
        String pretty = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonMap);

        System.out.println(pretty);
//        mapper.findAndRegisterModules();
//        Story story = mapper.readValue(new File("D:\\Projects_dop\\правило_абонентская_плата.yml"), Story.class);
//
//        String pretty = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(story);
//        System.out.println(pretty);

    }
}
