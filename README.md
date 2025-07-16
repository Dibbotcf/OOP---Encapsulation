# BankAccount Encapsulation Example in Java

## Overview

This project demonstrates the Object-Oriented Programming (OOP) concept of **Encapsulation** using a simple banking domain example.

The `BankAccount` class encapsulates the state of a bank account by:

- Keeping the account holder's name and balance **private**,
- Providing **public methods** to safely access and modify the account balance,
- Implementing **validation logic** to prevent invalid operations like negative deposits or overdrawing,
- Hiding internal implementation details from the user.

## Files

- `BankAccount.java` — Contains the encapsulated `BankAccount` class with private fields and public getters/setters.
- `Main.java` — Demonstrates usage of the `BankAccount` class including deposits, withdrawals, and printouts of account summary.

## Concepts Demonstrated

- **Encapsulation:** Restricting direct access to fields by declaring them private, controlling interactions via methods.
- **Data Hiding:** Protecting the integrity of the balance and account holder's name.
- **Validation:** Ensuring only valid deposit and withdrawal operations modify the balance.
- **Method-based access:** Working with account data only through defined public methods.

## How to Run

1. Compile both files:

