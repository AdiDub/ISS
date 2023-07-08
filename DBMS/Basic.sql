-- Retrieve all columns from the Customers table
SELECT * FROM Customers;

-- Retrieve specific columns from the Orders table
SELECT OrderID, Product, Price FROM Orders;

-- Retrieve distinct values from the Category column in the Products table
SELECT DISTINCT Category FROM Products;

-- Retrieve customers with an age greater than 30
SELECT * FROM Customers WHERE Age > 30;

-- Retrieve orders with a price less than or equal to 15.00
SELECT * FROM Orders WHERE Price <= 15.00;

-- Retrieve customers with a last name of 'Smith' and age less than 40
SELECT * FROM Customers WHERE LastName = 'Smith' AND Age < 40;

-- Retrieve orders with a price greater than 20.00 or quantity equal to 2
SELECT * FROM Orders WHERE Price > 20.00 OR Quantity = 2;

-- Retrieve customers sorted by last name in descending order
SELECT * FROM Customers ORDER BY LastName DESC;

-- Retrieve products sorted by price in ascending order
SELECT * FROM Products ORDER BY Price ASC;

-- Update the phone number of a customer with ID 3
UPDATE Customers SET Phone = '+1 9999999999' WHERE CustomerID = 3;

-- Delete an order with ID 5
DELETE FROM Orders WHERE OrderID = 5;

-- SQL Injection Vulnerable query (for demonstration purposes only, not recommended in practice)
SELECT * FROM Customers WHERE LastName = 'Smith' OR 1=1;

-- Retrieve the top 3 customers with the highest salaries
SELECT TOP 3 * FROM Customers ORDER BY Salary DESC;

-- Retrieve customers whose last name starts with 'S'
SELECT * FROM Customers WHERE LastName LIKE 'S%';

-- Retrieve products with names containing 'Product' anywhere in the name
SELECT * FROM Products WHERE Name LIKE '%Product%';

-- Retrieve orders for customers with IDs 1, 3, and 5
SELECT * FROM Orders WHERE CustomerID IN (1, 3, 5);

-- Retrieve products with prices between 10.00 and 20.00
SELECT * FROM Products WHERE Price BETWEEN 10.00 AND 20.00;

-- Retrieve customers with their full name as 'FullName' alias
SELECT CustomerID, CONCAT(FirstName, ' ', LastName) AS FullName FROM Customers;

-- Retrieve products with their price multiplied by 1.1 as 'IncreasedPrice' alias
SELECT ProductID, Price * 1.1 AS IncreasedPrice FROM Products;

-- Retrieve a combined result set of customers and suppliers
SELECT CustomerID, FirstName, LastName
FROM Customers
UNION
SELECT SupplierID, Name, NULL
FROM Suppliers;

-- Create a new table with customer information
SELECT CustomerID, FirstName, LastName
INTO NewCustomers
FROM Customers;

-- Insert a new record into the Customers table
INSERT INTO Customers (CustomerID, FirstName, LastName, Email, Phone)
VALUES (6, 'Emma', 'Johnson', 'emma.johnson@example.com', '+1 5555555555');

-- Create a table with a CHECK constraint on the Age column
CREATE TABLE Employees (
  EmployeeID INT PRIMARY KEY,
  FirstName VARCHAR(50),
  LastName VARCHAR(50),
  Age INT CHECK (Age >= 18 AND Age <= 65)
);

-- Create a table with a DEFAULT constraint on the Country column
CREATE TABLE Customers (
  CustomerID INT PRIMARY KEY,
  FirstName VARCHAR(50),
  LastName VARCHAR(50),
  Country VARCHAR(50) DEFAULT 'Unknown'
);

-- Create an index on the ProductName column of the Products table
CREATE INDEX idx_ProductName ON Products (ProductName);

-- Drop a table named Customers
DROP TABLE Customers;

-- Add a new column to the Customers table
ALTER TABLE Customers
ADD COLUMN Address VARCHAR(100);

-- Create a table with an auto-incrementing primary key
CREATE TABLE Employees (
  EmployeeID INT AUTO_INCREMENT PRIMARY KEY,
  FirstName VARCHAR(50),
  LastName VARCHAR(50)
);

-- Create a view to retrieve customer names and their orders
CREATE VIEW CustomerOrders AS
SELECT Customers.FirstName, Customers.LastName, Orders.OrderID, Orders.Product
FROM Customers
JOIN Orders ON Customers.CustomerID = Orders.CustomerID;

-- Retrieve the total order count for each customer
SELECT CustomerID, COUNT(OrderID) AS OrderCount
FROM Orders
GROUP BY CustomerID;

-- Retrieve customers with more than 5 orders
SELECT CustomerID, COUNT(OrderID) AS OrderCount
FROM Orders
GROUP BY CustomerID
HAVING COUNT(OrderID) > 5;
