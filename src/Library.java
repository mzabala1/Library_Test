import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    private static final String book = "Book";
    private static ArrayList<Book> books = new ArrayList<>();

    private void parseFile(String fileName, String searchStr) throws FileNotFoundException{
        Scanner scan = new Scanner(new File(fileName));
        System.out.println("Information found:");
        while(scan.hasNext()){
            String line = scan.nextLine().toLowerCase().toString();
            if(line.contains(searchStr)){
                System.out.println(line);
            }
        }
    }

    private ArrayList<Book> ReadBooks(String input){
        return books;
    }

    public static void main(String[] args) {
        Library fileSearch = new Library();
        Scanner kb = new Scanner(System.in);
        System.out.printf("Enter the content you looking for: ");
        String word = kb.next();
        try {
            fileSearch.parseFile("books.txt", word);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        String cadena;
        try{
            FileReader f = new FileReader("books.txt");
            BufferedReader b = new BufferedReader(f);
            cadena = b.readLine();
            System.out.println(cadena);
            String []tasted = cadena.split(":");
            if (tasted[0].equals(book)) {

                System.out.println("Books found:");
                do{
                    System.out.println(cadena);
                } while((cadena = b.readLine()) !=null);
            }b.close();
        }catch(Exception e){e.printStackTrace();}
    }
}
