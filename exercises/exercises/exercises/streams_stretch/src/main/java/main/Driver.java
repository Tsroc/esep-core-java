package main;

import java.util.List;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import domain.Trader;
import domain.Transaction;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Driver {

    public static void main(String[] args) {
        Trader dave = new Trader("Dave", "Athlone");
        Trader jayne = new Trader("Jayne", "London");
        Trader fiona = new Trader("Fiona", "New York");
        Trader alan = new Trader("Alan", "Athlone");


        List<Transaction> transactions = Arrays.asList(
                new Transaction(alan, 2011, 300),
                new Transaction(dave, 2012, 1000),
                new Transaction(dave, 2011, 400),
                new Transaction(jayne, 2012, 710),
                new Transaction(jayne, 2012, 700),
                new Transaction(fiona, 2012, 950)
        );


    }
}
