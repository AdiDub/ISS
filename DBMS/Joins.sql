-- Retrieve orders with customer information using a normal JOIN
SELECT Orders.OrderID, Customers.FirstName, Customers.LastName
FROM Orders
JOIN Customers ON Orders.CustomerID = Customers.CustomerID;

-- Retrieve orders with customer information (Same as normal JOIN, if nothing is specified JOIN works as INNER JOIN)
SELECT Orders.OrderID, Customers.FirstName, Customers.LastName
FROM Orders
INNER JOIN Customers ON Orders.CustomerID = Customers.CustomerID;

-- Retrieve all customers and their orders (if any)
SELECT Customers.FirstName, Customers.LastName, Orders.OrderID
FROM Customers
LEFT JOIN Orders ON Customers.CustomerID = Orders.CustomerID;

-- Retrieve all orders and their associated customer information (if any)
SELECT Orders.OrderID, Customers.FirstName, Customers.LastName
FROM Orders
RIGHT JOIN Customers ON Orders.CustomerID = Customers.CustomerID;

-- Retrieve all customers and their orders (including unmatched records from both tables)
SELECT Customers.FirstName, Customers.LastName, Orders.OrderID
FROM Customers
FULL JOIN Orders ON Customers.CustomerID = Orders.CustomerID;

