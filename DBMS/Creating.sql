/* Creating tables for practicing SQL concepts */
CREATE TABLE Customers (
  CustomerID INT PRIMARY KEY,
  FirstName VARCHAR(50),
  LastName VARCHAR(50),
  Email VARCHAR(100),
  Phone VARCHAR(20)
);

CREATE TABLE Orders (
  OrderID INT PRIMARY KEY,
  CustomerID INT,
  Product VARCHAR(50),
  Quantity INT,
  Price DECIMAL(10, 2),
  FOREIGN KEY (CustomerID) REFERENCES Customers(CustomerID)
);

CREATE TABLE Products (
  ProductID INT PRIMARY KEY,
  Name VARCHAR(50),
  Category VARCHAR(50),
  SupplierID INT,
  Price DECIMAL(10, 2),
  FOREIGN KEY (SupplierID) REFERENCES Suppliers(SupplierID)
);

CREATE TABLE Suppliers (
  SupplierID INT PRIMARY KEY,
  Name VARCHAR(50),
  Address VARCHAR(100),
  City VARCHAR(50),
  Country VARCHAR(50)
);

/* Inserting sample data for practicing SQL concepts */
INSERT INTO Customers (CustomerID, FirstName, LastName, Email, Phone)
VALUES
  (1, 'John', 'Doe', 'john.doe@example.com', '+1 1234567890'),
  (2, 'Jane', 'Smith', 'jane.smith@example.com', '+1 9876543210'),
  (3, 'Michael', 'Johnson', 'michael.johnson@example.com', '+1 5555555555'),
  (4, 'Emily', 'Brown', 'emily.brown@example.com', '+1 8888888888'),
  (5, 'Daniel', 'Wilson', 'daniel.wilson@example.com', '+1 7777777777');

INSERT INTO Orders (OrderID, CustomerID, Product, Quantity, Price)
VALUES
  (1, 1, 'Product A', 2, 19.99),
  (2, 2, 'Product B', 1, 9.99),
  (3, 3, 'Product C', 3, 14.99),
  (4, 4, 'Product A', 1, 19.99),
  (5, 5, 'Product B', 2, 9.99);

INSERT INTO Products (ProductID, Name, Category, SupplierID, Price)
VALUES
  (1, 'Product A', 'Category X', 1, 19.99),
  (2, 'Product B', 'Category Y', 2, 9.99),
  (3, 'Product C', 'Category Z', 1, 14.99),
  (4, 'Product D', 'Category X', 3, 24.99),
  (5, 'Product E', 'Category Y', 2, 12.99),
  (6, 'Product F', 'Category Z', 1, 17.99),
  (7, 'Product G', 'Category X', 3, 22.99);

INSERT INTO Suppliers (SupplierID, Name, Address, City, Country)
VALUES
  (1, 'Supplier X', '123 Main St', 'City A', 'Country X'),
  (2, 'Supplier Y', '456 Oak St', 'City B', 'Country Y'),
  (3, 'Supplier Z', '789 Elm St', 'City C', 'Country Z'),
  (4, 'Supplier W', '321 Pine St', 'City D', 'Country W'),
  (5, 'Supplier V', '654 Maple St', 'City E', 'Country V'),
  (6, 'Supplier U', '987 Cedar St', 'City F', 'Country U'),
  (7, 'Supplier T', '210 Walnut St', 'City G', 'Country T');
