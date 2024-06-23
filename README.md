# Simple ATM System

This repository contains a simple ATM (Automated Teller Machine) system implemented in Java. It simulates basic banking operations such as withdrawal, deposit, and balance inquiry.

## Features

- **Withdrawal**: Allows users to withdraw funds from their account.
- **Deposit**: Enables users to deposit funds into their account.
- **Balance Check**: Allows users to check their current account balance.
- **Simple Console Interface**: User-friendly console-based interface for interaction.

## Usage Notes

- **Account Number**: Enter your account number to proceed.
- **Transactions**: Follow the prompts to perform withdrawals, deposits, or balance checks.
- **Exit**: Option 4 exits the program.

## Example

```plaintext
---------------------------------------
        Welcome to SBI Bank ATM        
---------------------------------------
Account No: 1234567890
---------------------------------------

---------------------------------------
              SBI ATM Menu             
---------------------------------------
Please select a transaction:
1. Withdraw
2. Deposit
3. Check Balance
4. Exit
---------------------------------------
Enter your Choice: 1
---------------------------------------

Please enter the amount to be withdrawn: Rs.5000

---------------------------------------
            SBI ATM Receipt            
---------------------------------------
Date       : 2024-06-23
Time       : 13:45:30
Account No.: 1234567890
Transaction: Withdrawal
Amount     : Rs.5000.0
---------------------------------------
Remaining Balance: Rs.5000.0
---------------------------------------
      Thank you for using SBI Bank     
---------------------------------------

---------------------------------------
              SBI ATM Menu             
---------------------------------------
Please select a transaction:
1. Withdraw
2. Deposit
3. Check Balance
4. Exit
---------------------------------------
Enter your Choice: 3
---------------------------------------

---------------------------------------
            SBI ATM Receipt            
---------------------------------------
Date       : 2024-06-23
Time       : 13:45:45
Account No.: 1234567890
Transaction: Balance Check
---------------------------------------
Current Balance: Rs.5000.0
---------------------------------------
      Thank you for using SBI Bank     
---------------------------------------

