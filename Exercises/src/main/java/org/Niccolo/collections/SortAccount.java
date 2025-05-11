package org.Niccolo.collections;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;
import java.util.List;

public class SortAccount {
    @AllArgsConstructor
    @Getter
    public static class Account {
        double amount;
        double interestRate;
        LocalDate duePayment;
    }

    public static void sortByAmount(List<Account> accounts) {
        accounts.sort((a1, a2) -> Double.compare(a1.getAmount(), a2.getAmount()));
    }

    public static void sortByInterestRate(List<Account> accounts){
        accounts.sort((a1, a2) -> Double.compare(a1.getInterestRate(), a2.getInterestRate()));
    }

    public static void sortByDuePayment(List<Account> accounts){
        accounts.sort((a1, a2) -> a1.getDuePayment().compareTo(a2.getDuePayment()));
    }
}
