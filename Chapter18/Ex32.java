/*
Exercise 32: (4) Using a Map<String,Integer> and the
net.mindview.util.TextFile utility, write a program that counts the occurrence of words
in a file (use "\\W+" as the second argument to the TextFile constructor). Store the results
as an XML file.
 */
package Chapter18;

import java.io.*;
import java.util.*;
import nu.xom.*;
import Textfile.TextFile;

public class Ex32 {
    public static Map<String,Integer> countWords(String fn) {
        System.out.println("Counting the occurrence of words in the file \"" + fn + "\":");
        String filename = "src//" + fn;
        Map<String,Integer> map = new TreeMap<>();
        ArrayList<String> listOfWords = new TextFile(filename,"\\W++");
        Iterator<String> it = listOfWords.iterator();
        while(it.hasNext()) {
            String word = it.next();
            if(!(map.containsKey(word))) {
                map.put(word, 1);
            }
            else {
                int counter = map.get(word);
                map.put(word, ++counter);
            }
        }
        return map;
    }

    public static void format(OutputStream os, Document doc) throws Exception {
        Serializer serializer = new Serializer(os, "Windows-250");
        serializer.setIndent(4);
        serializer.setMaxLength(60);
        serializer.write(doc);
        serializer.flush();
    }

    public static void main(String[] args) {
        if(args.length != 1) {
            System.out.println("Usage: Enter name of the file to count");
            System.exit(1);
        }
        Map<String,Integer> words = countWords(args[0]);
        System.out.println(words);
        System.out.println();
        Element root = new Element("words");
        Iterator it = words.entrySet().iterator();
        while(it.hasNext()) {
            @SuppressWarnings("unchecked")
            Map.Entry<String, Integer> entry = (Map.Entry<String, Integer>)it.next();
            Element word = new Element("word");
            word.appendChild(entry.getKey());
            word.appendChild(": ");
            word.appendChild(entry.getValue().toString());
            root.appendChild(word);
        }
        Document doc = new Document(root);
        try {
            format(System.out, doc);
            format(new BufferedOutputStream(new FileOutputStream(new File("src/Chapter18_words.xml"))), doc);
        }catch(Exception e) {
            e.printStackTrace();
        }

    }
}
// The program is still having some bugs because I've not properly installed the XOM library
// which is required for the program to run effectively.

// However, I have downloaded the package but still having issues trying to properly install it.