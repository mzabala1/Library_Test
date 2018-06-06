import java.util.ArrayList;

public class Book {
    //Constructor
    public Book(ArrayList<String> Authors, String Title, String Publisher, int PublicationYear ) {
        if(Authors == null && Title == null && Publisher == null && PublicationYear ==  0) {
            throw new IllegalArgumentException("Can't be null");
        }
        if(Authors.isEmpty() && Title.isEmpty() && Publisher.isEmpty() && PublicationYear == 0) {
            throw new IllegalArgumentException("Can't be empty");
        }
    }
}
