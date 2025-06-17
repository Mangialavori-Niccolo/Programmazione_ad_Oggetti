package org.Niccolo.functional;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class BankAccount {
    @Getter
    @Setter
    @AllArgsConstructor
    public static class Account {
        double amount;
        double interestRate;
        LocalDateTime duePayment;

        public void applyInterest(){
            amount += amount * interestRate;
        }
    }

    public static List<Account> applyInterest(List<Account> accounts){
        return accounts.stream()
                .filter(account -> account.getDuePayment().isBefore(LocalDateTime.now()))
                .peek(Account::applyInterest)
                .sorted((Account a1, Account a2) ->  (int) a2.getAmount() - (int) a1.getAmount())
                .collect(Collectors.toList());
    }
}
