package src;

import java.util.*;
import java.io.*;

public class DataParser {

    public static HashMap<String, Pair<String, Integer> > parseData(String filename) 
        throws IOException {
        
        BufferedReader br = new BufferedReader(new FileReader(filename));
        
        HashMap<String, Pair<String, Integer> > out = new HashMap<String, Pair<String, Integer> >();
        String[] categories = {};

        String line = "";
        boolean isCategory = true;
        while ((line = br.readLine()) != null) {            
            if (isCategory) {
                categories = line.split(",");
                for (int i = 0; i < categories.length; i++) {
                    out.put(categories[i], new Pair<String, Integer>());
                }
                isCategory = false;
            } else {
                String[] inputs = line.split(",");
                for (int i = 0; i < inputs.length; i++) {
                    Pair<String, Integer> pair = out.get(categories[i]);
                    if (pair.isNull()) {
                        pair.setFirst(inputs[i]);
                        pair.setSecond(1);
                    } else {
                        pair.setSecond(pair.getSecond()+1);
                    }
                }
            }
        }

        br.close();

        return null;
    }

    public static void main(String[] args) throws IOException {
        HashMap<String, Pair<String, Integer> > hm = parseData("bball_sample.csv");
        Iterator<String> hm = new 
    }
}

