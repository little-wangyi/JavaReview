package Collection_.List_;

import java.util.ArrayList;
import java.util.List;

public class ListExercise2 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Book("三国",100,"罗贯中"));
        list.add(new Book("红楼梦",9,"曹雪芹"));
        list.add(new Book("水浒传",80,"施耐庵"));
        list.add(new Book("西游记",10,"吴承恩"));
        sort(list);
        for(Object book:list){
            System.out.println(book.toString());
        }
    }


    public static void sort(List list){
        for (int i = 0; i < list.size()-1; i++) {
            for (int j = 0; j < list.size()-1-i; j++) {
                Book b1 = (Book)list.get(j);
                Book b2 = (Book)list.get(j+1);
                if(b1.getPrice() > b2.getPrice()){
                    list.set(j+1,b1);
                    list.set(j,b2);
                }
            }
        }
    }
}
class Book{
    private String name;
    private int price;
    private String author;

    public Book(String name, int price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "书名：" + name + "\t\t" + "价格：" + price + "\t\t" + "作者：" + author + "\n";
    }
}
