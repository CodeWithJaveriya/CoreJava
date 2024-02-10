class BooksTester{

   public static void main(String study[]){
   
   Books books = new Books();
   books.name = "To kill a mocking Bird";
   books.type = "Motivation";
   books.author = "Harper Lee";
   books.noOfPages = 234;
   books.price = 400;
   books.gainKnowledge();
   System.out.println("First book is");
   System.out.println(books.name + " " + books.type + " " + books.author + " " + books.noOfPages + " " + books.price);
   
   Books books1 = new Books();
   books1.name = "Pride and Prejudice";
   books1.type = "Motivation";
   books1.author = "Jane Austin";
   books1.noOfPages = 300;
   books1.price = 600;
   books1.gainKnowledge();
   System.out.println("Second book is");
   System.out.println(books1.name + " " + books1.type + " " + books1.author + " " + books1.noOfPages + " " + books1.price);
   
   Books books2 = new Books();
   books2.name = "Pride and Prejudice";
   books.type = "Motivation";
   books2.author = "Jane Austin";
   books2.noOfPages = 300;
   books2.price = 600;
   books2.gainKnowledge();
   System.out.println("Third book is");
   System.out.println(books2.name + " " + books2.type + " " + books2.author + " " + books2.noOfPages + " " + books2.price);
   
   Books books3 = new Books();
   books3.name = "Atomic Habits";
   books3.type = "Habits/ Self - discipline";
   books3.author = "James Clear";
   books3.noOfPages = 500;
   books3.price = 250;
   books3.gainKnowledge();
   System.out.println("Fourth book is");
   System.out.println(books3.name + " " + books3.type + " " + books3.author + " " + books3.noOfPages + " " + books3.price);
   
   Books books4 = new Books();
   books4.name = "Rich Dad Poor Dad";
   books4.type = "Motivation";
   books4.author = "Robert T Kiyosaki";
   books4.noOfPages = 300;
   books4.price = 600;
   books4.gainKnowledge();
   System.out.println("Fifth book is");
   System.out.println(books4.name + " " + books4.type + " " + books4.author + " " + books4.noOfPages + " " + books4.price);
   
   Books books5 = new Books();
   books5.name = "Romeo and Juliet";
   books5.type = "Love Story";
   books5.author = "William Shaksphere";
   books5.noOfPages = 970;
   books5.price = 670;
   books5.gainKnowledge();
   System.out.println("Sixth book is");
   System.out.println(books5.name + " " + books5.type + " " + books5.author + " " + books5.noOfPages + " " + books5.price);
   
   Books books6 = new Books();
   books6.name = "The Lord Of Rings";
   books6.type = "Horror";
   books6.author = "J R R Tolkien";
   books6.noOfPages = 908;
   books6.price = 776;
   books6.gainKnowledge();
   System.out.println("Seventh book is");
   System.out.println(books6.name + " " + books6.type + " " + books6.author + " " + books6.noOfPages + " " + books6.price);
   
   Books books7 = new Books();
   books7.name = "The Great Gatsby";
   books7.type = "History";
   books7.author = "F Gautz Fitzgerland";
   books7.noOfPages = 300;
   books7.price = 600;
   books7.gainKnowledge();
   System.out.println("Eighth book is");
   System.out.println(books7.name + " " + books7.type + " " + books7.author + " " + books7.noOfPages + " " + books7.price);
   
   Books books8 = new Books();
   books8.name = "Animal Farm";
   books8.type = "Animals";
   books8.author = "George Orwell";
   books8.noOfPages = 368;
   books8.price = 680;
   books8.gainKnowledge();
   System.out.println("Ninth book is");
   System.out.println(books8.name + " " + books8.type + " " + books8.author + " " + books8.noOfPages + " " + books8.price);
   
   Books books9 = new Books();
   books9.name = "The Dairy of Young Girl";
   books9.type = "Motivation";
   books9.author = "Anne Frank";
   books9.noOfPages = 370;
   books9.price = 450;
   books9.gainKnowledge();
   System.out.println("Tenth book is");
   System.out.println(books9.name + " " + books9.type + " " + books9.author + " " + books9.noOfPages + " " + books9.price);
   }

}