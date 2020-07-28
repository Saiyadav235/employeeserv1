DROP TABLE IF EXISTS employee;
DROP TABLE IF EXISTS address;
 


CREATE TABLE address (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  line1 VARCHAR(250) NOT NULL,
  line2 VARCHAR(250),
  city VARCHAR(250) DEFAULT NULL	,
  state VARCHAR(250) DEFAULT NULL,
  country VARCHAR(250) DEFAULT NULL,
  zip_code INT DEFAULT NULL	  	
  
);

CREATE TABLE employee (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
  date_of_birth VARCHAR(250) DEFAULT NULL	,
    addressid INT,
    	  FOREIGN KEY (addressid) REFERENCES address(id)
    	
  
);