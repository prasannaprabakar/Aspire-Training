import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the file location");
        String fileLocation = sc.nextLine();
        File file = new File(fileLocation);
        System.out.println("Enter the number of lines");
        int NumOfLines = sc.nextInt();
        sc.nextLine(); //Accept the new line after int value
if(!file.exists()){
    file.createNewFile();
}
try (FileWriter fw = new FileWriter(file)){
    for(int counter=0;counter<NumOfLines;counter++){
    fw.write(sc.nextLine());
    fw.write("\n");
    }
}
        //Retrieve and print the written content
        try (BufferedReader br = new BufferedReader(new FileReader(fileLocation))) {
            for (String line; (line = br.readLine()) != null;) {
                System.out.println(line);
            }
        }
        int CountOfWords=CountOfWordsInFile(fileLocation);
        System.out.println("Total number of words in file : "+CountOfWords);
    }//end of main method
    public static int CountOfWordsInFile(String fileName){
    	int CountOfWords=0;
    	try {
    	BufferedReader br=new BufferedReader(new FileReader(fileName));
    	String lineStr=null;
    	String wordsArr[]=null;
    	while((lineStr=br.readLine())!=null){
    		wordsArr = lineStr.split(" ");
    		CountOfWords = CountOfWords +wordsArr.length;
    	}
    	br.close();
    	}
    	catch(Exception exe) {
    		exe.printStackTrace();
    		
    	}
    	return CountOfWords;
    	
    }
}

