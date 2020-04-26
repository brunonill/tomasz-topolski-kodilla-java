import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.ExecuteSaySometching;
import com.kodilla.stream.lambda.Executor;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.reference.FunctionalCalculator;

import java.util.stream.Collectors;

public class StreamMain{

    public static void main(String[] args){

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

    }

}


