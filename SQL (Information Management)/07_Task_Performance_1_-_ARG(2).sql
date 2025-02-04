Create Database DB_LAB

Use  DB_LAB

Create Table CUSTOMERS (
CustomerID Bigint Primary key NOT NULL,
FirstName Varchar(50) NOT NULL,
LastName Varchar(50) NOT NULL,
Email Varchar(50) NOT NULL,
Gender Varchar(50),
Birtdate Date
);

Insert Into CUSTOMERS (CustomerID, FirstName, LastName, Email, Gender, Birtdate) Values
(311505, 'Khasmer', 'Lapitan', 'lapitan.311505@davao.sti.edu.ph', 'Male', 'March 27, 2000'),
(518334, 'Khalil', 'Aragon', 'aragon.518334@umindanao.edu.ph', 'Male', 'September 17, 2001'),
(834561, 'Lin', 'Zara', 'zaralin@hotmail.com', 'Female', 'November 02, 2003'),
(112467, 'Eira', 'Duchler', 'eira_duchler@yahoo.com', 'Female', 'February 10, 1999'),
(904218, 'Grant', 'Carlisle', 'iamgrant@yandexmail.com', 'Prefer not to say', 'December 19, 2025');

Create Table VENDORS (
VendorID Varchar(50) Primary key NOT NULL,
Name Varchar(50) NOT NULL,
ContactNum Numeric NOT NULL,
CityAddress Varchar(50)
FOREIGN KEY (VendorID) REFERENCES VENDORS(VendorID)
);

Insert Into VENDORS (VendorID, Name, ContactNum, CityAddress) Values
('V00001', 'Universal Robina Corporation', 8633-7631, 'Pasig, MM'),
('V00002', 'Liwayway Marketing Corporation', 8844-8441, 'Pasay, MM'),
('V00003', 'Monde Nissin', 7759-7500, 'Makati, MM');

Create Table PRODUCTS (
ProductId Varchar(50) Primary key NOT NULL,
Description Varchar(100),
Quantity Numeric NOT NULL,
Price Bigint,
VendorID Varchar(50),
);

Insert Into PRODUCTS (ProductId, Description, Quantity, VendorID) Values
('P000101', 'Jack `n Jill Piattos', 1000, 'V00001'), 
('P000102', 'Jack `n Jill Nova', 1000, 'V00001'),
('P001005', 'Oishi Prawn Crackers', 700, 'V00002'), 
('P030007', 'Nissin Eggnog Cookies', 850, 'V00003');

Update PRODUCTS Set Quantity += 274 Where Description = 'Jack `n Jill Nova';

Update PRODUCTS set Quantity -= 42 Where Description = 'Nissin Eggnog Cookies';

Select * From PRODUCTS Where Quantity < 1000;

Select VendorID, Description From PRODUCTS Where Quantity < 1000;

Delete From CUSTOMERS Where CustomerID = 5;

Drop Table PRODUCTS
