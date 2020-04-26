public class StreamMain{

    public static void main(String[] args){
/*
        Processor processor = new Processor();
        ExecuteSaySometching executeSaySometching = new ExecuteSaySometching();
        processor.execute(executeSaySometching);
        Executor codeToExecute = () -> System.out.println("Text from lambda form");
        processor.execute(codeToExecute);
        processor.execute(() -> System.out.println("Secound Text"));


        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        expressionExecutor.executeExpression(10, 10, (a, b) -> a + b);
        expressionExecutor.executeExpression(100, 13, (a, b) -> a / b);
        expressionExecutor.executeExpression(350, 20, (a, b) -> a * b);
        expressionExecutor.executeExpression(136, 132, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(136, 132, FunctionalCalculator::divideAByB);
        expressionExecutor.executeExpression(136, 132, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(136, 132, FunctionalCalculator::multiplyAByB);


        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Tekst pierwszy", String::toLowerCase);
        poemBeautifier.beautify("Tekst pierwszy", text -> text + " i nie ostatni");
        poemBeautifier.beautify("Tekst pierwszy", text -> text.concat(String.valueOf(text.hashCode())));
        poemBeautifier.beautify("Tekst pierwszy", text -> text.chars()
                .mapToObj(value -> Character.toString((char) value)).collect(Collectors.joining("_")));


        NumbersGenerator.generateEven(10);

        People.getList().stream()
                .map(String::toUpperCase)
                .filter(s -> s.length()>11)
                .map(s -> s.substring(0,s.indexOf(' ') + 2) + ".")
                .filter(s -> s.substring(0,1).equals("M"))
                .forEach(System.out::println);


        BookDirectory theBookDirectory = new BookDirectory();
        List<Book> theResultListOfBooks = theBookDirectory.getTheBookList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toList());

        System.out.println("# elements: " + theResultListOfBooks.size());
        theResultListOfBooks.stream()
                .forEach(System.out::println);


        Map<String, Book> theResultBook = theBookDirectory.getTheBookList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toMap(Book::getSignature, book -> book));
        System.out.println("# elements: " + theResultBook.size());
        theResultBook.entrySet().stream()
                .map(stringBookEntry -> stringBookEntry.getKey() + " # " + stringBookEntry.getValue())
                .forEach(System.out::println);


        BookDirectory theBookDirectory = new BookDirectory();
        String theResultStringOfBooks = theBookDirectory.getTheBookList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n","<<",">>"));

        System.out.println(theResultStringOfBooks);


        Forum forum = new Forum();
        Map<Integer, ForumUser> mapForumUser = forum.getForumUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> (LocalDate.now().getYear() - forumUser.getDateOfBirth().getYear()) > 20)
                .filter(forumUser -> forumUser.getNumberOfPublishedPosts() > 0)
                .collect(Collectors.toMap(ForumUser::getiD, forumUser -> forumUser));

        mapForumUser.entrySet().stream().map(entry -> entry.getKey() + " ><" + entry.getValue())
                .forEach(System.out::println);
                
 */
    }


}
