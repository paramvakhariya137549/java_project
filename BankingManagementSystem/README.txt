BANKING MANAGEMENT SYSTEM
PATH: E:\BankingManagementSystem
TECH: Java Swing + JDBC + Oracle
1) Put ojdbc11.jar in LIB
2) Edit DBConnection.java username/password
3) Run SQL: @E:\BankingManagementSystem\01_create_tables.sql
4) CMD: E: then cd E:\BankingManagementSystem
5) Compile: javac -cp ".;LIB\ojdbc11.jar" *.java
6) Run: java -cp ".;LIB\ojdbc11.jar" LoginFrame
Login: admin / admin123
Modules: Login, Dashboard, Customers, Accounts, Deposit/Withdraw, Transfer, View Customers, View Accounts, View Transactions, View Transfers, Logout.
