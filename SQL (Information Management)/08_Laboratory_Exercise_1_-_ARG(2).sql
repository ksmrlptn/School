Create Database GALLERY

Use GALLERY

Create Table USERS (
UserID Bigint Primary key NOT NULL,
UserName Varchar(50) NOT NULL,
DateCreated Date
);

Insert into USERS (UserID, UserName, DateCreated) Values
(001, 'sparsley0', '2019-02-19'),
(002, 'dsumshon', '2018-12-24'),
(003, 'hpointing2', '2018-12-11'),
(004, 'smannagh3', '2018-08-05'),
(005, 'gstarsmore4', '2018-07-09'),
(006, 'dzuann5', '2019-01-09');

Create Table PICTURES (
PictureID Bigint Primary key NOT NULL,
Filename Varchar(50),
UserID Bigint NOT NULL,
DateCreated Date,
);

Insert into PICTURES (PictureID, Filename, UserID, DateCreated) Values
(1001, 'laptop.jpeg', 003, '2019-02-07'),
(1002, 'sti_orca.jpeg', 007, '2019-09-04'),
(1003, 'home.jpeg', 005, '2019-02-16'),
(1004, 'bsit,jpeg', 001, '2019-10-19');

/* INNER JOIN */
Select USERS.UserName, PICTURES.Filename from USERS inner join PICTURES on USERS.UserName = PICTURES.Filename;

/* LEFT JOIN */
Select USERS.UserName, PICTURES.Filename from USERS left join PICTURES on USERS.UserName = PICTURES.Filename;

/* RIGHT JOIN */
Select USERS.UserName, PICTURES.Filename from USERS right join PICTURES on USERS.UserName = PICTURES.Filename;

/* FULL JOIN */
Select USERS.UserName, PICTURES.Filename from USERS full join PICTURES on USERS.UserName = PICTURES.Filename;