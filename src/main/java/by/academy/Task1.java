package by.academy;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class Task1 {
    public static void main(String[] args) {

        Random rand = new Random();

        List<Long> list = LongStream.generate(() -> rand.nextLong(101)).limit(100).boxed()
                .map(i -> (long) (i * Math.PI - 20)).filter(i -> i < 100).sorted().skip(3)
                .collect(Collectors.toList());

        Map<Long, String> map = list.stream().collect(Collectors.toMap
                (i -> i, j -> ("Number: " + j), (oldvalue, newvalue) -> oldvalue));

        System.out.println(map);
    }
}
