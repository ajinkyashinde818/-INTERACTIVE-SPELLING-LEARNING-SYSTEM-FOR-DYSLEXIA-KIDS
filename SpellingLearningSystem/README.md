# Interactive Spelling Learning System for Dyslexia Kids

## Overview
This project is designed to help children with dyslexia improve their spelling and word recognition skills using an **interactive learning approach**.  
It provides a child-friendly interface, teacher monitoring, and structured word exercises.

## Features
- **Interactive Word Learning:** Engaging modules with words of different lengths (6, 7, 8 characters).  
- **Database Integration:** Stores word sets and user data in MySQL.  
- **Teacher Module:** Allows teachers to monitor student progress and manage content.  
- **Child-Friendly Interface:** Simple, colorful, and accessible interface to maintain motivation.  

## Technologies Used
- **Frontend:** (if applicable, e.g., HTML/CSS/JS, or GUI Framework)  
- **Backend:** MySQL + Application Logic (Python/Java/PHP depending on your implementation)  
- **Database:** `spellinglearningsystem` (MySQL)  

## Database Setup
1. Open **MySQL Workbench** or any MySQL client.  
2. Import the provided SQL dump file:  
   ```
   DiselexiaDB.sql
   ```
   This will create the database **`spellinglearningsystem`** with the following tables:  
   - `teacher_data_info` – Stores teacher login details.  
   - `word_info` – Stores words (6, 7, and 8 characters).  

3. Verify import with:  
   ```sql
   USE spellinglearningsystem;
   SHOW TABLES;
   SELECT * FROM word_info LIMIT 10;
   ```

## How to Run
1. Import the database as explained above.  
2. Open the project source code (if provided, e.g., in Java/Python/PHP).  
3. Update your **DB connection settings** in the code (username, password, host, database name).  
4. Run the application.  

## Sample Data
The database includes **100 word records** with 6, 7, and 8 character words, e.g.:  
| srno | six_character | seven_character | eight_character |  
|------|---------------|-----------------|-----------------|  
| 1    | banana        | amazing         | creative        |  
| 2    | guitar        | blanket         | football        |  
| ...  | ...           | ...             | ...             |  

## Future Enhancements
- Add **audio pronunciation** for each word.  
- Introduce **gamification** (levels, rewards, badges).  
- Provide **multilingual support**.  

## Author
- **Name:** [Your Name]  
- **Contact:** [Your Email]  
