/*
SQLyog Community v11.31 (32 bit)
MySQL - 4.1.14-nt : Database - bigbazaar
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`bigbazaar` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `bigbazaar`;

/*Table structure for table `customer` */

DROP TABLE IF EXISTS `customer`;

CREATE TABLE `customer` (
  `Serial_No.` int(255) NOT NULL auto_increment,
  `Name` varchar(255) default NULL,
  `Contact_1` varchar(255) default NULL,
  `Contact_2` varchar(255) default NULL,
  `Address` varchar(255) default NULL,
  `Pic` varchar(255) default NULL,
  `Sign` varchar(255) default NULL,
  PRIMARY KEY  (`Serial_No.`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `customer` */

insert  into `customer`(`Serial_No.`,`Name`,`Contact_1`,`Contact_2`,`Address`,`Pic`,`Sign`) values (8,'Ashish','7778888','887878','hjhj','C:UsersAkatsuki OshiroDocumentsutton.css','C:UsersAkatsuki OshiroDocumentsutton.css'),(11,'Geethannbn','1212','1212','sdd','C:UsersAkatsuki OshiroDocumentsoops.css','C:UsersAkatsuki OshiroDocumentsoops.css'),(12,'sarthy','1212','1212','sdd','C:UsersAkatsuki OshiroDocumentsoops.css','C:UsersAkatsuki OshiroDocumentsoops.css'),(13,'sadaa','1212','1212','nbnm','C:UsersAkatsuki OshiroDocumentsoops.css','C:UsersAkatsuki OshiroDocumentsoops.css'),(20,'Anupma','232','232','2323','C:UsersAkatsuki OshiroDocumentsutton.css','C:UsersAkatsuki OshiroDocumentsutton.css');

/*Table structure for table `items` */

DROP TABLE IF EXISTS `items`;

CREATE TABLE `items` (
  `Serial_No.` int(255) NOT NULL auto_increment,
  `Product_Name` varchar(255) default NULL,
  `Quantity` int(11) NOT NULL default '0',
  `MRP` float NOT NULL default '0',
  `Date` varchar(255) NOT NULL default '0000-00-00 00:00:00',
  PRIMARY KEY  (`Serial_No.`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `items` */

insert  into `items`(`Serial_No.`,`Product_Name`,`Quantity`,`MRP`,`Date`) values (2,'Candy',7,0,'Tue Jan 03 09:10:09 IST 2017'),(3,'Scrubber',8,0,'Tue Jan 03 09:13:18 IST 2017'),(4,'svgdasdvj',7,0,'Tue Jan 03 15:00:27 IST 2017'),(5,'dssv',1,0,'Tue Jan 03 15:03:54 IST 2017'),(7,'Meatballs',1,100,'Wed Jan 11 17:34:41 IST 2017'),(10,'Router',1,876,'Thu Jan 12 14:51:19 IST 2017');

/*Table structure for table `orders` */

DROP TABLE IF EXISTS `orders`;

CREATE TABLE `orders` (
  `Serial_No.` varchar(255) default NULL,
  `Product_Name` varchar(255) default NULL,
  `Product_ID` varchar(255) default NULL,
  `Quantity` varchar(255) default NULL,
  `Price` varchar(255) default NULL,
  `Payment` varchar(255) default 'Pending'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `orders` */

insert  into `orders`(`Serial_No.`,`Product_Name`,`Product_ID`,`Quantity`,`Price`,`Payment`) values ('8','Meatballs','7','1','100','Successful'),('8','chicken balls','8','1','89','Successful'),('8','Ham','9','1','11','Successful'),('8','Scrubber','3','1','0','Successful'),('8','Meatballs','7','1','100','Successful'),('8','chicken balls','8','1','89','Successful'),('8','dssv','5','1','0','Successful'),('8','Chips','1','1','0','Successful'),('8','Meatballs','7','1','100','Successful'),('8','chicken balls','8','1','89','Successful'),('8','Ham','9','1','11','Successful'),('8','Chips','1','1','0','Successful'),('8','svgdasdvj','4','1','0','Successful'),('8','Scrubber','3','1','0','Successful'),('8','Meatballs','7','1','100','Successful'),('8','chicken balls','8','1','89','Successful'),('8','Candy','2','1','0','Successful'),('8','svgdasdvj','4','1','0','Successful'),('8','Meatballs','7','1','100','Successful'),('8','dssv','5','1','0','Successful'),('8','Scrubber','3','1','0','Successful'),('8','chicken balls','8','1','89','Successful'),('8','chicken balls','8','1','89','Successful'),('8','Ham','9','1','11','Successful'),('8','Chips','1','1','0','Successful'),('8','Scrubber','3','1','0','Successful'),('8','Meatballs','7','1','100','Successful'),('11','Meatballs','7','1','100','Successful'),('11','Ham','9','1','11','Successful'),('11','chicken balls','8','1','89','Successful'),('19','Meatballs','7','1','100','Successful'),('19','chicken balls','8','1','89','Successful'),('19','Ham','9','1','11','Successful'),('19','svgdasdvj','4','1','0','Successful'),('19','dssv','5','1','0','Successful'),('19','Meatballs','7','1','100','Successful'),('19','Meatballs','7','1','100','Successful'),('19','chicken balls','8','1','89','Successful'),('19','chicken balls','8','1','89','Successful'),('19','chicken balls','8','5','89','Successful'),('20','Ham','9','1','11','Successful'),('20','Router','10','1','876','Successful');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
