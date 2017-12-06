-- -----------------------------------------------------
-- Drop Database gpn
-- -----------------------------------------------------
DROP DATABASE IF EXISTS gpn;

-- -----------------------------------------------------
-- Database gpn
-- -----------------------------------------------------
CREATE DATABASE IF NOT EXISTS gpn DEFAULT CHARACTER SET utf8;

-- -----------------------------------------------------
-- User database gpn
-- -----------------------------------------------------
USE gpn;

-- -----------------------------------------------------
-- Table gpn_status
-- -----------------------------------------------------
CREATE TABLE gpn_status (
status_id INT NOT NULL AUTO_INCREMENT,
status_name VARCHAR(16) NOT NULL COMMENT 'Statuses such as Active, Inactive, In Progress, Completed, Pending, Cancel, Scheduled',
PRIMARY KEY (status_id)
) AUTO_INCREMENT = 1001;

-- -----------------------------------------------------
-- Table gpn_role
-- -----------------------------------------------------
CREATE TABLE gpn_role (
role_id INT NOT NULL AUTO_INCREMENT,
role_name VARCHAR(16) NOT NULL COMMENT 'Roles such as Super Admin, Administrator, User',
PRIMARY KEY (role_id)
) AUTO_INCREMENT = 1001;


-- -----------------------------------------------------
-- Table gpn_exec_committee
-- -----------------------------------------------------
CREATE TABLE gpn_exec_committee (
id BIGINT NOT NULL AUTO_INCREMENT,
name VARCHAR(200) NOT NULL COMMENT 'Executive committee member name',
role VARCHAR(200) NOT NULL COMMENT 'Executive committee member role',
start_date DATE COMMENT 'Member Role start date',
end_date DATE COMMENT 'Member Role end date',
status VARCHAR(200) NOT NULL COMMENT 'Executive committee member role status Active/Inactive',
PRIMARY KEY (id)
) AUTO_INCREMENT = 1001;

-- -----------------------------------------------------
-- Table gpn_side
-- -----------------------------------------------------
CREATE TABLE gpn_side (
side_id INT NOT NULL AUTO_INCREMENT,
side_name VARCHAR(2) NOT NULL COMMENT 'Side name of the Goplan Nagar',
PRIMARY KEY (side_id)
) AUTO_INCREMENT = 1001;


-- -----------------------------------------------------
-- Table gpn_road
-- -----------------------------------------------------
CREATE TABLE gpn_road (
road_id INT NOT NULL AUTO_INCREMENT,
road_name VARCHAR(2) NOT NULL COMMENT 'Road name of the Goplan Nagar',
side_id INT NOT NULL COMMENT 'Maps to gpn_side side_id',
PRIMARY KEY (road_id),
CONSTRAINT gpn_road_side_id_fk FOREIGN KEY (side_id) REFERENCES gpn_side (side_id) ON DELETE NO ACTION
) AUTO_INCREMENT = 1001;

-- -----------------------------------------------------
-- Table gpn_apartment
-- -----------------------------------------------------
CREATE TABLE gpn_apartment (
apartment_id INT NOT NULL AUTO_INCREMENT,
apartment_name VARCHAR(2) NOT NULL COMMENT 'Apartment name of the Goplan Nagar',
image_url VARCHAR(128) NOT NULL COMMENT 'Image url for the Apartment of the Gopal Nagar',
road_id INT NOT NULL COMMENT 'Maps to gpn_road road_id',
PRIMARY KEY (apartment_id),
CONSTRAINT gpn_apartment_road_id_fk FOREIGN KEY (road_id) REFERENCES gpn_road (road_id) ON DELETE NO ACTION
) AUTO_INCREMENT = 1001;

-- -----------------------------------------------------
-- Table gpn_flat
-- -----------------------------------------------------
CREATE TABLE gpn_flat (
flat_id BIGINT NOT NULL AUTO_INCREMENT,
flat_name VARCHAR(2) NOT NULL COMMENT 'Flat name or number of the apartment in Goplan Nagar',
apartment_id INT NOT NULL COMMENT 'Maps to gpn_apartment apartment_id',
PRIMARY KEY (flat_id),
CONSTRAINT gpn_flat_apartment_id_fk FOREIGN KEY (apartment_id) REFERENCES gpn_apartment (apartment_id) ON DELETE NO ACTION
) AUTO_INCREMENT = 1001;