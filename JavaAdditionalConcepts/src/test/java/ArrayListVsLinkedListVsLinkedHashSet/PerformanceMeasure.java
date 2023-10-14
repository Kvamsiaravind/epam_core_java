package ArrayListVsLinkedListVsLinkedHashSet;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

public class PerformanceMeasure {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        Instant start=Instant.now();
        IntStream.range(1,1000000)
                .forEach(list::add);
        System.out.println("Arraylist takes time in millis:"+Duration.between(start,Instant.now()).toMillis());
        list.add(327);
        list.add(11,37);

        Instant starttime=Instant.now();
        LinkedList<Integer> linkedList=new LinkedList<>();
        IntStream.range(1,1000000)
                .forEach(linkedList::add);
        System.out.println("Linked list takes time in millis :"+Duration.between(starttime,Instant.now()).toMillis());
    }
}
