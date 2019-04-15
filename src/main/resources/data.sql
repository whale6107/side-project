INSERT INTO app_role (id, role_name, description) VALUES (1, 'STANDARD_USER', 'Standard User - Has no admin rights');
INSERT INTO app_role (id, role_name, description) VALUES (2, 'ADMIN_USER', 'Admin User - Has permission to perform admin tasks');

-- USER
-- non-encrypted password: jwtpass
INSERT INTO app_user (id, first_name, last_name, password, username) VALUES (1, 'James', 'Bond', '821f498d827d4edad2ed0960408a98edceb661d9f34287ceda2962417881231a', 'john.doe');
INSERT INTO app_user (id, first_name, last_name, password, username) VALUES (2, 'Admin', 'Admin', '821f498d827d4edad2ed0960408a98edceb661d9f34287ceda2962417881231a', 'admin.admin');


INSERT INTO user_role(user_id, role_id) VALUES(1,1);
INSERT INTO user_role(user_id, role_id) VALUES(2,1);
INSERT INTO user_role(user_id, role_id) VALUES(2,2);

INSERT INTO product (id, name, price, picture_url ) VALUES (1L, 'TV Set', 300.00, 'http://placehold.it/200x100');
INSERT INTO product (id, name, price, picture_url ) VALUES (2L, 'Game Console', 200.00, 'http://placehold.it/200x100');
INSERT INTO product (id, name, price, picture_url ) VALUES (3L, 'Sofa', 100.00, 'http://placehold.it/200x100');
INSERT INTO product (id, name, price, picture_url ) VALUES (4L, 'Icecream', 5.00, 'http://placehold.it/200x100');
INSERT INTO product (id, name, price, picture_url ) VALUES (5L, 'Beer', 3.00, 'http://placehold.it/200x100');
INSERT INTO product (id, name, price, picture_url ) VALUES (6L, 'Phone', 500.00, 'http://placehold.it/200x100');
INSERT INTO product (id, name, price, picture_url ) VALUES (7L, 'Watch', 30.00, 'http://placehold.it/200x100');

