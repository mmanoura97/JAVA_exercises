Create a program that manages the user's bank accounts at a bank. Specifically, the user should have:
1) a simple account in which the user can make a deposit of a certain amount. This account should include a method that adds the deposit amount to the balance and a method for printing the account details (account type, balance, interest rate) 
2) a savings account with a specific rate. Each year interest is added to the balance of the account. This account should include a method that, based on the rate, calculates the annual interest and adds it to the balance and a method for printing the account data (account type, balance)
3) an account to check his deposits. This account should include a method that counts the user's transactions and applies a fee of 0.5 euro to the balance each time the number of transactions exceeds 3 transactions and a method for printing the account details (account type, balance, "free limit: 3 transactions")
4) the possibility to create a simple account or a savings account. 

Eventually we will:
a) i) create SA1 savings account with an initial balance of 0 and an interest rate of 0.02
   ii) deposit 1500 euro in this account and display its balance
   iii) calculate the interest, add it to the balance and display the final balance
b) i) create control account CA1 and make 4 consecutive deposits of 500 euro
   ii) display the final balance of CA1
   iii) display the balance of SA1 by overriding the toString method with an appropriate message
c) i) print a message: "What kind of account do you want to create? (1:Normal, 2:Savings)" and depending on the user's input the appropriate account will be created
   ii) print the details of the account created (polymorphic call)
d) i) create BA2, SA2, CA2 accounts (normal account, savings account and checking account)
   ii) add to the bank the accounts it has just created and print the data of all the accounts (polymorphic call)

