CREATE DATABASE  IF NOT EXISTS `spellinglearningsystem` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `spellinglearningsystem`;
-- MySQL dump 10.13  Distrib 8.0.42, for Win64 (x86_64)
--
-- Host: localhost    Database: spellinglearningsystem
-- ------------------------------------------------------
-- Server version	8.0.42

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `teacher_data_info`
--

DROP TABLE IF EXISTS `teacher_data_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `teacher_data_info` (
  `name` varchar(45) DEFAULT NULL,
  `mobileno` varchar(45) DEFAULT NULL,
  `emailid` varchar(45) DEFAULT NULL,
  `employeeid` varchar(45) NOT NULL,
  `username` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`employeeid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `teacher_data_info`
--

LOCK TABLES `teacher_data_info` WRITE;
/*!40000 ALTER TABLE `teacher_data_info` DISABLE KEYS */;
INSERT INTO `teacher_data_info` VALUES ('Tanishka','1234567890','ajinkyashinde818@gmail.com','123r','qwerty','ajinkya45'),('Ajinkya','7058061605','ajinkyashinde818@gmail.com','45','ajinkya','ajinkya45');
/*!40000 ALTER TABLE `teacher_data_info` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `word_info`
--

DROP TABLE IF EXISTS `word_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `word_info` (
  `srno` varchar(45) NOT NULL,
  `six_character` varchar(45) DEFAULT NULL,
  `seven_character` varchar(45) DEFAULT NULL,
  `eight_character` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`srno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `word_info`
--

LOCK TABLES `word_info` WRITE;
/*!40000 ALTER TABLE `word_info` DISABLE KEYS */;
INSERT INTO `word_info` VALUES ('1','banana','amazing','creative'),('10','tomato','joyful','rainbow'),('100','tomato','kindness','engineer'),('11','camera','kindness','sandwich'),('12','dragon','loyalty','triangle'),('13','flower','magical','umbrella'),('14','hammer','natural','vacation'),('15','island','orderly','waterfall'),('16','jungle','patient','xylophone'),('17','kitten','quality','yesterday'),('18','lemon','radiant','zucchini'),('19','mirror','sincere','absolute'),('2','guitar','blanket','football'),('20','needle','talented','building'),('21','oyster','unusual','calendar'),('22','parrot','victory','daughter'),('23','quartz','willing','engineer'),('24','rocket','excited','festival'),('25','spider','forward','graceful'),('26','turtle','generous','handsome'),('27','violin','healthy','innocent'),('28','walnut','instant','javelin'),('29','yellow','jubilee','kangaroo'),('3','jacket','capable','sunshine'),('30','anchor','kinetic','lavender'),('31','bright','lantern','magazine'),('32','castle','measure','necklace'),('33','doctor','neutral','olympics'),('34','easter','october','password'),('35','frozen','penguin','quotient'),('36','golden','quietly','railroad'),('37','honest','running','seashell'),('38','insect','science','tomorrow'),('39','jigsaw','traffic','universe'),('4','laptop','curious','elephant'),('40','kiwi','unicorn','volcano'),('41','ladder','vanilla','wireless'),('42','magnet','welcome','youthful'),('43','nobody','xylitol','zeppelin'),('44','octopus','yawning','athletic'),('45','planet','zephyr','brilliant'),('46','quokka','academy','charming'),('47','raspy','balcony','delicate'),('48','school','cabinet','enormous'),('49','travel','dolphin','friendly'),('5','monkey','delight','hospital'),('50','unique','eclipse','glorious'),('51','vision','factory','historic'),('52','winter','gallery','imperial'),('53','xenon','holiday','judgment'),('54','yogurt','imagine','keyboard'),('55','zigzag','justice','laughter'),('56','artist','kingdom','musical'),('57','bubble','library','national'),('58','cookie','morning','ordinary'),('59','dollar','nothing','peaceful'),('6','orange','freedom','mountain'),('60','energy','opening','quantity'),('61','family','perfect','romantic'),('62','garden','quarter','singular'),('63','heaven','respect','terrific'),('64','impact','strange','ultimate'),('65','joyful','teacher','vertical'),('66','karate','unknown','wonderful'),('67','legacy','virtual','exciting'),('68','mother','whisper','yearbook'),('69','nature','extreme','zookeeper'),('7','pencil','genuine','notebook'),('70','oxygen','fantasy','airplane'),('71','purple','gravity','baseball'),('72','quartz','history','creative'),('73','ribbon','January','dinosaur'),('74','shadow','kinetic','exercise'),('75','temple','liberty','fireworks'),('76','urgent','mystery','goldfish'),('77','violet','November','hamburger'),('78','window','October','internet'),('79','xylene','Pacific','jellyfish'),('8','rabbit','harmony','paradise'),('80','yonder','quality','kangaroo'),('81','zipper','rainbow','lemonade'),('82','active','sunshine','mountain'),('83','beauty','Tuesday','necklace'),('84','coffee','umbrella','Olympics'),('85','danger','volcano','paradise'),('86','effort','whisper','question'),('87','global','xylophone','railroad'),('88','health','yesterday','seashell'),('89','inside','zucchini','tomorrow'),('9','silver','inspire','question'),('90','jacket','amazing','universe'),('91','kitten','blanket','vacation'),('92','lemon','capable','waterfall'),('93','mirror','curious','xylophone'),('94','needle','delight','yesterday'),('95','oyster','freedom','zucchini'),('96','parrot','genuine','absolute'),('97','quartz','harmony','building'),('98','rabbit','inspire','calendar'),('99','silver','joyful','daughter');
/*!40000 ALTER TABLE `word_info` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'spellinglearningsystem'
--

--
-- Dumping routines for database 'spellinglearningsystem'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-08-17  0:18:34
