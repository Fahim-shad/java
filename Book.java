public class Book {
        String title;
        String author;
        int yearofpublic;
 Book(String sub , String name,int year )
 {
    title=sub;
    author=name;
    yearofpublic=year;
}
 void mymethod(){
   System.out.println("title is ="+title);
   System.out.println("author is ="+author);
   System.out.println("yearofpublic is ="+yearofpublic);
}
public static void main(String[] args){
    Book myobj=new Book("This a math ","fahim",1969);
    System.out.println(myobj.title);
    System.out.println(myobj.author);
    System.out.println(myobj.yearofpublic);
    
}


































}
