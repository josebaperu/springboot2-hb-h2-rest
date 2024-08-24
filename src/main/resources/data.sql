CREATE TABLE contact (
                         id varchar(255),
                         name varchar(255)
);

INSERT INTO contact (id, name) VALUES ('1', 'Contact 1');
INSERT INTO contact (id, name) VALUES ('2', 'Contact 2');
INSERT INTO contact (id, name) VALUES ('3', 'Contact 3');
INSERT INTO contact (id, name) VALUES ('4', 'Contact 4');


CREATE TABLE patient (
                         id varchar(255),
                         name varchar(255),
                         contact_id int null
);

INSERT INTO patient (id, name,contact_id) VALUES ('1', 'carlos',1);
INSERT INTO patient (id, name,contact_id) VALUES ('2', 'fran',1);
INSERT INTO patient (id, name,contact_id) VALUES ('3', 'luis',2);
INSERT INTO patient (id, name,contact_id) VALUES ('4', 'miguel',2);





CREATE TABLE financial_status (
                                  id varchar(255),
                                  name varchar(255)
);

INSERT INTO financial_status (id, name) VALUES ('1', 'Approved');
INSERT INTO financial_status (id, name) VALUES ('2', 'Outstanding');
INSERT INTO financial_status (id, name) VALUES ('3', 'Average');
INSERT INTO financial_status (id, name) VALUES ('4', 'Poor');