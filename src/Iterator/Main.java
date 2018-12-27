package Iterator;
import java.io.BufferedReader;
import java.io.File;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String args[]){
        Shape rectangle, circle, square;
        Collection collection = new LinkedList();

        try {
           File f = new File("src/Iterator/shape.txt");
           BufferedReader b = new BufferedReader(new FileReader(f));

           String readLine = "";

           while ((readLine = b.readLine()) != null){
               String[] parts = readLine.split(" ");
               String[] parts2;
               String first;
               String second;
               Double doubleN1;
               Double doubleN2;
               Double doubleN3;
               Double doubleN4;
               switch(parts[0])
               {
                   case "Rectangle":

                       parts2 = parts[1].split(",");
                       first = parts2[0].replace("(","" );
                       second = parts2[1].replace(")","" );

                       doubleN1 = Double.parseDouble(first);
                       doubleN2 = Double.parseDouble(second);
                       doubleN3 = Double.parseDouble(parts[2]);
                       doubleN4 = Double.parseDouble(parts[3]);
                       rectangle = new Rectangle(doubleN1,doubleN2,doubleN3,doubleN4);
                       collection.add(rectangle);
                       break;
                   case "Circle":

                       parts2 = parts[1].split(",");
                       first = parts2[0].replace("(","" );
                       second = parts2[1].replace(")","" );

                       doubleN1 = Double.parseDouble(first);
                       doubleN2 = Double.parseDouble(second);
                       doubleN3 = Double.parseDouble(parts[2]);

                       circle = new Circle(doubleN1,doubleN2,doubleN3);
                       collection.add(circle);
                       break;
                   case "Square":

                       parts2 = parts[1].split(",");
                       first = parts2[0].replace("(","" );
                       second = parts2[1].replace(")","" );

                       doubleN1 = Double.parseDouble(first);
                       doubleN2 = Double.parseDouble(second);
                       doubleN3 = Double.parseDouble(parts[2]);

                       square = new Square(doubleN1,doubleN2,doubleN3);
                       collection.add(square);
                       break;
                   default:
                       System.out.println("no match");
               }
           }
        }catch (IOException e){
            e.printStackTrace();
        }


        for(Iterator iterator1 = collection.iterator(); iterator1.hasNext(); ){
            Object temp = iterator1.next();
            System.out.println(temp);
        }

    }
}
